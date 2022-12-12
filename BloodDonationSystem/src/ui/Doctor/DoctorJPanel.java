/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Doctor;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem;
import model.Enterprise.BloodBankEnterprise;
import model.Enterprise.Enterprise;
import model.Enterprise.EnterpriseDirectory;
import model.Network.Network;
import model.Organization.MedicalCare;
import model.Organization.Organization;
import model.Person.Patients;
import model.Users.Users;
import model.WorkQueue.DiagnosticsWorkRequest;
import model.WorkQueue.WorkRequest;
import model.Enterprise.RehabEnterprise;
import model.WorkQueue.BloodMatchWorkRequest;
import model.WorkQueue.BloodProcureWorkRequest;
import model.WorkQueue.PhysicianWorkRequest;

/**
 *
 * @author sahithigaddam
 */
public class DoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    private JPanel usersPanel;
    private MedicalCare organization;
    private Enterprise enterprise;
    private Users userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    private Network network;
    public DoctorJPanel(JPanel usersPanel, Users account, MedicalCare organization, Enterprise enterprise, EcoSystem ecosystem, Network network) {
        initComponents();
        this.usersPanel = usersPanel;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.network = network;
        txtAge.setVisible(false);
        lblAge.setVisible(false);
        lblName1.setVisible(false);
        txtName.setVisible(false);
		        btnOrderTest.setVisible(false);
        
        
        populate_patients_in_comboBox();
        LoadRequestTable();
        load_wait_table();
    }
    
    public void populate_patients_in_comboBox(){
        cbPatients.addItem("--Select");
        for(int i=0;i<organization.getListOfPatients().getLofPatient().size();i++){
            if((organization.getListOfPatients().getLofPatient().get(i).getDoctor().equalsIgnoreCase(userAccount.getEmployee().getEmployeeName()))&&organization.getListOfPatients().getLofPatient().get(i).isIsAlive()){
                cbPatients.addItem(organization.getListOfPatients().getLofPatient().get(i).getPatientId()+" : "+organization.getListOfPatients().getLofPatient().get(i).getPatientName());
            }
        }
    }
    
    public void load_wait_table(){
        DefaultTableModel model = (DefaultTableModel) tblBloodRequest.getModel();
        
        model.setRowCount(0);
        for(int i=0;i<ecosystem.getWaitList().size();i++){
            if(ecosystem.getWaitList().get(i).getPatient().getDoctor().equalsIgnoreCase(userAccount.getEmployee().getEmployeeName())){
                Object[] row = new Object[5];
                row[0] = ecosystem.getWaitList().get(i).getPatient().getPatientId();
                row[1] = ecosystem.getWaitList().get(i).getPatient().getPatientName();
                row[2] = ecosystem.getWaitList().get(i).getBlood();
                row[3] = ecosystem.getWaitList().get(i).getUrgency();
                row[4] = ecosystem.getWaitList().get(i).getPatientWaitlist();   
                model.addRow(row);
            }
        }
    
    }
    
    public void LoadRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[6];
                row[0] = ((DiagnosticsWorkRequest) request).getPatient().getPatientId();
                row[1] = ((DiagnosticsWorkRequest) request).getPatient().getPatientName();
                row[2] = request;
                row[3] = request.getReceiver();
                row[4] = request.getStatus();
    
            int counter=0;
            for(Network n: ecosystem.getNetworkList()){
                for(Enterprise e: n.getListOfEnterprises().getEnterpriseList()){
                    if(e instanceof RehabEnterprise){
                        for(Organization o:e.getLisOfOrganizations().getOrganizationList()){
                            for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                                if(((PhysicianWorkRequest)w).getPatient().getPatientId()==((DiagnosticsWorkRequest) request).getPatient().getPatientId()){
                                    counter=counter+1;
                                    if(((PhysicianWorkRequest)w).getReceiver()==null){
                                       row[5] = "Not Assigned yet"; 
                                    }else{
                                        row[5]=((PhysicianWorkRequest)w).getReceiver();
                                    }
                                }
                            }    
                        }
                    }
                }    
            }
            if(counter==0){
                row[5] = "Not requested yet"; 
            }   
                model.addRow(row);
            }
        }
    }
    
    public void initwaitlistTable(){
        DefaultTableModel model = (DefaultTableModel) tblBloodRequest.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = ((DiagnosticsWorkRequest) request).getPatient().getPatientName();
                row[2] = request.getReceiver();
                row[3] = request.getStatus();
                String result = ((DiagnosticsWorkRequest) request).getTestResult();
                row[4] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }
    
    public Patients patientAcc(String id){
        for(Patients p: organization.getListOfPatients().getLofPatient()){
            if((""+id).equalsIgnoreCase(""+p.getPatientId())){
                System.out.println(p);
                return p;
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        btnRequestBlood = new javax.swing.JButton();
        lblSelectPatient = new javax.swing.JLabel();
        cbPatients = new javax.swing.JComboBox();
        lblAge = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        btnViewReport = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        lblPatientsList = new javax.swing.JLabel();
        lblBlood = new javax.swing.JLabel();
        btnNotifyBlood = new javax.swing.JButton();
        btnOrderTest = new javax.swing.JButton();
        btnPhysician = new javax.swing.JButton();
        chk_AP = new javax.swing.JCheckBox();
        chk_BN = new javax.swing.JCheckBox();
        chk_AN = new javax.swing.JCheckBox();
        chk_BP = new javax.swing.JCheckBox();
        chk_ABP = new javax.swing.JCheckBox();
        chk_ABN = new javax.swing.JCheckBox();
        chk_OP = new javax.swing.JCheckBox();
        chk_ON = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBloodRequest = new javax.swing.JTable();
        lbl_list_of_patients = new javax.swing.JLabel();

        btnRequestBlood.setBackground(new java.awt.Color(0, 183, 210));
        btnRequestBlood.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnRequestBlood.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestBlood.setText("Request Blood");
        btnRequestBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestBloodActionPerformed(evt);
            }
        });

        lblSelectPatient.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblSelectPatient.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSelectPatient.setText("Select Patient:");

        cbPatients.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbPatients.setForeground(new java.awt.Color(255, 0, 51));
        cbPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientsActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age:");

        lblName1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName1.setText("Name:");

        btnViewReport.setBackground(new java.awt.Color(0, 183, 210));
        btnViewReport.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnViewReport.setForeground(new java.awt.Color(255, 255, 255));
        btnViewReport.setText("View Test Report");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        lblDashboard.setBackground(new java.awt.Color(255, 255, 255));
        lblDashboard.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(0, 183, 210));
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboard.setText("DOCTOR DASHBOARD");

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(0, 183, 210));
        btnView.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblPatientsList.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        lblBlood.setBackground(new java.awt.Color(255, 255, 255));
        lblBlood.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lblBlood.setText("Your Patients waiting for Blood");

        btnNotifyBlood.setBackground(new java.awt.Color(0, 183, 210));
        btnNotifyBlood.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnNotifyBlood.setForeground(new java.awt.Color(255, 255, 255));
        btnNotifyBlood.setText("Notify Blood");
        btnNotifyBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyBloodActionPerformed(evt);
            }
        });

        btnOrderTest.setBackground(new java.awt.Color(0, 183, 210));
        btnOrderTest.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnOrderTest.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderTest.setText("Order test");
        btnOrderTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderTestActionPerformed(evt);
            }
        });

        btnPhysician.setBackground(new java.awt.Color(0, 183, 210));
        btnPhysician.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnPhysician.setForeground(new java.awt.Color(255, 255, 255));
        btnPhysician.setText("Physician");
        btnPhysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysicianActionPerformed(evt);
            }
        });

        chk_AP.setBackground(new java.awt.Color(0, 183, 210));
        chk_AP.setText("A+");

        chk_BN.setBackground(new java.awt.Color(0, 183, 210));
        chk_BN.setText("B-");
        chk_BN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_BNActionPerformed(evt);
            }
        });

        chk_AN.setBackground(new java.awt.Color(0, 183, 210));
        chk_AN.setText("A-");

        chk_BP.setBackground(new java.awt.Color(0, 183, 210));
        chk_BP.setText("B+");

        chk_ABP.setBackground(new java.awt.Color(0, 183, 210));
        chk_ABP.setText("AB+");
        chk_ABP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_ABPActionPerformed(evt);
            }
        });

        chk_ABN.setBackground(new java.awt.Color(0, 183, 210));
        chk_ABN.setText("AB-");
        chk_ABN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_ABNActionPerformed(evt);
            }
        });

        chk_OP.setBackground(new java.awt.Color(0, 183, 210));
        chk_OP.setText("O+");
        chk_OP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_OPActionPerformed(evt);
            }
        });

        chk_ON.setBackground(new java.awt.Color(0, 183, 210));
        chk_ON.setText("O-");
        chk_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_ONActionPerformed(evt);
            }
        });

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Message by Doctor", "Physicist", "Lab Status", "Physician"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Doctor/Doctor.jpg"))); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tblBloodRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Blood Type Required", "Urgency", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBloodRequest);

        lbl_list_of_patients.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lbl_list_of_patients.setText("List of Old patients and test results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lbl_list_of_patients)
                                .addGap(485, 485, 485))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnViewReport)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRequestBlood)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPhysician)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNotifyBlood))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSelectPatient)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblAge)
                                                .addComponent(lblName1)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(58, 58, 58)
                                                .addComponent(btnView))
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnOrderTest)))))
                                .addGap(15, 15, 15)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBlood)))
            .addGroup(layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_BP)
                    .addComponent(chk_AP))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk_BN)
                        .addGap(18, 18, 18)
                        .addComponent(chk_OP)
                        .addGap(18, 18, 18)
                        .addComponent(chk_ON))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk_AN)
                        .addGap(18, 18, 18)
                        .addComponent(chk_ABP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk_ABN))))
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(lblDashboard))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblDashboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSelectPatient)
                                    .addComponent(cbPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName1)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOrderTest)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lbl_list_of_patients)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewReport)
                            .addComponent(btnRequestBlood)
                            .addComponent(btnPhysician)
                            .addComponent(btnNotifyBlood))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_AN)
                    .addComponent(chk_AP)
                    .addComponent(chk_ABP, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_ABN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_BN)
                    .addComponent(chk_BP)
                    .addComponent(chk_OP)
                    .addComponent(chk_ON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblBlood)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderTestActionPerformed

        String string = cbPatients.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();

        RequestLabTestJPanel requestLabTestJPanel=new RequestLabTestJPanel(usersPanel, userAccount,patientAcc(id),enterprise,organization, ecosystem,network);
        usersPanel.add("Lab test",requestLabTestJPanel);
        CardLayout layout=(CardLayout)usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnOrderTestActionPerformed

    private void btnRequestBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestBloodActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tblWorkRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }

        Patients p=patientAcc(tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 0).toString());
        RequestBloodJpanel requestBloodJpanel=new RequestBloodJpanel(usersPanel,organization, userAccount,p,ecosystem,enterprise,network);
        usersPanel.add("Lab test",requestBloodJpanel);
        CardLayout layout=(CardLayout)usersPanel.getLayout();
        layout.next(usersPanel);

    }//GEN-LAST:event_btnRequestBloodActionPerformed

    private void cbPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientsActionPerformed

    }//GEN-LAST:event_cbPatientsActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        boolean check;
        check=tblWorkRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }

        Patients p=patientAcc(tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 0).toString());

        String id=tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 0).toString();

        check=!(tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 3)==null);
        if(!check){
            JOptionPane.showMessageDialog(null, "Resulted not generated");
            return;
        }

        String labassist=tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 3).toString();

        TestDataJPanel tdj=new TestDataJPanel(usersPanel, userAccount,id,p,labassist,enterprise,organization, ecosystem,network);
        usersPanel.add("Lab test",tdj);
        CardLayout layout=(CardLayout)usersPanel.getLayout();
        layout.next(usersPanel);

    }//GEN-LAST:event_btnViewReportActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=cbPatients.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
        }
        String string = cbPatients.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();
        for(Patients p: organization.getListOfPatients().getLofPatient()){
            if(id.equalsIgnoreCase(""+p.getPatientId())){

                lblAge.setVisible(true);
                lblName1.setVisible(true);
                txtName.setVisible(true);
                txtAge.setVisible(true);
                txtAge.setText(p.getPatientAge());
                txtName.setText(p.getPatientName());
                txtAge.setEnabled(false);
                txtName.setEnabled(false);
                btnOrderTest.setVisible(true);

            }
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnNotifyBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyBloodActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tblWorkRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        check=(chk_AP.isSelected()||chk_BN.isSelected()||chk_AN.isSelected()||chk_BP.isSelected()||chk_ABP.isSelected()||chk_ABN.isSelected()
                ||chk_OP.isSelected()||chk_ON.isSelected());
        if(!check){
            JOptionPane.showMessageDialog(null, "Select atleast one checkbox");
            return;
        }

        BloodProcureWorkRequest request = new BloodProcureWorkRequest();
        request.setPatient(patientAcc(tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 0).toString()));

        BloodMatchWorkRequest mr=new BloodMatchWorkRequest();
        mr.setBloodDonor(patientAcc(tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 0).toString()));

        ArrayList<String> orList=new ArrayList<>();
        if(chk_AP.isSelected()){
            orList.add("A+");
        }
        if(chk_AN.isSelected()){
            orList.add("A-");
        }
        if(chk_BP.isSelected()){
            orList.add("B+");
        }
        if(chk_BN.isSelected()){
            orList.add("B-");
        }
        if(chk_ABP.isSelected()){
            orList.add("AB+");
        }
        if(chk_ABN.isSelected()){
            orList.add("AB-");
        }
        if(chk_OP.isSelected()){
            orList.add("O+");
        }
        if(chk_ON.isSelected()){
            orList.add("O-");
        }

        request.setListOfBloodTypes(orList);

        Patients chkpat=patientAcc(tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 0).toString());
        int dup=0;
        for(Network n:ecosystem.getNetworkList()){
            for(Enterprise e: n.getListOfEnterprises().getEnterpriseList()){
                if(e instanceof BloodBankEnterprise){
                    for(WorkRequest w: e.getWorkQueue().getWorkRequestList()){
                        if(w instanceof BloodProcureWorkRequest){
                            if(((BloodProcureWorkRequest) w).getPatient().getPatientId()==chkpat.getPatientId()){
                                dup=dup+1;
                            }
                        }
                    }

                }

            }
        }

        check=(dup==0);
        if(!check){
            JOptionPane.showMessageDialog(null, "The procurement for this patient is already requested");
            return;
        }

        request.setSender(userAccount);
        request.setStatus("Procurement Requested");

        mr.setStatus("Procurement Requested");
        mr.setSender(userAccount);

        int size=ecosystem.getWaitList().size();
        int loopcounter=0;
        for(int i=size-1;i>-1;i--){
            for(String s: orList){
                if(s.equalsIgnoreCase(ecosystem.getWaitList().get(i).getBlood())){
                    loopcounter++;
                    mr.setBloodRecepient(ecosystem.getWaitList().get(i).getPatient());
                    mr.setBloodType(ecosystem.getWaitList().get(i).getBlood());
                    break;
                }
            }
            if(loopcounter>0)break;
        }

        Enterprise ent = null;
        for(Network n: ecosystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(network.getName())){
                for(Enterprise e: n.getListOfEnterprises().getEnterpriseList()){
                    if(e instanceof BloodBankEnterprise){
                        ent=e;
                        if(loopcounter>0){
                            ent.getWorkQueue().getWorkRequestList().add(mr);
                            userAccount.getWorkQueue().getWorkRequestList().add(mr);
                        }else{
                            ent.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                        }

                    }
                }

            }

        }

        JOptionPane.showMessageDialog(null, "Blood Procurement Requested");

    }//GEN-LAST:event_btnNotifyBloodActionPerformed

    private void btnPhysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysicianActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tblWorkRequest.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        Patients p=patientAcc(tblWorkRequest.getValueAt(tblWorkRequest.getSelectedRow(), 0).toString());
        RequestTherapyJPanel requestTherapyJPanel=new RequestTherapyJPanel(usersPanel,organization, userAccount,p,ecosystem,enterprise,network);
        usersPanel.add("Lab test",requestTherapyJPanel);
        CardLayout layout=(CardLayout)usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnPhysicianActionPerformed

    private void chk_BNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_BNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_BNActionPerformed

    private void chk_ABPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_ABPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_ABPActionPerformed

    private void chk_ABNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_ABNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_ABNActionPerformed

    private void chk_OPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_OPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_OPActionPerformed

    private void chk_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_ONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_ONActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNotifyBlood;
    private javax.swing.JButton btnOrderTest;
    private javax.swing.JButton btnPhysician;
    private javax.swing.JButton btnRequestBlood;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JComboBox cbPatients;
    private javax.swing.JCheckBox chk_ABN;
    private javax.swing.JCheckBox chk_ABP;
    private javax.swing.JCheckBox chk_AN;
    private javax.swing.JCheckBox chk_AP;
    private javax.swing.JCheckBox chk_BN;
    private javax.swing.JCheckBox chk_BP;
    private javax.swing.JCheckBox chk_ON;
    private javax.swing.JCheckBox chk_OP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBlood;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPatientsList;
    private javax.swing.JLabel lblSelectPatient;
    private javax.swing.JLabel lbl_list_of_patients;
    private javax.swing.JTable tblBloodRequest;
    private javax.swing.JTable tblWorkRequest;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
