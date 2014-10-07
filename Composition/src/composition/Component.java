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
public abstract class Component {

    public abstract double area();
    public abstract String compToString();
    public abstract void visitedBy(Visitor visitor);

}
