/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Person;

import java.util.ArrayList;

/**
 *
 * @author varshareddykumbham
 */
public class Patients {
    private int patientId;
    private String patientName;
    private String patientAge;
    private String gender;
    private String contact;
    private String speciality;
    private String doctor;
    private boolean isAlive;
    private boolean isDonor;
    private boolean isDirectDonation;
    private ArrayList<String> bloodTypeList;
    private ArrayList<String> testDataList;

    public Patients() {
    }

    public Patients(int patientId, String patientName, String patientAge, String gender, String contact, String speciality,
            String doctor, boolean isAlive, boolean isDonor, boolean isDirectDonation, ArrayList<String> bloodTypeList, 
            ArrayList<String> testDataList) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.gender = gender;
        this.contact = contact;
        this.speciality = speciality;
        this.doctor = doctor;
        this.isAlive = isAlive;
        this.isDonor = isDonor;
        this.isDirectDonation = isDirectDonation;
        this.bloodTypeList = bloodTypeList;
        this.testDataList = testDataList;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isIsDonor() {
        return isDonor;
    }

    public void setIsDonor(boolean isDonor) {
        this.isDonor = isDonor;
    }

    public boolean isIsDirectDonation() {
        return isDirectDonation;
    }

    public void setIsDirectDonation(boolean isDirectDonation) {
        this.isDirectDonation = isDirectDonation;
    }

    public ArrayList<String> getBloodTypeList() {
        return bloodTypeList;
    }

    public void setBloodTypeList(ArrayList<String> bloodTypeList) {
        this.bloodTypeList = bloodTypeList;
    }

    public ArrayList<String> getTestDataList() {
        return testDataList;
    }

    public void setTestDataList(ArrayList<String> testDataList) {
        this.testDataList = testDataList;
    }
    
    
    
}
