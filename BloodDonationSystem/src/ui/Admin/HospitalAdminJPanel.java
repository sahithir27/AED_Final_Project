/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.OrganizationDirectory;

/**
 *
 * @author sahithigaddam
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {
    JPanel usersPanel;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Network network;
    /**
     * Creates new form HospitalAdminJPanel
     */
    public HospitalAdminJPanel(JPanel usersPanel, Enterprise enterprise,EcoSystem ecoSystem,Network network) {
        initComponents();
        this.usersPanel = usersPanel;
        this.enterprise = enterprise;
        this.ecoSystem=ecoSystem;
        this.network=network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_admin_dashboard_heading = new javax.swing.JLabel();
        btnUsers = new javax.swing.JButton();
        btnOrganizations = new javax.swing.JButton();
        btnEmployees = new javax.swing.JButton();
        btnPatients = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        lbl_admin_dashboard_heading.setBackground(new java.awt.Color(0, 183, 210));
        lbl_admin_dashboard_heading.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lbl_admin_dashboard_heading.setForeground(new java.awt.Color(0, 183, 210));
        lbl_admin_dashboard_heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_admin_dashboard_heading.setText("HOSPITAL ADMIN DASHBOARD");

        btnUsers.setBackground(new java.awt.Color(0, 183, 210));
        btnUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnUsers.setText("Manage User Accounts");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        btnOrganizations.setBackground(new java.awt.Color(0, 183, 210));
        btnOrganizations.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOrganizations.setForeground(new java.awt.Color(255, 255, 255));
        btnOrganizations.setText("Manage Organization");
        btnOrganizations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizationsActionPerformed(evt);
            }
        });

        btnEmployees.setBackground(new java.awt.Color(0, 183, 210));
        btnEmployees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees.setText("Manage Employees");
        btnEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeesActionPerformed(evt);
            }
        });

        btnPatients.setBackground(new java.awt.Color(0, 183, 210));
        btnPatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPatients.setForeground(new java.awt.Color(255, 255, 255));
        btnPatients.setText("Manage Patients");
        btnPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HospitalAdmin/managePatients.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HospitalAdmin/userAccount.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HospitalAdmin/employee.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HospitalAdmin/organization-PhotoRoom (1) (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(128, 128, 128)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_admin_dashboard_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lbl_admin_dashboard_heading)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrganizations)
                            .addComponent(btnEmployees))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsers)
                    .addComponent(btnPatients))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        UsersJPanel manage_users = new UsersJPanel(usersPanel, enterprise);
        usersPanel.add("ManageUserAccountJPanel", manage_users);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnOrganizationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizationsActionPerformed
        OrganizationsJPanel manage_organization = new OrganizationsJPanel(usersPanel, enterprise.getLisOfOrganizations(),enterprise);
        usersPanel.add("manageOrganizationJPanel", manage_organization);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnOrganizationsActionPerformed

    private void btnEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeesActionPerformed
        EmployeesJPanel manage_employees = new EmployeesJPanel(usersPanel, enterprise.getLisOfOrganizations(),enterprise,ecoSystem);
        usersPanel.add("manageOrganizationJPanel", manage_employees);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnEmployeesActionPerformed

    private void btnPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsActionPerformed
        PatientsJPanel manage_patients = new PatientsJPanel(usersPanel, enterprise.getLisOfOrganizations(),enterprise,ecoSystem);
        usersPanel.add("manageOrganizationJPanel", manage_patients);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnPatientsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployees;
    private javax.swing.JButton btnOrganizations;
    private javax.swing.JButton btnPatients;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_admin_dashboard_heading;
    // End of variables declaration//GEN-END:variables
}
