/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
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
import model.WorkQueue.BloodMatchWorkRequest;
import model.WorkQueue.BloodProcureWorkRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author sahithigaddam
 */
public class ManageBloodJPanel extends javax.swing.JPanel {

    JPanel usersPanel;
    OrganizationDirectory listOfOrganizations; 
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Network network;
    /**
     * Creates new form ManageBloodJPanel
     */
    public ManageBloodJPanel(JPanel usersPanel, OrganizationDirectory listOfOrganizations, 
            Enterprise enterprise,EcoSystem ecoSystem,Network network) {
        initComponents();
        this.usersPanel=usersPanel;
        this.listOfOrganizations=listOfOrganizations;
        this.enterprise=enterprise;
        this.ecoSystem=ecoSystem;
        this.network=network;
        
        initComponents();
        populateJTableData();
        populateComboBoxesData();
        matchDonorWithPatient();
    }

    public void matchDonorWithPatient(){
        DefaultTableModel model = (DefaultTableModel) tblDonorData.getModel();
        model.setRowCount(0);
        
        for(Network network: ecoSystem.getNetworkList()){
            if(network.getName().equalsIgnoreCase(network.getName())) { 
                for(Enterprise enterprise: network.getListOfEnterprises().getEnterpriseList()){
                    if(enterprise instanceof BloodBankEnterprise){
                        if(enterprise.getWorkQueue()== null){
                            System.out.println("catched by repears");
                            break;
                        }
                        for(WorkRequest workRequest: enterprise.getWorkQueue().getWorkRequestList()){
                            if(workRequest.getStatus().equalsIgnoreCase("procurement requested") ||
                                    workRequest.getStatus().equalsIgnoreCase("work started")|| 
                                    workRequest.getStatus().equalsIgnoreCase("Assigned") 
                                    ||workRequest.getStatus().equalsIgnoreCase("InProcess")|| 
                                    workRequest.getStatus().equalsIgnoreCase("Completed")){
                            if(workRequest instanceof BloodMatchWorkRequest){  
                            BloodMatchWorkRequest bloodMatchWorkRequest = (BloodMatchWorkRequest)workRequest;
                      
                            bloodMatchWorkRequest.setStatus("Completed");
                            Object[] row = new Object[6];
                            row[0] = bloodMatchWorkRequest.getBloodDonor().getPatientName();
                            row[1] = bloodMatchWorkRequest.getBloodDonor().getDoctor();
                            row[2] = bloodMatchWorkRequest.getBloodType();
                            row[3] = bloodMatchWorkRequest.getBloodRecepient().getPatientName();
                            row[4] = bloodMatchWorkRequest.getBloodRecepient().getDoctor();
                            row[5] = bloodMatchWorkRequest.getStatus();
                            model.addRow(row);
                            }
                        }
                    }
                }
            }
            }
        }   
    }
    
    private void populateJTableData() {
        DefaultTableModel model = (DefaultTableModel) tblBloodworkRequests.getModel();
         model.setRowCount(0);
         for(Network n: ecoSystem.getNetworkList()){

            if(n.getName().equalsIgnoreCase(network.getName())) { 
            for(Enterprise enterprise: n.getListOfEnterprises().getEnterpriseList()){
                System.out.println(enterprise);
                if(enterprise instanceof BloodBankEnterprise){
                    if(enterprise.getWorkQueue()== null){
                        System.out.println("catched by repears");
                      break;
                    }
                    for(WorkRequest wr: enterprise.getWorkQueue().getWorkRequestList()){
                        if(wr.getStatus().equalsIgnoreCase("procurement requested") ||
                                wr.getStatus().equalsIgnoreCase("work started")||
                                wr.getStatus().equalsIgnoreCase("Assigned") ||
                                wr.getStatus().equalsIgnoreCase("InProcess")||
                                wr.getStatus()==null|| wr.getStatus().equalsIgnoreCase("Completed")){
                            if(wr instanceof BloodProcureWorkRequest){
                            BloodProcureWorkRequest bloodProcurementWorkRequest = (BloodProcureWorkRequest)wr;
//                            String a ="";
//                            for( String s: bloodProcurementWorkRequest.getListOfBloodTypes()){
//                                a= s+";"+a;
//                            }
                            Object[] row = new Object[6];
                            row[0] = bloodProcurementWorkRequest.getPatient().getPatientId();
                            row[1] = bloodProcurementWorkRequest.getPatient().getPatientName();
                            row[2] = bloodProcurementWorkRequest.getListOfBloodTypes().get(0);
                            row[3] = bloodProcurementWorkRequest.getPatient().getDoctor();
                            row[4] = bloodProcurementWorkRequest.getMessage();
                            row[5] = bloodProcurementWorkRequest.getStatus();
                            model.addRow(row);
                            }
                        }
                    }
                }
            }
            }
        }

    }
    
    private void populateComboBoxesData() {
        
        cbfacilityProcurement.removeAllItems();
        cbfacilityProcurement.addItem("--Select--");
        for(Organization org  : listOfOrganizations.getOrganizationList()) {
           
           if( org instanceof MedicalFacilities){
               if(((MedicalFacilities) org).getCounter()==0){
               cbfacilityProcurement.addItem(org.getOrganizationName());}
           }   
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblPatientData = new javax.swing.JScrollPane();
        tblBloodworkRequests = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        cbfacilityProcurement = new javax.swing.JComboBox<>();
        btnProcureBlood = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonorData = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblMatch = new javax.swing.JLabel();

        tblBloodworkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Blood Type Required", "Doctor", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBloodworkRequests.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tblBloodworkRequests.setSelectionForeground(new java.awt.Color(255, 255, 51));
        tblPatientData.setViewportView(tblBloodworkRequests);

        btnAssignRequest.setBackground(new java.awt.Color(0, 183, 210));
        btnAssignRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssignRequest.setText("Assign");
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        cbfacilityProcurement.setBackground(new java.awt.Color(0, 183, 210));
        cbfacilityProcurement.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbfacilityProcurement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbfacilityProcurement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfacilityProcurementActionPerformed(evt);
            }
        });

        btnProcureBlood.setBackground(new java.awt.Color(0, 183, 210));
        btnProcureBlood.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProcureBlood.setText("Acquire Blood");
        btnProcureBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcureBloodActionPerformed(evt);
            }
        });

        tblDonorData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Donor Patient", "Donor Doctor", "Blood Type", "Receiving patient", "Receiving Doctor", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblDonorData);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 183, 210));
        lblTitle.setText("Blood Acquirement Requests");

        btnBack.setBackground(new java.awt.Color(0, 183, 210));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMatch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMatch.setForeground(new java.awt.Color(0, 183, 210));
        lblMatch.setText("Organ Matching Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(lblMatch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tblPatientData)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(530, 530, 530)
                                .addComponent(btnProcureBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbfacilityProcurement, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAssignRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(169, 169, 169)
                                .addComponent(lblTitle))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(tblPatientData, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbfacilityProcurement, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAssignRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProcureBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addComponent(lblMatch)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed
        // TODO add your handling code here:

        if(cbfacilityProcurement.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a Procurement Team");
            return;
        }
        int selectedRow = tblBloodworkRequests.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select request to assign Procurement", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        BloodProcureWorkRequest orgwr = (BloodProcureWorkRequest)tblBloodworkRequests.getValueAt(selectedRow, 0);

        if(!orgwr.getStatus().equals("Work Started")){
            JOptionPane.showMessageDialog(null,"Request should be procured first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for(Organization org  : listOfOrganizations.getOrganizationList()) {

            if( org instanceof MedicalFacilities){
                //System.out.println(org.getName()+":"+((Facilities) org).getCounter());
                if(org.getOrganizationName().equalsIgnoreCase(cbfacilityProcurement.getSelectedItem().toString())){
                    org.getWorkQueue().getWorkRequestList().add((BloodProcureWorkRequest)tblBloodworkRequests.getValueAt(selectedRow, 0));
                    ((MedicalFacilities) org).setCounter(1);
                }
            }
        }
        orgwr.setStatus("Assigned");
        orgwr.setTeam(cbfacilityProcurement.getSelectedItem().toString());
        populateJTableData();
        populateComboBoxesData();
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void cbfacilityProcurementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfacilityProcurementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbfacilityProcurementActionPerformed

    private void btnProcureBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcureBloodActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblBloodworkRequests.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        BloodProcureWorkRequest orgwr = (BloodProcureWorkRequest)tblBloodworkRequests.getValueAt(selectedRow, 0);
        if(orgwr.getStatus().equalsIgnoreCase("procurement requested")) {
            orgwr.setStatus("Work Started");
        }

        else {
            JOptionPane.showMessageDialog(null, "Order is already ready Procured");
            return;
        }

        populateJTableData();
    }//GEN-LAST:event_btnProcureBloodActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        usersPanel.remove(this);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.previous(usersPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcureBlood;
    private javax.swing.JComboBox<String> cbfacilityProcurement;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMatch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblBloodworkRequests;
    private javax.swing.JTable tblDonorData;
    private javax.swing.JScrollPane tblPatientData;
    // End of variables declaration//GEN-END:variables
}
