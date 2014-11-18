/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tooltip;

/**
 *
 * @author danecek
 */
public abstract class AbstractPersonAction implements EventHandler<ActionEvent>{

    protected String name;
    Tooltip tt;
    boolean disable;

    public AbstractPersonAction(String name, String toolTip) {
        this.name = name;
        tt = new Tooltip(toolTip);

    }

    public MenuItem createMenuItem() {
        MenuItem mi = new MenuItem(name);
        mi.setOnAction(this);
        return mi;
    }

    public Button createButton() {
        Button btn = new Button(name);
        btn.setTooltip(tt);
        btn.setOnAction(this);
        return btn;
    }

    @Override
    public abstract void handle(ActionEvent t);

}
