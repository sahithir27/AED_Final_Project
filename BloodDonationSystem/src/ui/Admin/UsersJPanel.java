/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Role.Role;
import model.Users.Users;
import model.Users.UsersDirectory;

/**
 *
 * @author sahithigaddam
 */
public class UsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UsersJPanel
     */
    
    private JPanel usersPanel;
    private Enterprise enterprise;
    private UsersDirectory listOfUsers;
    ArrayList <String> userstring = new ArrayList<String>();
    HashMap <String,String> name_id = new HashMap<String, String>();
    
    public UsersJPanel(JPanel usersPanel, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.usersPanel = usersPanel;
        getUserName();
        getOrganization();
        populateData();
        getUser();
    }
    
    public void getUserName(){
        
        for(Organization organization:enterprise.getLisOfOrganizations().getOrganizationList()){
            for(Users user : organization.getListOfUsers().getAccountList()){
            System.out.println("Actual users"+ user.toString());
            name_id.put(user.getEmployee().toString(),user.toString());}
        }
    }
    public void getUser(){
        for(Users user : enterprise.getListOfUsers().getAccountList()){
            userstring.add(user.toString());
        }
    }

    public void getOrganization() {
        cbOrganization.removeAllItems();
        for (Organization organization : enterprise.getLisOfOrganizations().getOrganizationList()) {
            cbOrganization.addItem(organization);
        }
    }

    
    public void initEmployeeComboBox(Organization organization){
        cbEmployeeName.removeAllItems();
        for (Employee employee : organization.getListOfEmployees().getListOfEmployees()){
            cbEmployeeName.addItem(employee);
        }
    }
    
    private void initRoleComboBox(Organization organization){
        cbRole.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            cbRole.addItem(role);
        }
    }
    
   

    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) tblCurrentAccounts.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getLisOfOrganizations().getOrganizationList()) {
            for (Users users : organization.getListOfUsers().getAccountList()) {
                Object row[] = new Object[2];
                row[0] = users;
                row[1] = users.getUserRole();
                ((DefaultTableModel) tblCurrentAccounts.getModel()).addRow(row);
                userstring.add(users.toString());
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

        btnCreateUser = new javax.swing.JButton();
        tfUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        tblUserDetails = new javax.swing.JScrollPane();
        tblCurrentAccounts = new javax.swing.JTable();
        lblPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lblEmployeeName = new javax.swing.JLabel();
        cbEmployeeName = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblOrganization = new javax.swing.JLabel();
        cbOrganization = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox();
        lblAddress = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        lblQualification = new javax.swing.JLabel();
        tfQualification = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        tfContact = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lblSex = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        lblTitle = new javax.swing.JLabel();
        lblCurrentAccount = new javax.swing.JLabel();
        lblMustText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        btnCreateUser.setBackground(new java.awt.Color(0, 183, 210));
        btnCreateUser.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCreateUser.setText("Create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        tfUsername.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblUsername.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("User Name*:");

        tblCurrentAccounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblCurrentAccounts.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblCurrentAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserDetails.setViewportView(tblCurrentAccounts);

        lblPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password*:");

        tfPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblEmployeeName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblEmployeeName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmployeeName.setText("Employee:");

        cbEmployeeName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbEmployeeName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmployeeNameActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 183, 210));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganization.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblOrganization.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOrganization.setText("Organization:");

        cbOrganization.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrganizationActionPerformed(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRole.setText("Role:");

        cbRole.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAddress.setText("Address*:");

        tfAddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        lblQualification.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblQualification.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblQualification.setText("Qualifications*:");

        tfQualification.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContact.setText("Contact*:");

        tfContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age*:");

        tfAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        lblSex.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSex.setText("Gender*:");

        radMale.setBackground(new java.awt.Color(255, 255, 255));
        radMale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radMale.setText("M");

        radFemale.setBackground(new java.awt.Color(255, 255, 255));
        radFemale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radFemale.setText("F");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 183, 210));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CREATE USER ACCOUNT");

        lblCurrentAccount.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lblCurrentAccount.setText("Current accounts");

        lblMustText.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        lblMustText.setForeground(new java.awt.Color(255, 51, 51));
        lblMustText.setText("* fields are mandatory to fill");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BloodBankJPanel/User.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(785, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(62, 62, 62))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                                .addComponent(tfContact)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfUsername))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblOrganization))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbRole, 0, 307, Short.MAX_VALUE)
                                        .addComponent(cbOrganization, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(102, 102, 102)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(lblSex, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 150, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(cbEmployeeName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfQualification, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                        .addComponent(tfAddress)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfAge))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(380, 380, 380)
                            .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblMustText, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tblUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(lblCurrentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(lblTitle)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblOrganization)
                                .addComponent(cbOrganization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRole)
                                .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsername))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPassword)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblContact)
                                .addComponent(tfContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(lblAge)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSex)
                                    .addComponent(radMale)
                                    .addComponent(radFemale)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmployeeName)
                                    .addComponent(cbEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQualification)
                                    .addComponent(tfQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMustText))
                    .addGap(59, 59, 59)
                    .addComponent(lblCurrentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tblUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = tfUsername.getText();
        String password = tfPassword.getText();
        String phNum = tfContact.getText();
        String address = tfAddress.getText();
        String qualification = tfQualification.getText();
        boolean nameMatch=true,userNameMatch=true,passMatch=true,qualificationMatch=true;
        String sex;
        int f=0;
        int newage=0;
        boolean availability=true;
        boolean organavail = true;
        String age = tfAge.getText();
        if(radMale.isSelected()){
            sex = radMale.getText();
        }
        else {
            sex = radFemale.getText();
        }

        if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address can't be empty");
            return;
        }
        boolean flag;
        flag = userName.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "UserName must be in format of A@B.C");
            userNameMatch=false;
            return;}
        else {
            for(String s:userstring){
                if(s.equalsIgnoreCase(userName)){
                    JOptionPane.showMessageDialog(null, "Username exists please take another username");
                    userNameMatch=false;
                    return;
                }
            }

        }

        flag =password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Password should contain at least  a Character, One Captial,Small letter with minimum 8 characters length");
            passMatch = false;

            return;}
        if(phNum == null || phNum.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter Contact Number");
            return;
        }
        else{
            if(!phNum.matches("^(?=.*[0-9]).{10,10}")){
                JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                return;
            }
        }

        if(qualification.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")){
            f=1;
        }
        else{
            qualificationMatch=false;
            return;
        }
        if(age.matches("[0-9]+")){
            newage = Integer.parseInt(age);
            if(newage<0 || newage>200){
                JOptionPane.showMessageDialog(null, "Age should be between 1 and 199");
            }
            f=1;
        }
        else{
            return;
        }

        if(f==0){
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        }
        else{
            for(String s:name_id.keySet()){
                System.out.println("In keyset"+s);
                if(name_id.containsKey(cbEmployeeName.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "User already has an account");
                    return;
                }
            }
            Organization organization = (Organization) cbOrganization.getSelectedItem();
            Employee employee = (Employee) cbEmployeeName.getSelectedItem();
            Role role = (Role) cbRole.getSelectedItem();
            organization.getListOfUsers().createUserAccount(userName,password,phNum,address,qualification, sex, availability, newage, employee, role,organavail);
            getUserName();
            populateData();
        }
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void cbEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmployeeNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        usersPanel.remove(this);
        CardLayout layout = (CardLayout) usersPanel.getLayout();
        layout.previous(usersPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrganizationActionPerformed
        Organization organization = (Organization) cbOrganization.getSelectedItem();
        if (organization != null){
            initEmployeeComboBox(organization);
            initRoleComboBox(organization);
        }

    }//GEN-LAST:event_cbOrganizationActionPerformed

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
        tfAge.setVisible(true);
        lblAge.setVisible(true);
        radFemale.setVisible(true);
        radMale.setVisible(true);
        lblSex.setVisible(true);

    }//GEN-LAST:event_cbRoleActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JComboBox cbEmployeeName;
    private javax.swing.JComboBox cbOrganization;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblCurrentAccount;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblMustText;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQualification;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTable tblCurrentAccounts;
    private javax.swing.JScrollPane tblUserDetails;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfContact;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfQualification;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
