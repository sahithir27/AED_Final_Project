/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sindhurabandaru
 */
public class UsersDirectory {
    
    
        private ArrayList<Users> accountList;

        public UsersDirectory() {
            accountList = new ArrayList();
        }

    public ArrayList<Users> getAccountList() {
        return accountList;
    }
    
    public Users authenticateUser(String username, String password){
        for (Users ua : accountList)
            if (ua.getuName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
        public Users createUserAccount(String name, String password, Employee emp, Role userRole ){
                Users account = new Users();
                account.setuName(name);
                account.setPassword(password);
                account.setEmployee(emp);
                account.setRole(userRole);
                if(accountList.contains(account)){
                    JOptionPane.showMessageDialog(null, "Username Already Exists Please try anothe username");
                }else{
                    accountList.add(account);
            }
                    return account;
    }
    
    public Users createUserAccount(String username, String password,String contact,String add,String qualification, String gender,
            boolean availabile, int age, Employee emp, Role userRole,boolean bloodAvailability){
        Users Account = new Users();
        Account.setuName(username);
        Account.setPassword(password);
        Account.setEmployee(emp);
        Account.setRole(userRole);
        Account.setContact(contact);
        Account.setUserAddress(add);
        Account.setAge(age);
        Account.setGender(gender);
        Account.setUserIsAvailable(availabile);
        Account.setQualifications(qualification);
        Account.setUserIsAvailableforOrganDonation(bloodAvailability);
        accountList.add(Account);
        return Account;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Users ua : accountList){
            if (ua.getuName().equals(username))
                return false;
        }
        return true;
    }

    public void createUserAccount(String userName, String password, String contact, 
            String address, String qualification, String file_path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
