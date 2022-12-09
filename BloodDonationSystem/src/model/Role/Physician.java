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

public class Physician extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, 
            Organization organization, Enterprise enterprise, 
            EcoSystem business, Network network, DonorsDirectory donorDirectory) {
         return new PhysioTherapistWorkAreaJPanel(userProcessContainer, userAccount, (PhysioTherapist)organization, enterprise,business, network);
    }
    
}