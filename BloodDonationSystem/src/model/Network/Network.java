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
    private String name;
    private EnterpriseDirectory listOfEnterprises;
    
    public Network(){
        listOfEnterprises=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getListOfEnterprises() {
        return listOfEnterprises;
    }

    public void setListOfEnterprises(EnterpriseDirectory listOfEnterprises) {
        this.listOfEnterprises = listOfEnterprises;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
