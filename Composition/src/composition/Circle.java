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
public class Circle extends Component {
    
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
       return Math.PI * radius * radius; 
    }

    @Override
    public String compToString() {
        return "(" + radius + ")";
    }

    @Override
    public void visitedBy(Visitor visitor) {
        visitor.visitCircle(this);
    }
    
}
