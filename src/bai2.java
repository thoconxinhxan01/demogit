
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class bai2 extends javax.swing.JFrame {

    /**
     * Creates new form bai2
     */
    public bai2() {
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

        btnMessgae = new javax.swing.JButton();
        btnComfirm = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        btnOption = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMessgae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMessgae.setText("Message Dialog");
        btnMessgae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessgaeActionPerformed(evt);
            }
        });

        btnComfirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComfirm.setText("Confirm Dialog");
        btnComfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComfirmActionPerformed(evt);
            }
        });

        btnInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInput.setText("Input Dialog");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOption.setText("Option Dialog");
        btnOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMessgae)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnComfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnOption)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMessgae)
                    .addComponent(btnInput))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOption)
                    .addComponent(btnComfirm))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMessgaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessgaeActionPerformed
       JOptionPane.showMessageDialog(this,"please input your name !");
    }//GEN-LAST:event_btnMessgaeActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
        String yourName = JOptionPane.showInputDialog("Your name is : ");
        if(!yourName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Hello "+yourName);
        }
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnComfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComfirmActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this
                                                , "Are you sure ? "
                                                , "Confirm"
                                                , JOptionPane.YES_NO_OPTION
                                                ,JOptionPane.QUESTION_MESSAGE);
        if (result==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "You are sure !");
        } else{
            JOptionPane.showMessageDialog(this, "You aren't sure !");
        }
    }//GEN-LAST:event_btnComfirmActionPerformed

    private void btnOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionActionPerformed
        // TODO add your handling code here:
         String[] options = {"Java","C++","VB","PHP","Perl"};
        int code = JOptionPane.showOptionDialog(this
                , "What language do you prefer ?"
                , "Option Dialog Box"
                , 0
                , JOptionPane.QUESTION_MESSAGE
                , null
                , options
                , EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(this, "Your answer : "+options[code]);
    }//GEN-LAST:event_btnOptionActionPerformed

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
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComfirm;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnMessgae;
    private javax.swing.JButton btnOption;
    // End of variables declaration//GEN-END:variables
}
