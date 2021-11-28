/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import Classes.Book;
import Classes.BookDetails;
import Classes.DatePicker;
import Classes.Librarian;
import Classes.LibrarianDetails;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnLRegister = new javax.swing.JToggleButton();
        btnLClear = new javax.swing.JButton();
        txtBookName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBookAuthor = new javax.swing.JTextField();
        txtBookPublisher = new javax.swing.JTextField();
        txtBookPrice = new javax.swing.JTextField();
        txtBookQuantity = new javax.swing.JTextField();
        txtBookAvailable = new javax.swing.JTextField();
        cmbBookType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 550));
        jPanel1.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setText("Book Author:");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel5.setText("Book Publisher:");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel7.setText("Book type:");

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel8.setText("Book Price:");

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setText("Add New Book");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addbook.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel16)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel10.setText("Book Name:");

        btnLRegister.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btnLRegister.setText("Add Book");
        btnLRegister.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLRegisterActionPerformed(evt);
            }
        });

        btnLClear.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btnLClear.setText("Clear");
        btnLClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLClearActionPerformed(evt);
            }
        });

        txtBookName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel11.setText("Book Quantity:");

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel12.setText("Available Book:");

        txtBookAuthor.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtBookAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookAuthorActionPerformed(evt);
            }
        });

        txtBookPublisher.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtBookPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookPublisherActionPerformed(evt);
            }
        });

        txtBookPrice.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtBookPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookPriceActionPerformed(evt);
            }
        });

        txtBookQuantity.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtBookQuantity.setText("1");
        txtBookQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookQuantityActionPerformed(evt);
            }
        });

        txtBookAvailable.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtBookAvailable.setText("Yes");
        txtBookAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookAvailableActionPerformed(evt);
            }
        });

        cmbBookType.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbBookType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academic ", "Entertainment", "Others" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookQuantity)
                            .addComponent(txtBookPrice)
                            .addComponent(txtBookName)
                            .addComponent(txtBookPublisher)
                            .addComponent(txtBookAuthor)
                            .addComponent(txtBookAvailable)
                            .addComponent(cmbBookType, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnLClear)
                        .addGap(67, 67, 67)
                        .addComponent(btnLRegister)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbBookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtBookAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLClear)
                    .addComponent(btnLRegister))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLRegisterActionPerformed
        if(txtBookName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtBookAuthor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtBookPublisher.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtBookPrice.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtBookQuantity.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtBookAvailable.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else {
        String bookID = null;
        String bookName = txtBookName.getText();
        String bookAuthor = txtBookAuthor.getText();
        String bookPublisher = txtBookPublisher.getText();
        String bookType = cmbBookType.getSelectedItem().toString();    
        String bookPrice = txtBookPrice.getText();
        String bookQuantity = txtBookQuantity.getText();
        String bookAvailable = txtBookAvailable.getText();

        Book book = new Book(bookID, bookName, bookAuthor, bookPublisher, bookType, bookPrice, bookQuantity, bookAvailable);
         
        BookDetails bookDetails = new BookDetails();
        
        bookDetails.addBookToTextFile(book);

        cmbBookType.setSelectedItem(0);
        txtBookName.setText("");
        txtBookAuthor.setText("");
        txtBookPublisher.setText("");
        txtBookPrice.setText("");
        txtBookQuantity.setText("1");
        txtBookAvailable.setText("Yes");
        }
    }//GEN-LAST:event_btnLRegisterActionPerformed

    private void btnLClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLClearActionPerformed
        cmbBookType.setSelectedItem(0);
        txtBookName.setText("");
        txtBookAuthor.setText("");
        txtBookPublisher.setText("");
        txtBookPrice.setText("");
        txtBookQuantity.setText("1");
        txtBookAvailable.setText("Yes");
    }//GEN-LAST:event_btnLClearActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookNameActionPerformed

    private void txtBookAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookAuthorActionPerformed

    private void txtBookPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookPublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookPublisherActionPerformed

    private void txtBookPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookPriceActionPerformed

    private void txtBookQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookQuantityActionPerformed

    private void txtBookAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookAvailableActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLClear;
    private javax.swing.JToggleButton btnLRegister;
    private javax.swing.JComboBox<String> cmbBookType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBookAuthor;
    private javax.swing.JTextField txtBookAvailable;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBookPrice;
    private javax.swing.JTextField txtBookPublisher;
    private javax.swing.JTextField txtBookQuantity;
    // End of variables declaration//GEN-END:variables
}
