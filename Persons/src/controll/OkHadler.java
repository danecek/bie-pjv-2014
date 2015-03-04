/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.PersonsDAO;
import persons.PersonsPanel;

/**
 *
 * @author danecek
 */
public class OkHadler implements EventHandler<ActionEvent>{
    
    AddPersonDialog apd;

    public OkHadler(AddPersonDialog apd) {
        this.apd = apd;
    }

    @Override
    public void handle(ActionEvent t) {
        PersonsDAO.instance.create(apd.nameTf.getText());
        apd.hide();
        PersonsPanel.instance.refresh();
    }
    
}
