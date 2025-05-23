/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hinab
 */
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        show_password = new javax.swing.JCheckBox();
        login_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        login_title = new javax.swing.JLabel();
        login_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, -1, 20));

        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, -1, -1));

        username_textfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(username_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 300, 240, -1));

        password_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 340, 240, -1));

        show_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        show_password.setText("Show Password");
        show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(show_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, -1, -1));

        login_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 420, -1, -1));

        close_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close Jframe.png"))); // NOI18N
        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 420, -1, -1));

        login_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login ani.gif"))); // NOI18N
        getContentPane().add(login_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, -1, -1));

        login_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login page.png"))); // NOI18N
        getContentPane().add(login_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_textfieldActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        if (username_textfield.getText().equals("admin") && password_field.getText().equals("admin2002")) {
            setVisible(false);
            new home().setVisible(true);
        } else
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
    }//GEN-LAST:event_login_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(
                null,
                "Do you really want to close the application?",
                "Confirm Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // Exit if the user confirms
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_close_buttonActionPerformed

    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passwordActionPerformed
        // TODO add your handling code here:
        if (show_password.isSelected()) {
            password_field.setEchoChar((char) 0);
        } else {
            password_field.setEchoChar('*');
        }
    }//GEN-LAST:event_show_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JLabel login_background;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel login_title;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JCheckBox show_password;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_textfield;
    // End of variables declaration//GEN-END:variables
}
