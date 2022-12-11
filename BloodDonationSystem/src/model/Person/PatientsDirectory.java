/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Person;

import java.util.ArrayList;

/**
 *
 * @author varshareddykumbham
 */
public class PatientsDirectory {
    private ArrayList<Patients> listOfPatients;
     public Patients createPatient(int id,String patientName,String patientAge,
             String gender,String contact, String speciality,String doctor,
             boolean isAlive, boolean isDonor, boolean isDirectDonor, ArrayList<String> bloodTypeList,
             ArrayList<String> testDataList){
         Patients patient = new Patients(id, patientName, patientAge,gender, contact, speciality, doctor, isAlive, isDonor, isDirectDonor,bloodTypeList,testDataList);
         listOfPatients.add(patient);
         return patient;
     }

     public ArrayList<Patients> getLofPatient() {
        return listOfPatients;
    } 
     
    public PatientsDirectory() {
        listOfPatients = new ArrayList();
    }
}
