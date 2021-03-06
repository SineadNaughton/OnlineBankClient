/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebankclient;

/**
 *
 * @author Sinead Naughton
 */
public class BankGUI extends javax.swing.JFrame {

    /**
     * Creates new form BankGUI
     */
    public BankGUI() {
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

        ppsTf = new javax.swing.JTextField();
        passwordTf = new javax.swing.JTextField();
        ppsLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        customerIdTf = new javax.swing.JTextField();
        customerIdLbl = new javax.swing.JLabel();
        addCustomerBtn = new javax.swing.JButton();
        deleteCustomerBtn = new javax.swing.JButton();
        customerUpdateBtn = new javax.swing.JButton();
        customerViewBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTa = new javax.swing.JTextArea();
        accountNoTf = new javax.swing.JTextField();
        accountNoLbl = new javax.swing.JLabel();
        addAccountBtn = new javax.swing.JButton();
        deleteAccountBtn = new javax.swing.JButton();
        updateAccountBtn = new javax.swing.JButton();
        viewAccountBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountTa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ppsLbl.setText("PPS");

        passwordLbl.setText("Password");

        customerIdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdTfActionPerformed(evt);
            }
        });

        customerIdLbl.setText("CustomerId");

        addCustomerBtn.setText("Add");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        deleteCustomerBtn.setText("Delete");
        deleteCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerBtnActionPerformed(evt);
            }
        });

        customerUpdateBtn.setText("Update");
        customerUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUpdateBtnActionPerformed(evt);
            }
        });

        customerViewBtn.setText("View");
        customerViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerViewBtnActionPerformed(evt);
            }
        });

        customerTa.setColumns(20);
        customerTa.setRows(5);
        jScrollPane1.setViewportView(customerTa);

        accountNoLbl.setText("Account No");

        addAccountBtn.setText("Add");
        addAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountBtnActionPerformed(evt);
            }
        });

        deleteAccountBtn.setText("Delete");
        deleteAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountBtnActionPerformed(evt);
            }
        });

        updateAccountBtn.setText("Update Branch");
        updateAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountBtnActionPerformed(evt);
            }
        });

        viewAccountBtn.setText("View");
        viewAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccountBtnActionPerformed(evt);
            }
        });

        accountTa.setColumns(20);
        accountTa.setRows(5);
        jScrollPane2.setViewportView(accountTa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(ppsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordLbl)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customerIdLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(customerUpdateBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(customerViewBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addCustomerBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteCustomerBtn))
                                    .addComponent(customerIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ppsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountNoLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addAccountBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteAccountBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateAccountBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewAccountBtn))
                            .addComponent(accountNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsLbl)
                    .addComponent(passwordLbl))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(customerIdLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCustomerBtn)
                            .addComponent(deleteCustomerBtn))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerUpdateBtn)
                            .addComponent(customerViewBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountNoLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accountNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addAccountBtn)
                            .addComponent(deleteAccountBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateAccountBtn)
                            .addComponent(viewAccountBtn)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerIdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdTfActionPerformed

    private void customerViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerViewBtnActionPerformed
        // TODO add your handling code here:
        OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
        
        customerTa.setText(onlineBankService.getAllCustomers());
    }//GEN-LAST:event_customerViewBtnActionPerformed

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
        String customer = customerTa.getText();
        customerTa.setText(onlineBankService.addCustomer(customer));
        
    }//GEN-LAST:event_addCustomerBtnActionPerformed

    private void deleteCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerBtnActionPerformed
        // TODO add your handling code here:
        OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
        String customerId = customerIdTf.getText();
        customerTa.setText(onlineBankService.deleteCustomer(Integer.parseInt(customerId)));
    }//GEN-LAST:event_deleteCustomerBtnActionPerformed

    private void customerUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUpdateBtnActionPerformed
        // TODO add your handling code here:
         OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
         String customerId = customerIdTf.getText();
        String customer = customerTa.getText();
        customerTa.setText(onlineBankService.updateCustomer(Integer.parseInt(customerId), customer));
    }//GEN-LAST:event_customerUpdateBtnActionPerformed

    private void addAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountBtnActionPerformed
        // TODO add your handling code here:
        OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
        String customerId = customerIdTf.getText();
        String account = accountTa.getText();
        accountTa.setText(onlineBankService.addAccount(Integer.parseInt(customerId), account));
    }//GEN-LAST:event_addAccountBtnActionPerformed

    private void viewAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccountBtnActionPerformed
        // TODO add your handling code here:
        OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
        String customerId = customerIdTf.getText();
        String accountNo = accountNoTf.getText();
        accountTa.setText(onlineBankService.getAccount(Integer.parseInt(customerId), Integer.parseInt(accountNo)));
    }//GEN-LAST:event_viewAccountBtnActionPerformed

    private void deleteAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountBtnActionPerformed
        // TODO add your handling code here:
        OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
        String customerId = customerIdTf.getText();
        String accountNo = accountNoTf.getText();
        accountTa.setText(onlineBankService.deleteAccount(Integer.parseInt(customerId), Integer.parseInt(accountNo)));
    }//GEN-LAST:event_deleteAccountBtnActionPerformed

    private void updateAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAccountBtnActionPerformed
        // TODO add your handling code here:
        OnlineBankService onlineBankService = new OnlineBankService(ppsTf.getText(), passwordTf.getText());
        String customerId = customerIdTf.getText();
        String account = accountTa.getText();
        String accountNo = accountNoTf.getText();
        accountTa.setText(onlineBankService.updateAccountBranch(Integer.parseInt(customerId), Integer.parseInt(accountNo), account));
    }//GEN-LAST:event_updateAccountBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNoLbl;
    private javax.swing.JTextField accountNoTf;
    private javax.swing.JTextArea accountTa;
    private javax.swing.JButton addAccountBtn;
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JLabel customerIdLbl;
    private javax.swing.JTextField customerIdTf;
    private javax.swing.JTextArea customerTa;
    private javax.swing.JButton customerUpdateBtn;
    private javax.swing.JButton customerViewBtn;
    private javax.swing.JButton deleteAccountBtn;
    private javax.swing.JButton deleteCustomerBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTf;
    private javax.swing.JLabel ppsLbl;
    private javax.swing.JTextField ppsTf;
    private javax.swing.JButton updateAccountBtn;
    private javax.swing.JButton viewAccountBtn;
    // End of variables declaration//GEN-END:variables
}
