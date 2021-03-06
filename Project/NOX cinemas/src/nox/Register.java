/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nox;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import java.awt.event.ActionEvent;
//import javax.mail.*;
//import javax.mail.internet.*;
//import java.util.*;
//import javax.activation.*
/**
 *
 * @author Praneeth
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    Statement s = null;
    ResultSet rs = null;
    public Register() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        namelabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        phonelabel = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        doblabel = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        back = new javax.swing.JButton();
        SecurityQuestion_Label = new javax.swing.JLabel();
        Question_ComboBox = new javax.swing.JComboBox();
        Answer_Label = new javax.swing.JLabel();
        Answer_TextField = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        namelabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        namelabel.setForeground(new java.awt.Color(204, 204, 204));
        namelabel.setText("First Name");

        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        passwordlabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        passwordlabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordlabel.setText("Last Name");

        emaillabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        emaillabel.setForeground(new java.awt.Color(204, 204, 204));
        emaillabel.setText("E-Mail address");

        email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        phonelabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        phonelabel.setForeground(new java.awt.Color(204, 204, 204));
        phonelabel.setText("Phone");

        phone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        doblabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        doblabel.setForeground(new java.awt.Color(204, 204, 204));
        doblabel.setText("Date Of Birth");

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        SecurityQuestion_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        SecurityQuestion_Label.setForeground(new java.awt.Color(204, 204, 204));
        SecurityQuestion_Label.setText("Security Question");

        Question_ComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Question_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Your childhood hero ?", " ", "Your first movie ?" }));

        Answer_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Answer_Label.setForeground(new java.awt.Color(204, 204, 204));
        Answer_Label.setText("Your Answer");

        Answer_TextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        lastname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        dob.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(758, 758, 758)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emaillabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(phonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(127, 127, 127))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SecurityQuestion_Label)
                                    .addComponent(Answer_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doblabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Answer_TextField)
                            .addComponent(Question_ComboBox, 0, 214, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastname)
                            .addComponent(dob))))
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlabel)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emaillabel))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonelabel)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doblabel)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecurityQuestion_Label)
                    .addComponent(Question_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Answer_Label)
                    .addComponent(Answer_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nox/cinemas/Background/Register_page_background2.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(background, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String first_name = name.getText();
        String last_name = lastname.getText();
        String mail = email.getText();
        String number = phone.getText();
        String birth = dob.getText();
        int index = Question_ComboBox.getSelectedIndex();
        String answer = Answer_TextField.getText();
        String question = "";
        int flag = 0;
        if(index == 0)
        {
            question = "Your childhood hero ?";
        }
        else if(index == 1)
        {
            question = "Your pet's name ?";
        }
        else if(index == 2)
        {
            question = "Your first movie ?";
        }
           
        if("".equals(first_name) || "".equals(last_name) || "".equals(mail) || "".equals(birth) || "".equals(answer))
        {
            JOptionPane.showMessageDialog(null, "Mandatory Fields cannot be empty");
        }
        else {
            try {
                DatabaseConnection con_4 = new DatabaseConnection();
                s = con_4.Connect.createStatement();
                //System.out.println(mail+first_name+last_name+number+birth+question+answer);
                s.executeQuery("INSERT INTO CUSTOMER VALUES('"+mail+"', '"+first_name+"','"+last_name+"', '"+number+"','"+birth+"', '"+question+"','"+answer+"', default, default)");

            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Oops! User Already Exists");
                flag = 1;
            }
            if(flag == 0)
            {
            new Registration_successfull().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer_Label;
    private javax.swing.JTextField Answer_TextField;
    private javax.swing.JComboBox Question_ComboBox;
    private javax.swing.JLabel SecurityQuestion_Label;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTextField dob;
    private javax.swing.JLabel doblabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
