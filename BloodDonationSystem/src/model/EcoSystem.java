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
import model.Waitlist.Wait;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sindhurabandaru
 */
public class EcoSystem extends Organization{
    private static EcoSystem businessName;
    private ArrayList<Network> networkListDirectory;
    private ArrayList<Donors> donorListDirectory;
    private ArrayList<Wait> waitListDirectory;
    int patientId;
    int employeeId;
    int donorId;
    
    public static EcoSystem getInstance(){
        if(businessName==null){
            businessName=new EcoSystem();
        }
        return businessName;
    }
    
    
    public Donor createDonor(String donorName, int donorAge, String donorSex, String donorBloodGroup, String donorContactAddress, String donorAddress,
                String donorEmail, String donorPOC, String donorPOCNum, boolean organAvalailabity,List<String >organsList){
        
        Donors donorList = new Donors();
        donorList.setdName(donorName);
        donorList.setdAge(donorAge);
        donorList.setdGender(donorSex);
        donorList.setdBloodGroup(donorBloodGroup);
        donorList.setContact(donorContactAddress);
        donorList.setdAddress(donorAddress);
        donorList.setdEmail(donorEmail);
        donorList.setpName(donorPOC);
        donorList.setpContact(donorPOCNum);
        donorList.setOrganList(organsList);
        donorListDirectory.add(donorList);
        return donorList;
    }
    
    public ArrayList<Donors> getDonorListDirectory() {
        return donorListDirectory;
    }

    public void setDonorDirectory(ArrayList<Donors> donorListDirectory) {
        this.donorListDirectory = donorListDirectory;
    }

    public static EcoSystem getBusinessName() {
        return businessName;
    }

    public static void setBusinessName(EcoSystem businessName) {
        EcoSystem.businessName = businessName;
    }

    public ArrayList<Network> getNetworkListDirectory() {
        return networkListDirectory;
    }

    public void setNetworkListDirectory(ArrayList<Network> networkListDirectory) {
        this.networkListDirectory = networkListDirectory;
    }

    public ArrayList<Donors> getDonorListDirectory() {
        return donorListDirectory;
    }

    public void setDonorListDirectory(ArrayList<Donors> donorListDirectory) {
        this.donorListDirectory = donorListDirectory;
    }

    public ArrayList<Wait> getWaitListDirectory() {
        return waitListDirectory;
    }

    public void setWaitListDirectory(ArrayList<Wait> waitListDirectory) {
        this.waitListDirectory = waitListDirectory;
    }
    
    public void addWaitlist(Wait waitList){
        waitListDirectory.add(waitList);
        JOptionPane.showMessageDialog(null, "Patient is added to the national waitlist");
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
        for(Network network:networkListDirectory){
            if(network.getName().equals(networkName)){
                return network;
            }
        }
        return null;
    }
    
    public void deleteNetwork(Network network){
        networkListDirectory.remove(network);
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkListDirectory.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkListDirectory=new ArrayList<Network>();
        donorListDirectory = new ArrayList<Donors>();
        popDonor();
    }
    
    //todo
    void popDonor(){
        
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        
        //todo
        for(Network network:networkListDirectory){
            
        }
        return true;
    }
    
}
