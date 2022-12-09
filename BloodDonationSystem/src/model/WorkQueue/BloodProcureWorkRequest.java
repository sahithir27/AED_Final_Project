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
    
    private ArrayList<String> listOfOrgans = new ArrayList<>();
    Patients patient;
    String team;

    public BloodProcureWorkRequest(Patients patient, String team) {
        this.patient = patient;
        this.team = team;
    }

    public ArrayList<String> getListOfOrgans() {
        return listOfOrgans;
    }

    public void setListOfOrgans(ArrayList<String> listOfOrgans) {
        this.listOfOrgans = listOfOrgans;
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
