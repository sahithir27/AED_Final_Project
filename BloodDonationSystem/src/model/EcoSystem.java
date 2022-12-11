/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Role.Role;
import model.Person.Donors;
import model.Network.Network;
import model.Organization.Organization;
import model.Role.SystemAdmin;
import model.Waitlist.Waitlist;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author sindhurabandaru
 */
public class EcoSystem extends Organization{
    private static EcoSystem businessName;
    private ArrayList<Network> networkList;
    private ArrayList<Donors> listOfDonors;
    private ArrayList<Waitlist> waitList;
    int patientId;
    int employeeId;
    int donorId;
    
    public static EcoSystem getInstance(){
        if(businessName==null){
            businessName=new EcoSystem();
        }
        return businessName;
    }
    
    
    public Donors createDonor(String donorName, int donorAge, String donorSex, String donorBloodGroup, String donorContactAddress, String donorAddress,
                String donorEmail, String donorPOC, String donorPOCNum, boolean bloodAvalailabity,List<String >bloodTypeList){
        
        Donors donor = new Donors();
        donor.setDonorName(donorName);
        donor.setDonorAge(donorAge);
        donor.setDonorGender(donorSex);
        donor.setDonorBloodGroup(donorBloodGroup);
        donor.setContact(donorContactAddress);
        donor.setDonorAddress(donorAddress);
        donor.setDonorEmail(donorEmail);
        donor.setEmergencyName(donorPOC);
        donor.setEmergencyContact(donorPOCNum);
        donor.setBloodTypeList(bloodTypeList);
        listOfDonors.add(donor);
        return donor;
    }
    
    public void setListOfDonors(ArrayList<Donors> listOfDonors) {
        this.listOfDonors = listOfDonors;
    }

    public static EcoSystem getBusinessName() {
        return businessName;
    }

    public static void setBusinessName(EcoSystem businessName) {
        EcoSystem.businessName = businessName;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public ArrayList<Donors> getListOfDonors() {
        return listOfDonors;
    }

    public ArrayList<Waitlist> getWaitList() {
        return waitList;
    }

    public void setWaitList(ArrayList<Waitlist> waitList) {
        this.waitList = waitList;
    }
    
    public void addWaitlist(Waitlist wait_list){
        waitList.add(wait_list);
        JOptionPane.showMessageDialog(null, "Patient is added to the waitlist");
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public void incrementPatientId() {
        patientId++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void incrementEmployeeId() {
        employeeId++;
    }
    
    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }
    
    public void incrementDonorId() {
        donorId++;
    }
    
    public Network getNetworkByName(String networkName){
        for(Network network:networkList){
            if(network.getName().equals(networkName)){
                return network;
            }
        }
        return null;
    }
    
    public void deleteNetwork(Network network){
        networkList.remove(network);
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdmin ());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        listOfDonors = new ArrayList<Donors>();
        popDonor();
    }
    
    //todo
    void popDonor(){
        
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getListOfUsers().checkIfUsernameIsUnique(userName)){
            return false;
        }
        
        //todo
        for(Network network:networkList){
            
        }
        return true;
    }
    
}
