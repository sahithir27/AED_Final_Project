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
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory listOfEmployees;
    private UsersDirectory listOfUsers;
    private PatientsDirectory listOfPatients;
    private int orgID;
    private static int count=0;
    private OrganizationType organizationType;

    
    public enum OrganizationType{
        Medical("Medical"), 
        Diagnostics("Diagnostics"), 
        Facilities("Facilities"),
        OrganManagement("Organ Management"),
        PoliciesFinance("Policies and Finance"),
        AwarnessCampaign("Awarness Campaign"),
        User("User"),
        Therapist("Therapist");
        private String type;
        private OrganizationType(String type) {
            this.type = type;
        }
        public String getValue() {
            return type;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        listOfEmployees = new EmployeeDirectory();
        listOfUsers = new UsersDirectory();
        listOfPatients=new PatientsDirectory();
        orgID = count;
        ++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
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
        return name;
    }
}
