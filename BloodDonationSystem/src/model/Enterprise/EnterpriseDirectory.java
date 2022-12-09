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
    private ArrayList<Enterprise> eList;

    public ArrayList<Enterprise> geteList() {
        return eList;
    }

    public void seteList(ArrayList<Enterprise> eList) {
        this.eList = eList;
    }
    
    public EnterpriseDirectory(){
        eList=new ArrayList<Enterprise>();
    }
    
      //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            eList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.OrganBank){
            enterprise = new OrganBankEnterprise(name);
            eList.add(enterprise);    
        }else if(type==Enterprise.EnterpriseType.NGO){
            enterprise = new NGOEnterprise(name);
            eList.add(enterprise);    
        }else if(type==Enterprise.EnterpriseType.Physio){
            enterprise = new PhysioEnterprise(name);
            eList.add(enterprise);    
        }
        return enterprise;
    }
    
}

