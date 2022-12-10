/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.MedicalCare;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;
import ui.Doctor.DoctorJPanel;

/**
 *
 * @author varshareddykumbham
 */
public class Doctor extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorsDirectory donorDirectory) {
        return new DoctorJPanel(userProcessContainer,account, (MedicalCare)organization, enterprise,business, network);
    }
    
}