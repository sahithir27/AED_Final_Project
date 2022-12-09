/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import Business.Network.Network;
import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;

/**
 *
 * @author varshareddykumbham
 */

public class EventOrganiser extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization org, Enterprise enterprise, EcoSystem ecosystem,
            Network network, DonorsDirectory donorDirectory) {
        return new EventOrganizerWorkAreaJPanel(userProcessContainer, userAccount,(AwarnessEvent) org, ecosystem);
    }
    
}
