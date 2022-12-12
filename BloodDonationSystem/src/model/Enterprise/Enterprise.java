/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organization.Organization;
import model.Organization.OrganizationDirectory;

/**
 *
 * @author varshareddykumbham
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory lisOfOrganizations;

    public OrganizationDirectory getLisOfOrganizations() {
        return lisOfOrganizations;
    }

    public enum EnterpriseType{
        Hospital("Hospital"),
        BloodBank("Blood Bank"),
        FederalGovernment("Federal Government"),
        Rehab("Rehabilitation Center");

        private String type;
        
        private EnterpriseType(String type){
            this.type=type;
        }
        public String getType() {
            return type;
        }
        @Override
        public String toString(){
        return type;
    }
    }

    public EnterpriseType getenterpriseType() {
        return enterpriseType;
    }

    public void setenterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        lisOfOrganizations=new OrganizationDirectory();
    }    
}

