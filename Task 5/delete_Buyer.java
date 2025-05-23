
import java.sql.*;
import Project.ConnectionProvider;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author hinab
 */
import javax.swing.JOptionPane;

public class delete_Buyer extends javax.swing.JFrame {

    /**
     * Creates new form delete_Buyer
     */
    public delete_Buyer() {
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

        delete_buyer_ani = new javax.swing.JLabel();
        delete_buyer_icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        search_contact = new javax.swing.JLabel();
        search_text = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        name = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        contact_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        address_text = new javax.swing.JTextField();
        gender_text = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete_buyer_ani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete buyer ani.gif"))); // NOI18N
        getContentPane().add(delete_buyer_ani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 245, -1));

        delete_buyer_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete buyer.png"))); // NOI18N
        getContentPane().add(delete_buyer_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 588, 10));

        search_contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_contact.setText("Contact No.");
        getContentPane().add(search_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        search_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_textActionPerformed(evt);
            }
        });
        getContentPane().add(search_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 197, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 588, 10));

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contact.setText("Contact No.");
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setText("E-mail");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address.setText("Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setText("Gender");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        name_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(name_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 224, -1));

        contact_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(contact_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 224, -1));

        email_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(email_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 224, -1));

        address_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_textActionPerformed(evt);
            }
        });
        getContentPane().add(address_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 224, -1));

        gender_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(gender_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 224, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 588, 10));

        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close Jframe.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all page background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_textActionPerformed

    private void address_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_textActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new delete_Buyer().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String contactNo = search_text.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from buyer where contactNo='" + contactNo + "'");
            if (rs.next()) {
                name_text.setText(rs.getString(1));
                contact_text.setText(rs.getString(2));
                email_text.setText(rs.getString(3));
                address_text.setText(rs.getString(4));
                gender_text.setText(rs.getString(5));
                search_text.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Contact No. does not Exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String contactNo = search_text.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("delete from buyer where contactNo='" + contactNo + "'");
                setVisible(false);
                new delete_Buyer().setVisible(true);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(delete_Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_Buyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_Buyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField address_text;
    private javax.swing.JLabel background;
    private javax.swing.JButton close;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contact_text;
    private javax.swing.JButton delete;
    private javax.swing.JLabel delete_buyer_ani;
    private javax.swing.JLabel delete_buyer_icon;
    private javax.swing.JLabel email;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField gender_text;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_text;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JLabel search_contact;
    private javax.swing.JTextField search_text;
    // End of variables declaration//GEN-END:variables
}
