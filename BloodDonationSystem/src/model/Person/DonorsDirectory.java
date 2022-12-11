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
public class DonorsDirectory {
    private ArrayList<Donors> donorsList;

    public DonorsDirectory() {
        donorsList = new ArrayList();
    }

    public ArrayList<Donors> getDonorsList() {
        return donorsList;
    }
    
    public Donors createDonor(int id, String donorName, int age, String gender, String bloodGroup, String contact,
            String address, String sign, String email, 
            String emergencyPOC, String emergencyPOC_Num, boolean isBloodAvailable){
        Donors donor = new Donors();
        donor.setDonorId(id);
        donor.setDonorName(donorName);
        donor.setDonorAge(age);
        donor.setDonorGender(gender);
        donor.setDonorBloodGroup(bloodGroup);
        donor.setContact(contact);
        donor.setDonorAddress(address);
        donor.setDonorEmail(email);
        donor.setEmergencyName(emergencyPOC);
        donor.setEmergencyContact(emergencyPOC_Num);
        donorsList.add(donor);
        return donor;
    }
}
