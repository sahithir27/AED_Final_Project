package model.Network;

import model.Enterprise.EnterpriseDirectory;
import model.Enterprise.EnterpriseDirectory;

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
    private EnterpriseDirectory listOfEnterprises;
    
    public Network(){
        listOfEnterprises=new EnterpriseDirectory();
    }
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public EnterpriseDirectory getListOfEnterprises() {
        return listOfEnterprises;
    }

    public void setListOfEnterprises(EnterpriseDirectory listOfEnterprises) {
        this.listOfEnterprises = listOfEnterprises;
    }
    
    
    @Override
    public String toString(){
        return enterpriseName;
    }
    
}
