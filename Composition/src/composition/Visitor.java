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
public interface Visitor {

    void visitRect(Rect rect);

    void visitCircle(Circle rect);

    void visitContainer(Container rect);

}
