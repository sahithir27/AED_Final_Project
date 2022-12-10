/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import model.Network.Network;
import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.DiagnosticCenter;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;
import ui.Physicist.DiagnosticsJPanel;

/**
 *
 * @author varshareddykumbham
 */
public class Physicist extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization organization, Enterprise enterprise, EcoSystem ecosystem, Network network, 
            DonorsDirectory donorDirectory) {
         return new DiagnosticsJPanel(userProcessContainer, userAccount, (DiagnosticCenter)organization,ecosystem,enterprise);
    }
    
}
