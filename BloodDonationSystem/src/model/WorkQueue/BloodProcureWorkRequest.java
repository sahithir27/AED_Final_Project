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
public class BloodProcureWorkRequest extends WorkRequest{
    
    private ArrayList<String> listOfBloodTypes = new ArrayList<>();
    Patients patient;
    String team;

    public ArrayList<String> getListOfBloodTypes() {
        return listOfBloodTypes;
    }

    public void setListOfBloodTypes(ArrayList<String> listOfBloodTypes) {
        this.listOfBloodTypes = listOfBloodTypes;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
