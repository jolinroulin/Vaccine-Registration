/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineRegistrationSystem;

import Classes.DatePicker;
import Classes.Student;
import Classes.PeopleDetails;
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
public class ViewPeople extends javax.swing.JFrame {

    
    private void ImportPeopleDetailsToTable() {
        String filepath = "Citizen.txt";
        File file = new File(filepath);
        String filepath1 = "NonCitizen.txt";
        File file1 = new File(filepath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) jTablePeople.getModel();
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            DefaultTableModel model1 = (DefaultTableModel) jTablePeople.getModel();
            /*String[] columnsName = firstLine.split(" : ");
            
            model.setColumnIdentifiers(columnsName);*/
            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" : ");
                model.addRow(dataRow);
            }
            Object[] tableLines1 = br.lines().toArray();
            for (int i = 0; i < tableLines1.length; i++) {
                String line = tableLines1[i].toString().trim();
                String[] dataRow = line.split(" : ");
                model1.addRow(dataRow);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ViewStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveStudentDetails(){
                String filePath = "C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\StudentData.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < jTablePeople.getRowCount(); i++){
                for(int j = 0; j < jTablePeople.getColumnCount(); j++){
                    bw.write(jTablePeople.getValueAt(i,j).toString()+ " : " );
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fail to save in textfile");
        }
    }
    /**
     * Creates new form ViewStudent
     */
    public ViewPeople() {
        initComponents();
        ImportPeopleDetailsToTable();
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
        jTablePeople = new javax.swing.JTable();
        txtSearchPeople = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStdContactNumber = new javax.swing.JTextField();
        txtStdPassword = new javax.swing.JTextField();
        txtStdName = new javax.swing.JTextField();
        txtStdDOB = new javax.swing.JTextField();
        txtStdICPassport = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbStdGender = new javax.swing.JComboBox<>();
        btnSelectDateStdDOB = new javax.swing.JToggleButton();
        txtStdEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStdId = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnPeopleUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchUser.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setText("People Details");

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
                .addGap(411, 411, 411)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );

        jTablePeople.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "People Id", "Password", "Name", "Gender", "E-mail", "Date of Birth", "Contact Number", "IC/Passport"
            }
        ));
        jTablePeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePeople);

        txtSearchPeople.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtSearchPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPeopleActionPerformed(evt);
            }
        });
        txtSearchPeople.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchPeopleKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setText("Search:");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel5.setText("E-mail:");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel7.setText("Contact Number:");

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel8.setText("IC/Passport:");

        txtStdContactNumber.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtStdContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdContactNumberActionPerformed(evt);
            }
        });

        txtStdPassword.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtStdPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdPasswordActionPerformed(evt);
            }
        });

        txtStdName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtStdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdNameActionPerformed(evt);
            }
        });

        txtStdDOB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtStdDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdDOBActionPerformed(evt);
            }
        });

        txtStdICPassport.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtStdICPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdICPassportActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel9.setText("Gender:");

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel10.setText("Name:");

        cmbStdGender.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbStdGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));

        btnSelectDateStdDOB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnSelectDateStdDOB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Calender.png"))); // NOI18N
        btnSelectDateStdDOB.setText("Select Date");
        btnSelectDateStdDOB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSelectDateStdDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDateStdDOBActionPerformed(evt);
            }
        });

        txtStdEmail.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtStdEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdEmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel11.setText("People Id:");

        txtStdId.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtStdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdIdActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPeopleUpdate.setText("Update");
        btnPeopleUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbStdGender, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStdName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(txtStdId, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(txtStdICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtStdContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtStdDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtStdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectDateStdDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnPeopleUpdate)
                        .addGap(81, 81, 81)
                        .addComponent(btnDelete)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txtSearchPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtStdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbStdGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStdDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnSelectDateStdDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStdContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStdICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPeopleUpdate)
                            .addComponent(btnDelete))
                        .addGap(62, 62, 62))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jTablePeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePeopleMouseClicked
        //set data to the textfile
        DefaultTableModel tblModel = (DefaultTableModel)jTablePeople.getModel();

        //set data to textfield when row i selected
        String tblId = tblModel.getValueAt(jTablePeople.getSelectedRow(), 0).toString();
        String tblPassword = tblModel.getValueAt(jTablePeople.getSelectedRow(), 1).toString();
        String tblName = tblModel.getValueAt(jTablePeople.getSelectedRow(), 2).toString();
        String tblGender = tblModel.getValueAt(jTablePeople.getSelectedRow(), 3).toString();
        String tblEmail = tblModel.getValueAt(jTablePeople.getSelectedRow(), 4).toString();
        String tblDOB = tblModel.getValueAt(jTablePeople.getSelectedRow(), 5).toString();
        String tblContactNo = tblModel.getValueAt(jTablePeople.getSelectedRow(), 6).toString();
        String tblICPassport = tblModel.getValueAt(jTablePeople.getSelectedRow(), 7).toString();
        
      
        txtStdId.setText(tblId);
        txtStdPassword.setText(tblPassword);
        cmbStdGender.setSelectedItem(tblGender);
        txtStdName.setText(tblName);
        txtStdEmail.setText(tblEmail);
        txtStdDOB.setText(tblDOB);
        txtStdContactNumber.setText(tblContactNo);
        txtStdICPassport.setText(tblICPassport);


    }//GEN-LAST:event_jTablePeopleMouseClicked

    private void txtSearchPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPeopleActionPerformed

    private void txtSearchPeopleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPeopleKeyReleased
        DefaultTableModel table = (DefaultTableModel) jTablePeople.getModel();
        String search = txtSearchPeople.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        jTablePeople.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchPeopleKeyReleased

    private void txtStdContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdContactNumberActionPerformed

    private void txtStdPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdPasswordActionPerformed

    private void txtStdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdNameActionPerformed

    private void txtStdDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdDOBActionPerformed

    private void txtStdICPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdICPassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdICPassportActionPerformed

    private void btnSelectDateStdDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDateStdDOBActionPerformed
        DatePicker datePicker = new DatePicker(this);
        txtStdDOB.setText(datePicker.setPickedDate());
    }//GEN-LAST:event_btnSelectDateStdDOBActionPerformed

    private void txtStdEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdEmailActionPerformed

    private void txtStdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String tblId = txtStdId.getText();
        if (tblId.substring(0,1)=="3"){
            PeopleDetails x = new PeopleDetails();
            x.deleteCitzenDetails(tblId);
        }else if(tblId.substring(0,1)=="4"){
            PeopleDetails x = new PeopleDetails();
            x.deleteNonCitzenDetails(tblId);
        }
        /*DefaultTableModel tblModel = (DefaultTableModel)jTablePeople.getModel();

        if(jTablePeople.getSelectedRowCount()==1){
            tblModel.removeRow(jTablePeople.getSelectedRow());
            JOptionPane.showMessageDialog(this, "The data is deleted from the table.");
            saveStudentDetails();
        }else{
            if (jTablePeople.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single row for delete.");
            }
        }
        */
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPeopleUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleUpdateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTablePeople.getModel();
        if(jTablePeople.getSelectedRowCount()==1){
        String tblId = txtStdId.getText();
        String tblPassword = txtStdPassword.getText();
        String tblGender = cmbStdGender.getSelectedItem().toString();
        String tblname = txtStdName.getText();
        String tblEmail = txtStdEmail.getText();
        String tblDOB = txtStdDOB.getText();
        String tblContactNo = txtStdContactNumber.getText();
        String tblIcPassport = txtStdICPassport.getText();
        
        if (tblId.substring(0,1).equals("3")){
            PeopleDetails x = new PeopleDetails();
            x.updateCitzenDetails(tblId, tblPassword, tblname, tblGender, tblEmail, tblDOB, tblContactNo, tblIcPassport);
        }else if(tblId.substring(0,1).equals("4")){
            PeopleDetails x = new PeopleDetails();
            x.updateNonCitzenDetails(tblId, tblPassword, tblname, tblGender, tblEmail, tblDOB, tblContactNo, tblIcPassport);
        }
        
        

        
        JOptionPane.showMessageDialog(this, "Update Successfully.");
 
        }else{
            if (jTablePeople.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single row for update.");
            }
        }          
    }//GEN-LAST:event_btnPeopleUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPeople().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPeopleUpdate;
    private javax.swing.JToggleButton btnSelectDateStdDOB;
    private javax.swing.JComboBox<String> cmbStdGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable jTablePeople;
    private javax.swing.JTextField txtSearchPeople;
    private javax.swing.JTextField txtStdContactNumber;
    private javax.swing.JTextField txtStdDOB;
    private javax.swing.JTextField txtStdEmail;
    private javax.swing.JTextField txtStdICPassport;
    private javax.swing.JTextField txtStdId;
    private javax.swing.JTextField txtStdName;
    private javax.swing.JTextField txtStdPassword;
    // End of variables declaration//GEN-END:variables
}
