/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Employee.EmployeeDirectory;
import model.Person.PatientsDirectory;
import model.Role.Role;
import model.Users.UsersDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author sahithigaddam
 */
public abstract class Organization {
    private String organizationName;
    private WorkQueue workQueue;
    private EmployeeDirectory listOfEmployees;
    private UsersDirectory listOfUsers;
    private PatientsDirectory listOfPatients;
    private int organizationId;
    private static int count=0;
    private OrganizationType organizationType;

    
    public enum OrganizationType{
        MedicalCare("Medical"), 
        MedicalDiagnostics("Diagnostics"), 
        MedicalFacilities("Facilities"),
        BloodManagement("Blood Management"),
        PoliciesFinance("Policies and Finance"),
        MedicalAwarnessCampaign("Awarness Event"),
        User("User"),
        Physician("Physio Therapist");
        
        private String type;
        private OrganizationType(String type) {
            this.type = type;
        }
        public String getValue() {
            return type;
        }
    }

    public Organization(String name) {
        this.organizationName = name;
        workQueue = new WorkQueue();
        listOfEmployees = new EmployeeDirectory();
        listOfUsers = new UsersDirectory();
        listOfPatients=new PatientsDirectory();
        organizationId = count;
        ++count;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(EmployeeDirectory listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public UsersDirectory getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(UsersDirectory listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public PatientsDirectory getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(PatientsDirectory listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organization.count = count;
    }

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }
    
    @Override
    public String toString() {
        return organizationName;
    }
}
