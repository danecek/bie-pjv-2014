/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class AddPersonDialog extends Stage {

    Button cancelButton = new Button("Cancel");
    Button okButton = new Button("OK");
    TextField nameTf = new TextField();

    GridPane createInterior() {
        GridPane gp = new GridPane();
        gp.add(new Label("Name"), 0, 0);
        gp.add(nameTf, 0, 1);
        return gp;
    }

    HBox createButtons() {
        HBox hb = new HBox(okButton, cancelButton);

        hb.setAlignment(Pos.BASELINE_RIGHT);
        return hb;
    }

    public AddPersonDialog() {
        okButton.setOnAction(new OkHadler(this));
        cancelButton.setOnAction(
                new CancelHadler(this)
        );

        this.centerOnScreen();
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        VBox vbox = new VBox(createInterior(), createButtons());
//        vbox.getChildren().add(createButtons());
        Scene s = new Scene(vbox);
        setScene(s);
        setTitle("Add Person");
        show();
    }

}
