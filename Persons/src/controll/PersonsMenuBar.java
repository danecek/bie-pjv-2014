/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javafx.scene.control.MenuBar;

/**
 *
 * @author danecek
 */
public class PersonsMenuBar extends MenuBar {

    public PersonsMenuBar() {
        getMenus().add(new PersonsMenu());
    }
    
    
}
