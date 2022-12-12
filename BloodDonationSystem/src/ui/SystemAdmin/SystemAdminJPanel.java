/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.EcoSystem;

/**
 *
 * @author varshareddykumbham
 */
public class SystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }
    
    public void populateTree(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_manage_network = new javax.swing.JButton();
        btn_manage_enterprise = new javax.swing.JButton();
        btn_manage_admins = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        btn_manage_network.setBackground(new java.awt.Color(0, 183, 210));
        btn_manage_network.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btn_manage_network.setForeground(new java.awt.Color(255, 255, 255));
        btn_manage_network.setText("Manage Network");
        btn_manage_network.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_networkActionPerformed(evt);
            }
        });

        btn_manage_enterprise.setBackground(new java.awt.Color(0, 183, 210));
        btn_manage_enterprise.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_enterprise.setForeground(new java.awt.Color(255, 255, 255));
        btn_manage_enterprise.setText("Manage Enterprise");
        btn_manage_enterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_enterpriseActionPerformed(evt);
            }
        });

        btn_manage_admins.setBackground(new java.awt.Color(0, 183, 210));
        btn_manage_admins.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_admins.setForeground(new java.awt.Color(255, 255, 255));
        btn_manage_admins.setText("Manage Enterprise Admin");
        btn_manage_admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_adminsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 183, 210));
        jLabel1.setText("SYSTEM ADMIN DASHBOARD");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SystemAdmin/enterpriseAdmin.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SystemAdmin/enterprise-PhotoRoom.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SystemAdmin/network1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_manage_network, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(btn_manage_enterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_manage_admins)
                    .addComponent(jLabel2))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_manage_network, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_manage_enterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manage_admins)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_manage_networkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_networkActionPerformed
        NetworkJPanel manageNetworkJPanel=new NetworkJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_networkActionPerformed

    private void btn_manage_enterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_enterpriseActionPerformed
        EnterpriseJPanel emj=new EnterpriseJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manage enterprise",emj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_enterpriseActionPerformed

    private void btn_manage_adminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_adminsActionPerformed
        AdminsJPanel amj=new AdminsJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manage admins",amj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_adminsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_manage_admins;
    private javax.swing.JButton btn_manage_enterprise;
    private javax.swing.JButton btn_manage_network;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
