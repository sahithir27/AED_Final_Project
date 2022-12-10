/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Physicist;
import model.Role.Role;

/**
 *
 * @author sahithigaddam
 */
public class DiagnosticCenter extends Organization {

    public DiagnosticCenter(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new Physicist());
        return role;
    }
    
    @Override
    public OrganizationType getOrganizationType() {
        return Organization.OrganizationType.MedicalDiagnostics;
    } 
}
