/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author varshareddykumbham
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> eList) {
        this.enterpriseList = eList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
      //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.BloodBank){
            enterprise = new BloodBankEnterprise(name);
            enterpriseList.add(enterprise);    
        }else if(type==Enterprise.EnterpriseType.FederalGovernment){
            enterprise = new FederalGovernmentEnterprise(name);
            enterpriseList.add(enterprise);    
        }else if(type==Enterprise.EnterpriseType.Rehab){
            enterprise = new RehabEnterprise(name);
            enterpriseList.add(enterprise);    
        }
        return enterprise;
    }
    
}

