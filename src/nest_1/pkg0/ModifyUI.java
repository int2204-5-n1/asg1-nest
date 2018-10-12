
package nest_1.pkg0;


public class ModifyUI extends javax.swing.JFrame {
    DictionaryUI dic;
    public ModifyUI(DictionaryUI d) {
        initComponents();
        setLocation(400,150);
        dic = d;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        w = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        nm = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(312, 272));
        setPreferredSize(new java.awt.Dimension(400, 330));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("     Modify Word");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 0, 250, 32);
        getContentPane().add(w);
        w.setBounds(78, 49, 194, 29);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(380, 280));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 340));

        nm.setColumns(20);
        nm.setRows(5);
        jScrollPane1.setViewportView(nm);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(78, 131, 194, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Word");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 50, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("New Mean");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 160, 80, 33);

        jButton1.setText("Commit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 250, 100, 25);
        getContentPane().add(nw);
        nw.setBounds(78, 94, 194, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("New Word");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 90, 80, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nm.getText().trim().equals(""))
            dic.modifyWord(w.getText().trim(),nw.getText().trim(),"");
        else
            dic.modifyWord(w.getText().trim(),nw.getText().trim(),"<html><i></i><br/><ul><li><font color='#cc0000'><b> "+nm.getText().trim()+"</b></font></li></ul></html>");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModifyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModifyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModifyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModifyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               // new ModifyUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea nm;
    private javax.swing.JTextField nw;
    private javax.swing.JTextField w;
    // End of variables declaration//GEN-END:variables
}
