/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;

/**
 *
 * @author sahithigaddam
 */
public abstract class Role {
    public enum RoleType{
       Sysadmin("Syadmin") ,
       Admin("Admin"),
       Doctor("Doctor"),
       Physicist("Physicist"),
       BloodFindingTeamHead("Blood Finding Team Head"),
       HealthOfficer("Health Officer"),
       EventOrganiser("Event Organiser"),
       Donor("Donor"),
       BloodBankManager("Organ Bank Manager"),
       Physician("Physician");
       
        private RoleType(String value){
            this.value = value;
        }

       
        private String value;

       
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            Users account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network,
            DonorsDirectory donorDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}