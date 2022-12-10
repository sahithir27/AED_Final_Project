/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.Person.Patients;

/**
 *
 * @author sahithigaddam
 */
public class BloodMatchWorkRequest extends WorkRequest{
    String team;
    String bloodType;
    Patients bloodDonor;
    Patients bloodRecepient;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Patients getBloodDonor() {
        return bloodDonor;
    }

    public void setBloodDonor(Patients bloodDonor) {
        this.bloodDonor = bloodDonor;
    }

    public Patients getBloodRecepient() {
        return bloodRecepient;
    }

    public void setBloodRecepient(Patients bloodRecepient) {
        this.bloodRecepient = bloodRecepient;
    }
}
