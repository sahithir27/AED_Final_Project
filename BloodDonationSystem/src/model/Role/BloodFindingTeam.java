/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.MedicalFacilities;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;
import ui.ProcurementTeam.ProcurementTeamJPanel;

/**
 *
 * @author varshareddykumbham
 */
public class BloodFindingTeam extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Users userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem ecosystem,
            Network network, DonorsDirectory donorDirectory) {
        return new ProcurementTeamJPanel(userProcessContainer,userAccount, (MedicalFacilities)organization, enterprise,
                ecosystem, network);
    }
    
}
