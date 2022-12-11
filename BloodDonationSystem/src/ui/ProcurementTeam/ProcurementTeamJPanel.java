/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProcurementTeam;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem;
import model.Enterprise.BloodBankEnterprise;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.MedicalFacilities;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import model.Users.Users;
import model.WorkQueue.BloodProcureWorkRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author sahithigaddam
 */
public class ProcurementTeamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcurementTeamJPanel
     */
    
    JPanel usersPanel;
    OrganizationDirectory organizationDirectory; 
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Users account;
    Organization organization;
    Network network;
    
    public ProcurementTeamJPanel(JPanel usersPanel, Users account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.usersPanel=usersPanel;
        this.enterprise=enterprise;
        this.ecoSystem=business;
        this.account = account;
        this.organization =organization;
        this.network=network;
        populate_tbl();
    }
    
    private void populate_tbl() {
         DefaultTableModel model = (DefaultTableModel) tbl_work_request.getModel();
         model.setRowCount(0);
         for(Network n: ecoSystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(network.getName())){
            for(Enterprise e: n.getListOfEnterprises().getEnterpriseList()){
                if(e instanceof BloodBankEnterprise){
                    
                    if(e.getWorkQueue()== null){
                        
                      break;}
                    
                    System.out.println("Lenght of Work Requests");
                    System.out.println(e.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest workRequest: e.getWorkQueue().getWorkRequestList()){
                        System.out.println(workRequest.getStatus());
                        if(workRequest.getStatus().equals("Assigned") ||
                                workRequest.getStatus().equals("InProgress") ||
                                workRequest.getStatus().equals("Completed")){
                            //System.out.println("BloodProcureWorkRequest*****");
                            if(workRequest instanceof BloodProcureWorkRequest){
                                BloodProcureWorkRequest bloodProcureWorkRequest = (BloodProcureWorkRequest)workRequest;
                                String bloodTypesString = "";
                                for(String s: bloodProcureWorkRequest.getListOfBloodTypes()){
                                    bloodTypesString = s+";"+bloodTypesString;
                                }
                                Object[] row = new Object[6];
                                row[0] = bloodProcureWorkRequest;
                                row[1] = bloodProcureWorkRequest.getStatus();
                                row[2] = bloodTypesString;
                                row[3] = bloodProcureWorkRequest.getPatient().getPatientName();
                                
                                row[4] = bloodProcureWorkRequest.getPatient().getDoctor();
                                //row[5] = bloodProcureWorkRequest.getMessage();
                                
                                model.addRow(row);
                                
                            }
                        }
                    }
//                    for(WorkRequest wr: e.getWorkQueue().getWorkRequestList()){
//                        
//                        if( wr.getStatus().equals("Assigned")|| 
//                                wr.getStatus().equals("InProcess")|| 
//                                wr.getStatus().equals("Completed")){
//                            if(wr instanceof BloodProcureWorkRequest){
//                            BloodProcureWorkRequest opr = (BloodProcureWorkRequest)wr;
//                            
//                            String a ="";
//                            for( String s: opr.getListOfBloodTypes()){
//                                a= s+":"+a;
//                            }
//                            Object[] row = new Object[80];
//                        row[0]= opr;
//                        row[1] = opr.getMessage();
//                        
//                        row[1] = opr.getStatus();
//                        row[2] = a;
//                        
//                        row[4] = opr.getPatient().getDoctor();
//                        model.addRow(row);
//                        }
//                        }
//
//                    }
                }
            }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_work_request = new javax.swing.JTable();
        btnInProcess = new javax.swing.JButton();
        btnCompleted = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();

        tbl_work_request.setForeground(new java.awt.Color(153, 51, 0));
        tbl_work_request.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Status", "Blood", "Patient", "Doctor"
            }
        ));
        tbl_work_request.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tbl_work_request.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(tbl_work_request);

        btnInProcess.setBackground(new java.awt.Color(255, 0, 51));
        btnInProcess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnInProcess.setText("InProcess");
        btnInProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInProcessActionPerformed(evt);
            }
        });

        btnCompleted.setBackground(new java.awt.Color(255, 0, 51));
        btnCompleted.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCompleted.setForeground(new java.awt.Color(255, 255, 255));
        btnCompleted.setText("Completed");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        lblDashboard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 0, 51));
        lblDashboard.setText("Procurement Team Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(279, 279, 279)
                                    .addComponent(lblDashboard))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(303, 303, 303)
                                    .addComponent(btnInProcess)
                                    .addGap(54, 54, 54)
                                    .addComponent(btnCompleted)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInProcess)
                        .addComponent(btnCompleted))
                    .addContainerGap(194, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInProcessActionPerformed

        int selectedRow = tbl_work_request.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select a request to Process", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        BloodProcureWorkRequest orgwr = (BloodProcureWorkRequest)tbl_work_request.getValueAt(selectedRow, 0);
        boolean check;
        check=orgwr.getTeam().equalsIgnoreCase(organization.getOrganizationName());

        if(!check){
            JOptionPane.showMessageDialog(null, "This task is assigned to other team");
            return;
        }
        if(orgwr.getStatus().equals("Assigned")){
            orgwr.setStatus("InProcess");
        }

        populate_tbl();

    }//GEN-LAST:event_btnInProcessActionPerformed

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed

        int selectedRow = tbl_work_request.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select request to Complete", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        BloodProcureWorkRequest orgwr = (BloodProcureWorkRequest)tbl_work_request.getValueAt(selectedRow, 0);
        if(!orgwr.getStatus().equals("InProcess")){
            JOptionPane.showMessageDialog(null,"Request should be InProcess", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(organization instanceof MedicalFacilities){
            orgwr.setStatus("Completed");
            ((MedicalFacilities) organization).setCounter(0);}

        populate_tbl();
    }//GEN-LAST:event_btnCompletedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnInProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tbl_work_request;
    // End of variables declaration//GEN-END:variables
}
