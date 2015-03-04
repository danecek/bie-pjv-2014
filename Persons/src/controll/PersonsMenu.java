/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javafx.scene.control.Menu;

/**
 *
 * @author danecek
 */
public class PersonsMenu extends Menu {

    public PersonsMenu() {
        super("Persons");
        getItems().addAll(AddPersonAction.instance.createMenuItem());
    }
    
}
