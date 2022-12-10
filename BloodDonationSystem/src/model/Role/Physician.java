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
import model.Organization.Physicians;
import model.Person.DonorsDirectory;
import model.Users.Users;
import ui.Physician.PhysicianJPanel;

/**
 *
 * @author varshareddykumbham
 */

public class Physician extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, 
            Organization organization, Enterprise enterprise, 
            EcoSystem business, Network network, DonorsDirectory donorDirectory) {
         return new PhysicianJPanel(userProcessContainer, userAccount, (Physicians)organization, enterprise,business, network);
    }
    
}