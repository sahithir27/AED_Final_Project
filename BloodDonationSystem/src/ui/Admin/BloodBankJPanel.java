/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;

/**
 *
 * @author sahithigaddam
 */
public class BloodBankJPanel extends javax.swing.JPanel {
    
    JPanel usersPanel;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Network network;

    /**
     * Creates new form BloodBankJPanel
     */
    public BloodBankJPanel(JPanel usersPanel, Enterprise enterprise,EcoSystem ecoSystem,Network network) {
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

        btnUsers = new javax.swing.JButton();
        btnOrganization = new javax.swing.JButton();
        btnEmployees = new javax.swing.JButton();
        btnRequests = new javax.swing.JButton();
        tfAdminDashboard = new javax.swing.JLabel();

        btnUsers.setBackground(new java.awt.Color(255, 0, 51));
        btnUsers.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnUsers.setText("Users");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        btnOrganization.setBackground(new java.awt.Color(255, 0, 51));
        btnOrganization.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnOrganization.setText("Organizations");
        btnOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizationActionPerformed(evt);
            }
        });

        btnEmployees.setBackground(new java.awt.Color(255, 0, 51));
        btnEmployees.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees.setText("Employees");
        btnEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeesActionPerformed(evt);
            }
        });

        btnRequests.setBackground(new java.awt.Color(255, 0, 51));
        btnRequests.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnRequests.setText("View Requests");
        btnRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestsActionPerformed(evt);
            }
        });

        tfAdminDashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tfAdminDashboard.setForeground(new java.awt.Color(255, 0, 51));
        tfAdminDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfAdminDashboard.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(647, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tfAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnOrganization)
                .addGap(18, 18, 18)
                .addComponent(btnEmployees)
                .addGap(18, 18, 18)
                .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRequests)
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(tfAdminDashboard)
                    .addContainerGap(534, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        UsersJPanel users = new UsersJPanel(usersPanel, enterprise);
        usersPanel.add("ManageUserAccountJPanel", users);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizationActionPerformed
        OrganizationsJPanel organizations = new OrganizationsJPanel(usersPanel, enterprise.getLisOfOrganizations(),enterprise);
        usersPanel.add("manageOrganizationJPanel", organizations);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnOrganizationActionPerformed

    private void btnEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeesActionPerformed
        // TODO add your handling code here:
        EmployeesJPanel employees = new EmployeesJPanel(usersPanel, enterprise.getLisOfOrganizations(),enterprise,ecoSystem);
        usersPanel.add("manageOrganizationJPanel", employees);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnEmployeesActionPerformed

    private void btnRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestsActionPerformed
        // TODO add your handling code here:
        ManageBloodJPanel manageBlood = new ManageBloodJPanel(usersPanel, enterprise.getLisOfOrganizations(),enterprise,ecoSystem,network);
        usersPanel.add("manageBlood", manageBlood);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.next(usersPanel);
    }//GEN-LAST:event_btnRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployees;
    private javax.swing.JButton btnOrganization;
    private javax.swing.JButton btnRequests;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel tfAdminDashboard;
    // End of variables declaration//GEN-END:variables
}
