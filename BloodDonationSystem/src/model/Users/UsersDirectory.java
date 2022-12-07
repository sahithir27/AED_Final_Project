/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Users;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Employee.Employee;
import model.Role.Role;

/**
 *
 * @author sahithigaddam
 */
public class UsersDirectory {
    
    
        private ArrayList<Users> listOfAccounts;

        public UsersDirectory() {
            listOfAccounts = new ArrayList();
        }

    public ArrayList<Users> getAccountList() {
        return listOfAccounts;
    }
    
    public Users authenticateUser(String username, String password){
        for (Users user : listOfAccounts)
            if (user.getUserName().equals(username) && user.getUserPassword().equals(password)){
                return user;
            }
        return null;
    }
    
        public Users createUserAccount(String username, String password, Employee employee, Role userRole ){
                Users user = new Users();
                user.setUserName(username);
                user.setUserPassword(password);
                user.setEmployee(employee);
                user.setUserRole(userRole);
                if(listOfAccounts.contains(user)){
                    JOptionPane.showMessageDialog(null, "Username Already Exists");
                }else{
                    listOfAccounts.add(user);
            }
                    return user;
    }
    
    public Users createUserAccount(String username, String userpassword,String phoneNumber,String address,String qualification, String gender,
            boolean isUserAvailabile, int age, Employee emp, Role userRole,boolean bloodAvailability){
        Users Account = new Users();
        Account.setUserName(username);
        Account.setUserPassword(userpassword);
        Account.setEmployee(emp);
        Account.setUserRole(userRole);
        Account.setPhoneNumber(phoneNumber);
        Account.setUserAddress(address);
        Account.setAge(age);
        Account.setGender(gender);
        Account.setIsUserAvailable(isUserAvailabile);
        Account.setQualifications(qualification);
        Account.setIsUserAvailableforOrganDonation(bloodAvailability);
        listOfAccounts.add(Account);
        return Account;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Users users : listOfAccounts){
            if (users.getUserName().equals(username))
                return false;
        }
        return true;
    }

    public void createUserAccount(String userName, String password, String contact, 
            String address, String qualification, String file_path) {
        throw new UnsupportedOperationException("Unsupported Operation"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

