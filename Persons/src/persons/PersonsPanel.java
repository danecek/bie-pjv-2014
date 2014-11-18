/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persons;

import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Person;
import model.PersonsDAO;

/**
 *
 * @author danecek
 */
public class PersonsPanel extends TitledPane {
    
    public static PersonsPanel instance = new PersonsPanel();

    TableView table = new TableView();

    private PersonsPanel() {
        setText("Persons Table");
        setContent(table);
        TableColumn<Person, Integer> idCol = new TableColumn<Person, Integer>("Id");
        idCol.setCellValueFactory(new PropertyValueFactory<Person, Integer>("id"));

        TableColumn<Person, String> nameCol = new TableColumn<Person, String>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));

        table.getColumns().addAll(idCol, nameCol);
        table.setItems(FXCollections.observableList(PersonsDAO.instance.getAll()));
    }
    
    public void refresh() {
        table.getItems().clear();
        table.getItems().add(PersonsDAO.instance.getAll());
    }

}
