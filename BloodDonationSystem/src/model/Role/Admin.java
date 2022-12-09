/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import Business.Network.Network;
import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;

/**
 *
 * @author varshareddykumbham
 */

public class Admin extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorsDirectory donorDirectory) {
        JPanel jp = null;
        if(enterprise.getClass().getTypeName().contains("HospitalEnterprise")){
            jp=new HospitalAdminJPanel(userProcessContainer, enterprise, business,network);
        }
        else if(enterprise.getClass().getTypeName().contains("OrganBankEnterprise")){
            jp=new OrganBankJPanel (userProcessContainer, enterprise, business,network);
        }
        else{
            jp=new AdminWorkAreaJPanel(userProcessContainer, enterprise, business,network);
        }
        return jp;
    }
    
}

