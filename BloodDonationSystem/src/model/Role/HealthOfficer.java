/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import Business.Network.Network;
import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Users.Users;

/**
 *
 * @author varshareddykumbham
 */

public class HealthOfficer extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization org, Enterprise enterprise, EcoSystem ecosystem,
            Network network, DonorsDirectory donorDirectory) {
        return new HealthOfficerJPanel(userProcessContainer,userAccount,
                (FinanceEvent)org, enterprise,ecosystem, network);
    }
}
