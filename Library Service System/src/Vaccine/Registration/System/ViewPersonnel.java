/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccine.Registration.System;

import Classes.DatePicker;
import Classes.PersonnelDetails;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class ViewPersonnel extends javax.swing.JFrame {
    /**
     * Creates new form ViewLibrarian
     */

       PersonnelDetails p = new PersonnelDetails();
       
    private void ImportPersonnelDetailsToTable() {
        String filepath = "Personnel.txt";
        File file = new File(filepath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            DefaultTableModel model = (DefaultTableModel) jTablePersonnel.getModel();
            /*String[] columnsName = firstLine.split("|");
            String firstLine = br.readLine().trim();
            model.setColumnIdentifiers(columnsName);*/

            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" : ");
                model.addRow(dataRow);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void savePersonnelData(){
            String filePath ="Personnel.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < jTablePersonnel.getRowCount(); i++){
                for(int j = 0; j < jTablePersonnel.getColumnCount(); j++){
                    bw.write(jTablePersonnel.getValueAt(i,j).toString()+ " : " );
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fail");
        }
    }

    public ViewPersonnel() {
        initComponents();
        p.viewPersonnelTable(jTablePersonnel);
//        viewPersonnelTable(jTablePersonnel);
//        ImportPersonnelDetailsToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonnel = new javax.swing.JTable();
        txtSearchPersonnel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLEmailAddress = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        txtLUsername = new javax.swing.JTextField();
        txtLDOB = new javax.swing.JTextField();
        txtLMobileNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbLGender = new javax.swing.JComboBox<>();
        btnSelectDateStdDOB = new javax.swing.JToggleButton();
        txtLPassword = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnStudentUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchUser.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setText("Personnel Details");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTablePersonnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePersonnelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePersonnel);
        if (jTablePersonnel.getColumnModel().getColumnCount() > 0) {
            jTablePersonnel.getColumnModel().getColumn(0).setHeaderValue("Librarian Id");
            jTablePersonnel.getColumnModel().getColumn(1).setHeaderValue("Name");
            jTablePersonnel.getColumnModel().getColumn(2).setHeaderValue("Gender");
            jTablePersonnel.getColumnModel().getColumn(3).setHeaderValue("Username");
            jTablePersonnel.getColumnModel().getColumn(4).setHeaderValue("Password");
            jTablePersonnel.getColumnModel().getColumn(5).setResizable(false);
            jTablePersonnel.getColumnModel().getColumn(5).setHeaderValue("DOB");
            jTablePersonnel.getColumnModel().getColumn(6).setResizable(false);
            jTablePersonnel.getColumnModel().getColumn(6).setHeaderValue("Email");
            jTablePersonnel.getColumnModel().getColumn(7).setResizable(false);
            jTablePersonnel.getColumnModel().getColumn(7).setHeaderValue("Mobile No");
        }

        txtSearchPersonnel.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtSearchPersonnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonnelActionPerformed(evt);
            }
        });
        txtSearchPersonnel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchPersonnelKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setText("Search:");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel7.setText("Email Address:");

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel8.setText("Mobile Number:");

        txtLEmailAddress.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLEmailAddressActionPerformed(evt);
            }
        });

        txtPName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });

        txtLUsername.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLUsernameActionPerformed(evt);
            }
        });

        txtLDOB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLDOBActionPerformed(evt);
            }
        });

        txtLMobileNumber.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLMobileNumberActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel9.setText("Username:");

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel10.setText("Gender:");

        cmbLGender.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbLGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        cmbLGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLGenderActionPerformed(evt);
            }
        });

        btnSelectDateStdDOB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnSelectDateStdDOB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Calender.png"))); // NOI18N
        btnSelectDateStdDOB.setText("Select Date");
        btnSelectDateStdDOB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSelectDateStdDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDateStdDOBActionPerformed(evt);
            }
        });

        txtLPassword.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLPasswordActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnStudentUpdate.setText("Update");
        btnStudentUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(19, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbLGender, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtLDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectDateStdDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(txtSearchPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnStudentUpdate)
                .addGap(63, 63, 63)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSearchPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cmbLGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtLUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectDateStdDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtLMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnStudentUpdate))
                        .addGap(43, 43, 43))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchPersonnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonnelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPersonnelActionPerformed

    private void txtSearchPersonnelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPersonnelKeyReleased
       p.searchPersonnel(jTablePersonnel, txtSearchPersonnel);
//        DefaultTableModel table = (DefaultTableModel) jTablePersonnel.getModel();
//        String search = txtSearchPersonnel.getText();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
//        jTablePersonnel.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchPersonnelKeyReleased

    private void txtLEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLEmailAddressActionPerformed

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameActionPerformed

    private void txtLUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLUsernameActionPerformed

    private void txtLDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLDOBActionPerformed

    private void txtLMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLMobileNumberActionPerformed

    private void btnSelectDateStdDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDateStdDOBActionPerformed
        DatePicker datePicker = new DatePicker(this);
        txtLDOB.setText(datePicker.setPickedDate());
    }//GEN-LAST:event_btnSelectDateStdDOBActionPerformed

    private void txtLPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLPasswordActionPerformed


    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        p.deletePersonnel(txtPName);
        jTablePersonnel.setModel(new DefaultTableModel());
        p.viewPersonnelTable(jTablePersonnel);
//        DefaultTableModel tblModel = (DefaultTableModel)jTablePersonnel.getModel();
//        
//        if(jTablePersonnel.getSelectedRowCount()==1){
//            tblModel.removeRow(jTablePersonnel.getSelectedRow());
//            JOptionPane.showMessageDialog(this, "The data is deleted from the table.");
//            savePersonnelData();
//        }else{
//            if (jTablePersonnel.getRowCount() == 0){
//                JOptionPane.showMessageDialog(this, "Table is Empty.");
//            }else{
//                JOptionPane.showMessageDialog(this, "Please select single row for delete.");
//            }
//        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTablePersonnelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePersonnelMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)jTablePersonnel.getModel();
        
        //set data to textfield when row i selected
        String tblId = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 0).toString();
        String tblName = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 2).toString();
        String tblGender = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 2).toString();
        String tblUsername = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 3).toString();
        String tblPassword = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 4).toString();
        String tblDOB = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 5).toString();
        String tblEmail = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 6).toString();
        String tblMobile = tblModel.getValueAt(jTablePersonnel.getSelectedRow(), 7).toString();
        
        txtPName.setText(tblName);
        cmbLGender.setSelectedItem(tblGender);
        txtLUsername.setText(tblUsername);
        txtLPassword.setText(tblPassword);
        txtLDOB.setText(tblDOB);
        txtLEmailAddress.setText(tblEmail);
        txtLMobileNumber.setText(tblMobile);
    }//GEN-LAST:event_jTablePersonnelMouseClicked

    private void btnStudentUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentUpdateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTablePersonnel.getModel();
        if(jTablePersonnel.getSelectedRowCount()==1){
            String tblName = txtPName.getText();
            String tblGender = cmbLGender.getSelectedItem().toString();
            String tblUsername = txtLUsername.getText();
            String tblPassword = txtLPassword.getText();
            String tblDOB = txtLDOB.getText();
            String tblEmail = txtLEmailAddress.getText();
            String tblMobile = txtLMobileNumber.getText();

            tblModel.setValueAt(tblName,jTablePersonnel.getSelectedRow(), 1);
            tblModel.setValueAt(tblGender,jTablePersonnel.getSelectedRow(), 2);
            tblModel.setValueAt(tblUsername,jTablePersonnel.getSelectedRow(), 3);
            tblModel.setValueAt(tblPassword ,jTablePersonnel.getSelectedRow(), 4);
            tblModel.setValueAt(tblDOB ,jTablePersonnel.getSelectedRow(), 5);
            tblModel.setValueAt(tblEmail,jTablePersonnel.getSelectedRow(), 6);
            tblModel.setValueAt(tblMobile,jTablePersonnel.getSelectedRow(), 7);

            JOptionPane.showMessageDialog(this, "Update Successfully.");
            savePersonnelData();
        }else{
            if (jTablePersonnel.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single row for update.");
            }
        }
    }//GEN-LAST:event_btnStudentUpdateActionPerformed

    private void cmbLGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLGenderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPersonnel().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JToggleButton btnSelectDateStdDOB;
    private javax.swing.JButton btnStudentUpdate;
    private javax.swing.JComboBox<String> cmbLGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePersonnel;
    private javax.swing.JTextField txtLDOB;
    private javax.swing.JTextField txtLEmailAddress;
    private javax.swing.JTextField txtLMobileNumber;
    private javax.swing.JTextField txtLPassword;
    private javax.swing.JTextField txtLUsername;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtSearchPersonnel;
    // End of variables declaration//GEN-END:variables
}
