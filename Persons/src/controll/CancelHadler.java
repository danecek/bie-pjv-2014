/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author danecek
 */
public class CancelHadler implements EventHandler<ActionEvent>{
    
    AddPersonDialog apd;

    public CancelHadler(AddPersonDialog apd) {
        this.apd = apd;
    }

    @Override
    public void handle(ActionEvent t) {
        apd.hide();
    }
    
}
