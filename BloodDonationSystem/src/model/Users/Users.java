/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Users;

import model.Employee.Employee;
import model.Role.Role;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author sindhurabandaru
 */
public class Users {
    
    private String uName;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private String contact;
    private String userAddress;
    private String qualifications;
    private String profile;
    private int age;
    private String gender;
    private boolean userIsAvailable;
    private boolean userIsAvailableforOrganDonation;
    
    public Users() {
        workQueue = new WorkQueue();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isUserIsAvailable() {
        return userIsAvailable;
    }

    public void setUserIsAvailable(boolean userIsAvailable) {
        this.userIsAvailable = userIsAvailable;
    }

    public boolean isUserIsAvailableforOrganDonation() {
        return userIsAvailableforOrganDonation;
    }

    public void setUserIsAvailableforOrganDonation(boolean userIsAvailableforOrganDonation) {
        this.userIsAvailableforOrganDonation = userIsAvailableforOrganDonation;
    }
    
    
    
    
     @Override
    public String toString() {
        return uName;
    }
    
}
