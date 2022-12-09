/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BloodType;

/**
 *
 * @author varshareddykumbham
 */
public class BloodType {
    private String bloodType;
    private boolean bloodAvailable;
    private String network;
    
    public BloodType(String bloodType) {
        this.bloodType = bloodType;
        this.bloodAvailable =  true;
        
    }

    public String getTypeOfBlood() {
        return bloodType;
    }

    public void setTypeOfBlood(String typeOfBlood) {
        this.bloodType = typeOfBlood;
    }

    public boolean isBloodAvailable() {
        return bloodAvailable;
    }

    public void setAvailable(boolean available) {
        this.bloodAvailable = available;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    @Override
    public String toString(){
        return this.bloodType;
    }
}

