package model.BloodType;


import java.util.ArrayList;
import model.BloodType.BloodType;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */

public class BloodTypeDirectory {
    private ArrayList<BloodType> bloodtypeList;
    
    public BloodTypeDirectory() {
        bloodtypeList = new ArrayList<BloodType>();
        BloodType bloodtype1 = new BloodType("A Positive");
        BloodType bloodtype2 = new BloodType("A Negative");
        BloodType bloodtype3 = new BloodType("B Positive");
        BloodType bloodtype4 = new BloodType("B Negative");
        BloodType bloodtype5 = new BloodType("AB Positive");
        BloodType bloodtype6 = new BloodType("AB Negative");
        BloodType bloodtype7 = new BloodType("O Positive");
        BloodType bloodtype8 = new BloodType("O Negative");
        
        bloodtypeList.add(bloodtype1);
        bloodtypeList.add(bloodtype2);
        bloodtypeList.add(bloodtype3);
        bloodtypeList.add(bloodtype4);
        bloodtypeList.add(bloodtype5);
        bloodtypeList.add(bloodtype6);
        bloodtypeList.add(bloodtype7);
        bloodtypeList.add(bloodtype8);
    }

    public ArrayList<BloodType> getBloodtypeList() {
        return bloodtypeList;
    }

    public void setBloodtypeList(ArrayList<BloodType> bloodtypeList) {
        this.bloodtypeList = bloodtypeList;
    }
}

