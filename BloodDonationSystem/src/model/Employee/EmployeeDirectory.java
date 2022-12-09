/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

import java.util.ArrayList;

/**
 *
 * @author sahithigaddam
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> listOfEmployees;

    public EmployeeDirectory() {
        listOfEmployees = new ArrayList();
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }
    
    public Employee createEmployee(int employeeId,String employeeName){
        Employee employee = new Employee(employeeId);
        employee.setEmployeeName(employeeName);
        listOfEmployees.add(employee);
        return employee;
    }
}
