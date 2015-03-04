/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javafx.event.ActionEvent;

/**
 *
 * @author danecek
 */
public class AddPersonAction extends AbstractPersonAction {

    public AddPersonAction() {
        super("Add Person", "Open Dialog");
    }

    public static AddPersonAction instance = new AddPersonAction();


    @Override
    public void handle(ActionEvent t) {
        new AddPersonDialog();
    }

}
