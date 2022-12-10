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
 * @author sahithigaddam
 */
public class Users {
    
    private String userName;
    private String userPassword;
    private Employee employee;
    private Role userRole;
    private WorkQueue workQueue;
    private String phoneNumber;
    private String userAddress;
    private String qualifications;
    private String userProfile;
    private int age;
    private String gender;
    private boolean isUserAvailable;
    private boolean isUserAvailableforBloodDonation;

    
    public Users() {
        workQueue = new WorkQueue();
    }

    public Users(String userName, String userPassword, Employee employee, Role userRole, WorkQueue workQueue, 
            String phoneNumber, String userAddress, String qualifications, String userProfile, int age, String gender, 
            boolean isUserAvailable, boolean isUserAvailableforBloodDonation) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.employee = employee;
        this.userRole = userRole;
        this.workQueue = workQueue;
        this.phoneNumber = phoneNumber;
        this.userAddress = userAddress;
        this.qualifications = qualifications;
        this.userProfile = userProfile;
        this.age = age;
        this.gender = gender;
        this.isUserAvailable = isUserAvailable;
        this.isUserAvailableforBloodDonation = isUserAvailableforBloodDonation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
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

    public boolean isIsUserAvailable() {
        return isUserAvailable;
    }

    public void setIsUserAvailable(boolean isUserAvailable) {
        this.isUserAvailable = isUserAvailable;
    }

    public boolean isIsUserAvailableforBloodDonation() {
        return isUserAvailableforBloodDonation;
    }

    public void setIsUserAvailableforBloodDonation(boolean isUserAvailableforBloodDonation) {
        this.isUserAvailableforBloodDonation = isUserAvailableforBloodDonation;
    }

    
    
        

    
    
    
     @Override
    public String toString() {
        return userName;
    }
    
}

