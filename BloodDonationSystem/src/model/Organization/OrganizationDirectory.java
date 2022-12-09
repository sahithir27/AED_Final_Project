/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Organization.Organization.OrganizationType;

/**
 *
 * @author sahithigaddam
 */
public class OrganizationDirectory {
    private ArrayList<Organization> listOfOrganizations;

    public OrganizationDirectory() {
        listOfOrganizations = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return listOfOrganizations;
    }
    
    
    
    
     public Organization createOrganization(OrganizationType organizationType,String name){
        Organization organization = null;
        if (organizationType.getValue().equals(OrganizationType.MedicalCare.getValue())){
            organization = new MedicalCare(name);
            listOfOrganizations.add(organization);
        }else if (organizationType.getValue().equals(OrganizationType.MedicalDiagnostics.getValue())){
            organization = new DiagnosticCenter(name);
            listOfOrganizations.add(organization);
        }else if (organizationType.getValue().equals(OrganizationType.MedicalFacilities.getValue())){
            organization = new MedicalFacilities(name);
            listOfOrganizations.add(organization);
        }else if (organizationType.getValue().equals(OrganizationType.BloodManagement.getValue())){
            organization = new BloodManagement(name);
            listOfOrganizations.add(organization);
        }else if(organizationType.getValue().equals(OrganizationType.PoliciesFinance.getValue())){
          organization = new PoliciesFinance(name);
          listOfOrganizations.add(organization);
        }else if(organizationType.getValue().equals(OrganizationType.MedicalAwarnessCampaign.getValue())){
             organization = new MedicalAwarnessCampaign(name);
            listOfOrganizations.add(organization);
        }else if(organizationType.getValue().equals(OrganizationType.Physician.getValue())){
             organization = new Physicians(name);
             listOfOrganizations.add(organization);
        }
        return organization;
    }
}
