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
public class Container extends Component {
    
    Component[] components;

    public Container(Component ... components) {
        this.components = components;
    }

    @Override
    public double area() {
        double a = 0;
        for (Component c : components) {
           a += c.area();
        }
        return a;
    }

    @Override
    public String compToString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < components.length - 1; i++) {
           sb.append(components[i].compToString()).append(", ");
        }
        if (components.length > 0)
           sb.append(components[components.length - 1].compToString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public void visitedBy(Visitor visitor) {
        visitor.visitContainer(this);
        for (Component c : components)
          c.visitedBy(visitor);
    }
    
}
