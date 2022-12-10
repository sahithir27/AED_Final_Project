/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;
import model.Person.Patients;

/**
 *
 * @author sahithigaddam
 */
public class DiagnosticsWorkRequest extends WorkRequest{
    private String fileName;
    private Patients patient;
    private ArrayList<String> testData;
    private String testResult;
    private String patientName;
    private String patientId;
    private ArrayList <String> tests = new ArrayList<String>();


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public ArrayList<String> getTestData() {
        return testData;
    }

    public void setTestData(ArrayList<String> testData) {
        this.testData = testData;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public ArrayList<String> getTests() {
        return tests;
    }

    public void setTests(ArrayList<String> tests) {
        this.tests = tests;
    }
    
    
    
}
