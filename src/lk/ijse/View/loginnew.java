/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.View;

import javax.swing.JOptionPane;

/**
 *
 * @author Yasiru Sachintha
 */
public class loginnew extends javax.swing.JFrame {

    /**
     * Creates new form loginnew
     */
    public loginnew() {
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
        jPanel2 = new javax.swing.JPanel();
        labTextMa = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        labTextUser = new javax.swing.JLabel();
        labtextPassword = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labLogIn = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTextMa.setBackground(new java.awt.Color(0, 204, 153));
        labTextMa.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        labTextMa.setForeground(new java.awt.Color(0, 102, 102));
        labTextMa.setText(" Bajaj Spare Parts Shop");
        jPanel2.add(labTextMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 370, 70));

        labUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-name-40.png"))); // NOI18N
        jPanel2.add(labUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 50));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 150, 30));

        labPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-password-40.png"))); // NOI18N
        jPanel2.add(labPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 50));
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 150, 31));

        labTextUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTextUser.setText("Username");
        jPanel2.add(labTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 78, -1));

        labtextPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labtextPassword.setText("Password");
        jPanel2.add(labtextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 88, 31));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 5));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 80, 40));

        labLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-login-64.png"))); // NOI18N
        jPanel2.add(labLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 70, 60));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background-various-automobile-spare-parts-wooden-68080302.jpg"))); // NOI18N
        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 510));

        setSize(new java.awt.Dimension(622, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String userName=txtUsername.getText();
        String Password=txtPassword.getText();
        
        if(userName.isEmpty() && Password.isEmpty()){
            JOptionPane.showMessageDialog(this,"USERNAME OR PASSWORD IS EMPTY...");
        }
        else if(userName.equals("admin") && Password.equals("admin")){
            DashBordForm dash=new DashBordForm();
            //this.hide();
            dash.setVisible(true);
        } else {
           JOptionPane.showMessageDialog(this,"USERNAME OR PASSWORD DO NOT MATCH...");  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(loginnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labLogIn;
    private javax.swing.JLabel labPassword;
    private javax.swing.JLabel labTextMa;
    private javax.swing.JLabel labTextUser;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labtextPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
