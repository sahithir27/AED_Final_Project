/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Employee.Employee;
import model.Role.SystemAdmin;
import model.Users.Users;

/**
 *
 * @author sindhurabandaru
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        Employee employeeList = ecoSystem.getListOfEmployees().createEmployee(1, "sysadmin");
        Users userAdminList  = ecoSystem.getListOfUsers().createUserAccount("sysadmin", "sysadmin", employeeList, new SystemAdmin());
        
        return ecoSystem;
    }
    
}
