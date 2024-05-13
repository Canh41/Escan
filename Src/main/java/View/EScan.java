/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import FunctionPlus.ScanVuln;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class EScan extends javax.swing.JFrame {

    /**
     * Creates new form EScan
     */
    public EScan() {
        initComponents();
        this.setTitle("EScan");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        
    }
    
    public static boolean isStop = false;
    public static boolean isDone = false;
    
    public static void GhiLog(String data) {
        new Thread(() -> {
            logconsole.setText(data + "\n" + logconsole.getText());
        }).start();
    }
    
    public static void GhiLogInfo(String data) {
        new Thread(() -> {
            loginfo.setText("");
            int lastIndex = loginfo.getText().length();
            if (lastIndex > 100000) {
                lastIndex = 100000;
            }
            loginfo.setText(data + "\n" + loginfo.getText().substring(0, lastIndex));
        }).start();
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
        target = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        loginfo = new javax.swing.JTextArea();
        linklogin = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        passwd = new javax.swing.JPasswordField();
        cookie = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        scan = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        logconsole = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        target.setText("Url website");
        target.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                targetMouseClicked(evt);
            }
        });
        target.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetActionPerformed(evt);
            }
        });

        loginfo.setEditable(false);
        loginfo.setBackground(new java.awt.Color(0, 0, 0));
        loginfo.setColumns(20);
        loginfo.setForeground(new java.awt.Color(0, 0, 0));
        loginfo.setLineWrap(true);
        loginfo.setRows(5);
        loginfo.setText("----- ESCAN -------\n-- Scan Web Application Security --\n");
        jScrollPane1.setViewportView(loginfo);

        linklogin.setText("Url Login");
        linklogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkloginMouseClicked(evt);
            }
        });

        username.setText("User");
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });

        passwd.setText("pass");
        passwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwdMouseClicked(evt);
            }
        });

        cookie.setText("Cookie");
        cookie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cookieMouseClicked(evt);
            }
        });

        scan.setBackground(new java.awt.Color(255, 255, 51));
        scan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scan.setText("Scan");
        scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanActionPerformed(evt);
            }
        });

        stop.setBackground(new java.awt.Color(255, 255, 51));
        stop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 102));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stop, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(scan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop)
                .addGap(46, 46, 46)
                .addComponent(clear)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linklogin, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwd))
                        .addComponent(cookie, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(linklogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cookie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        logconsole.setEditable(false);
        logconsole.setBackground(new java.awt.Color(0, 0, 0));
        logconsole.setColumns(2000000000);
        logconsole.setForeground(new java.awt.Color(51, 255, 102));
        logconsole.setLineWrap(true);
        logconsole.setRows(2000000000);
        jScrollPane3.setViewportView(logconsole);

        jTabbedPane2.addTab("Log", jScrollPane3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "URL", "Vuln", "Risk", "Reference", "Payload", "Signature"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTabbedPane2.addTab("Vulnerable", jScrollPane2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void targetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetMouseClicked
        // TODO add your handling code here:
        this.target.setText("");
    }//GEN-LAST:event_targetMouseClicked
    
    public static void addRowData(String url, String vul, String risk, String ref, String payload, String signature) {        
        new Thread(() -> {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{url, vul, risk, ref, payload, signature});
        }).start();
        
    }
    private void scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanActionPerformed
        // TODO add your handling code here:
        isStop = false;
        JOptionPane.showMessageDialog(this, "Started Scan");
        new Thread(() -> {
            
            String target = null;
            String uname = null;
            String pwd = null;
            String linkadmin = null;
            String cookie = null;
            
            if (this.target.getText().trim().equalsIgnoreCase("Url website") || this.target.getText().trim().equalsIgnoreCase("") || this.target.getText() == null) {
                target = null;
            } else {
                target = this.target.getText();
            }
            if (this.username.getText().trim().equalsIgnoreCase("User") || this.username.getText().trim().equalsIgnoreCase("") || this.username.getText() == null) {
                uname = null;
            } else {
                uname = this.username.getText();
            }
            if (this.passwd.getText().trim().equalsIgnoreCase("pass") || this.passwd.getText().trim().equalsIgnoreCase("") || this.passwd.getText() == null) {
                pwd = null;
            } else {
                pwd = this.passwd.getText();
            }
            if (this.linklogin.getText().trim().equalsIgnoreCase("Url Login") || this.linklogin.getText().trim().equalsIgnoreCase("") || this.linklogin.getText() == null) {
                linkadmin = null;
            } else {
                linkadmin = this.linklogin.getText();
            }
            if (this.cookie.getText().trim().equalsIgnoreCase("Cookie") || this.cookie.getText().trim().equalsIgnoreCase("") || this.cookie.getText() == null) {
                cookie = null;
            } else {
                cookie = this.cookie.getText();
            }
            
            ScanVuln scanvuln = new ScanVuln();
            scanvuln.scan(target, uname, pwd, linkadmin, cookie);
            if (isDone == true) {
                JOptionPane.showMessageDialog(this, "DONE SCAN !!!");
            }
            
        }).start();
        

    }//GEN-LAST:event_scanActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Started Stop");
        new Thread(() -> {
            isStop = true;
        }).start();
    }//GEN-LAST:event_stopActionPerformed

    private void linkloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkloginMouseClicked
        // TODO add your handling code here:
        this.linklogin.setText("");
    }//GEN-LAST:event_linkloginMouseClicked

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        // TODO add your handling code here:
        this.username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void passwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwdMouseClicked
        // TODO add your handling code here:
        this.passwd.setText("");
    }//GEN-LAST:event_passwdMouseClicked

    private void cookieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cookieMouseClicked
        // TODO add your handling code here:
        this.cookie.setText("");
    }//GEN-LAST:event_cookieMouseClicked

    private void targetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        this.target.setText("Url website");
        this.linklogin.setText("Url Login");
        this.username.setText("User");
        this.passwd.setText("pass");
        this.cookie.setText("Cookie");
        logconsole.setText("");
        loginfo.setText("----- ESCAN -------\n"
                + "-- Scan Web Application Security --\n"
                + "");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(EScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EScan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField cookie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField linklogin;
    public static javax.swing.JTextArea logconsole;
    public static javax.swing.JTextArea loginfo;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JButton scan;
    private javax.swing.JButton stop;
    private javax.swing.JTextField target;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
