/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import Business.Network.Network;
import javax.swing.JPanel;

/**
 *
 * @author varshareddykumbham
 */
public class Physicist {
    
}
public class Physicist extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization organization, Enterprise enterprise, EcoSystem ecosystem, Network network, 
            DonorsDirectory donorDirectory) {
         return new DiagnosticsWorkAreaJPanel(userProcessContainer, userAccount, (Laboratory)organization,ecosystem,enterprise);
    }
    
}
