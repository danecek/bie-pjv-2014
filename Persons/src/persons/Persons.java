/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persons;

import controll.AddPersonAction;
import controll.PersonsMenuBar;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class Persons extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        ToolBar tb = new ToolBar(AddPersonAction.instance.createButton());

        VBox vbox = new VBox(new PersonsMenuBar(), tb,  PersonsPanel.instance);

        Scene scene = new Scene(vbox, 300, 250);

        primaryStage.setTitle("Persons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
