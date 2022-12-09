/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Waitlist;

import model.Person.Patients;

/**
 *
 * @author sahithigaddam
 */
public class Waitlist implements Comparable<Waitlist>{
    private Patients patient;
    private String urgency;
    private String blood;
    private int patientWaitlist;
    private int rank;

    public Waitlist() {
    }

    public Waitlist(Patients patient, String urgency, String blood, int patientWaitlist, int rank) {
        this.patient = patient;
        this.urgency = urgency;
        this.blood = blood;
        this.patientWaitlist = patientWaitlist;
        this.rank = rank;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public int getPatientWaitlist() {
        return patientWaitlist;
    }

    public void setPatientWaitlist(int patientWaitlist) {
        this.patientWaitlist = patientWaitlist;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    @Override
    public int compareTo(Waitlist w) {
        int comparewaitlist=((Waitlist)w).getPatientWaitlist();
        /* For Ascending order*/
        return this.patientWaitlist-comparewaitlist;
    }
}
