package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sindhurabandaru
 */
public class Network {
    private String enterpriseName;
    private EnterpriseList enterpriseList;
    
    public Network(){
        enterpriseList=new EnterpriseList();
    }
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public EnterpriseList getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(EnterpriseList enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
    @Override
    public String toString(){
        return enterpriseName;
    }
    
}
