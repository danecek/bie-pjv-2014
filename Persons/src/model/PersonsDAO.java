/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author danecek
 */
public class PersonsDAO {
    
    public static PersonsDAO instance = new PersonsDAO();

    private SortedMap<Integer, Person> persons = new TreeMap<>();
    int counter;

    private PersonsDAO() {
        create("John");
        create("Mary");
    }

    public void create(String name) {
        Person p = new Person(++counter, name);
        persons.put(p.getId(), p);
    }
    
    public List<Person> getAll() {
        return new ArrayList<>(persons.values());
    }

}
