/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import Business.Network.Network;
import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;

/**
 *
 * @author varshareddykumbham
 */
public class Doctor extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorsDirectory donorDirectory) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account, (HealthCare)organization, enterprise,business, network);
    }
    
}