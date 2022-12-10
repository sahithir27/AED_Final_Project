/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Person;

import java.util.ArrayList;
import java.util.List;
import model.BloodType.BloodType;

/**
 *
 * @author varshareddykumbham
 */
public class Donors {
    private int donorId;
    private String donorName;
    private int donorAge;
    private String donorGender;
    private String donorBloodGroup;
    private String contact;
    private String donorAddress;
    private String donorCity;
    private String donorEmail;
    private String date;
    private String network;
    private String emergencyName;
    private String emergencyContact;
    private boolean isBloodAvailibility;
    List<String> bloodTypeList;
    private ArrayList<BloodType> bloodtypeDirectory = new ArrayList<BloodType>();

    public Donors() {
    }

    public Donors(int donorId, String donorName, int donorAge, String donorGender, String donorBloodGroup, String contact, String donorAddress, String donorCity, String donorEmail, String date, String network, String emergencyName, String emergencyContact) {
        this.donorId = donorId;
        this.donorName = donorName;
        this.donorAge = donorAge;
        this.donorGender = donorGender;
        this.donorBloodGroup = donorBloodGroup;
        this.contact = contact;
        this.donorAddress = donorAddress;
        this.donorCity = donorCity;
        this.donorEmail = donorEmail;
        this.date = date;
        this.network = network;
        this.emergencyName = emergencyName;
        this.emergencyContact = emergencyContact;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }

    public String getDonorBloodGroup() {
        return donorBloodGroup;
    }

    public void setDonorBloodGroup(String donorBloodGroup) {
        this.donorBloodGroup = donorBloodGroup;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public boolean isIsBloodAvailibility() {
        return isBloodAvailibility;
    }

    public void setIsBloodAvailibility(boolean isBloodAvailibility) {
        this.isBloodAvailibility = isBloodAvailibility;
    }

    public List<String> getBloodTypeList() {
        return bloodTypeList;
    }

    public void setBloodTypeList(List<String> bloodTypeList) {
        this.bloodTypeList = bloodTypeList;
    }

    public ArrayList<BloodType> getBloodtypeDirectory() {
        return bloodtypeDirectory;
    }

    public void setBloodtypeDirectory(ArrayList<BloodType> bloodtypeDirectory) {
        this.bloodtypeDirectory = bloodtypeDirectory;
    }
}
