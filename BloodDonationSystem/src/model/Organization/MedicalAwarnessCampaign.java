/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.EventOrganiser;
import model.Role.Role;

/**
 *
 * @author sahithigaddam
 */
public class MedicalAwarnessCampaign extends Organization{

    public MedicalAwarnessCampaign(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new EventOrganiser());
        return role;
    }
    
    @Override
    public OrganizationType getOrganizationType() {
        return Organization.OrganizationType.MedicalAwarnessCampaign;
    } 
}
