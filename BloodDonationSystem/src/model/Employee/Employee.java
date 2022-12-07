/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

/**
 *
 * @author sahithigaddam
 */
public class Employee {
    
    private String employeeName;
    private int employeeId;

    public Employee() {
    }
    
    public Employee(int employeeId){
        this.employeeId = employeeId;
    }

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    @Override
    public String toString() {
        return employeeName;
    }
}
