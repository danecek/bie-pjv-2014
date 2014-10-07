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
public class AreaVisitor implements Visitor {
    
    double totalArea;

    @Override
    public void visitRect(Rect rect) {
        totalArea += rect.area();
    }

    @Override
    public void visitCircle(Circle circ) {
        totalArea += circ.area();
    }

    @Override
    public void visitContainer(Container rect) {
    }
    
    
}
