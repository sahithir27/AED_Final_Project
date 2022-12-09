/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;
import model.Person.Patients;

/**
 *
 * @author sahithigaddam
 */
public class WaitlistWorkRequest extends WorkRequest{
    Patients patient;
    private ArrayList<String> listOfOrgans = new ArrayList<>();

    public WaitlistWorkRequest(Patients patient) {
        this.patient = patient;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public ArrayList<String> getListOfOrgans() {
        return listOfOrgans;
    }

    public void setListOfOrgans(ArrayList<String> listOfOrgans) {
        this.listOfOrgans = listOfOrgans;
    }
    
}
