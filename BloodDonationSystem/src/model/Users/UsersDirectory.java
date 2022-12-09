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
    
        private ArrayList<Users> listOfUsers;

        public UsersDirectory() {
            listOfUsers = new ArrayList();
        }

    public ArrayList<Users> getAccountList() {
        return listOfUsers;
    }
    
    public Users authenticateUser(String username, String password){
        for (Users user : listOfUsers)
            if (user.getUserName().equals(username) && user.getUserPassword().equals(password)){
                return user;
            }
        return null;
    }
    
        public Users createUserAccount(String name, String password, Employee emp, Role userRole ){
                Users user = new Users();
                user.setUserName(name);
                user.setUserPassword(password);
                user.setEmployee(emp);
                user.setUserRole(userRole);
                if(listOfUsers.contains(user)){
                    JOptionPane.showMessageDialog(null, "Username Already Exists");
                }else{
                    listOfUsers.add(user);
            }
                    return user;
    }
    
    public Users createUserAccount(String username, String password,String contact,String add,String qualification, String gender,
            boolean availabile, int age, Employee emp, Role userRole,boolean bloodAvailability){
        Users user = new Users();
        user.setUserName(username);
        user.setUserPassword(password);
        user.setEmployee(emp);
        user.setUserRole(userRole);
        user.setPhoneNumber(contact);
        user.setUserAddress(add);
        user.setAge(age);
        user.setGender(gender);
        user.setIsUserAvailable(availabile);
        user.setQualifications(qualification);
        user.setIsUserAvailableforBloodDonation(bloodAvailability);
        listOfUsers.add(user);
        return user;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Users user : listOfUsers){
            if (user.getUserName().equals(username))
                return false;
        }
        return true;
    }

    public void createUserAccount(String userName, String password, String contact, 
            String address, String qualification, String file_path) {
        throw new UnsupportedOperationException("Not supported Yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}