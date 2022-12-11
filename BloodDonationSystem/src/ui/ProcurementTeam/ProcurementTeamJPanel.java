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
                        if(workRequest.getStatus().equalsIgnoreCase("Assigned") ||
                                workRequest.getStatus().equalsIgnoreCase("InProcess") ||
                                workRequest.getStatus().equalsIgnoreCase("Completed")){
                            //System.out.println("BloodProcureWorkRequest*****");
                            if(workRequest instanceof BloodProcureWorkRequest){
                                BloodProcureWorkRequest bloodProcureWorkRequest = (BloodProcureWorkRequest)workRequest;
//                                String bloodTypesString = "";
//                                for(String s: bloodProcureWorkRequest.getListOfBloodTypes()){
//                                    //bloodTypesString = s+";"+bloodTypesString;
//                                }
                                Object[] row = new Object[6];
                                row[0] = bloodProcureWorkRequest;
                                row[1] = bloodProcureWorkRequest.getStatus();
                                row[2] = bloodProcureWorkRequest.getListOfBloodTypes().get(0);
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
        jLabel1 = new javax.swing.JLabel();

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

        btnInProcess.setBackground(new java.awt.Color(0, 183, 210));
        btnInProcess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnInProcess.setText("InProcess");
        btnInProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInProcessActionPerformed(evt);
            }
        });

        btnCompleted.setBackground(new java.awt.Color(0, 183, 210));
        btnCompleted.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCompleted.setForeground(new java.awt.Color(255, 255, 255));
        btnCompleted.setText("Completed");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        lblDashboard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(0, 183, 210));
        lblDashboard.setText("Procurement Team Dashboard");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Procurement/procurement.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDashboard)
                .addGap(256, 256, 256))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnInProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null,"Request should be InProcess", "Warning", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tbl_work_request;
    // End of variables declaration//GEN-END:variables
}
