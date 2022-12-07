/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author varshareddykumbham
 */
public class PersonDirectory {
    List<Person> listOfPersons;
    
    
    PersonDirectory(){
       listOfPersons = new ArrayList<Person>();
    }

    public PersonDirectory(List<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }

    public List<Person> getListOfPersons() {
        return listOfPersons;
    }

    public void setListOfPersons(List<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }
    
    
}
