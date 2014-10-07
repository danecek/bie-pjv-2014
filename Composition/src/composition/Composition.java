/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author danecek
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container c = new Container(new Rect(1, 1), new Circle(3));
        Component root = new Container(new Rect(1, 2), new Rect(3, 4),  c);
        System.out.println(root.area());
        System.out.println(root.compToString());
        
        AreaVisitor av = new AreaVisitor();
        root.visitedBy(av);
        System.out.println(av.totalArea);
    }

}
