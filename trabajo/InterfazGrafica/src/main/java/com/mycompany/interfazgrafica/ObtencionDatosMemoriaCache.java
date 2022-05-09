/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfazgrafica;

import javax.swing.JFrame;

/**
 *
 * @author jaime
 */
public class ObtencionDatosMemoriaCache extends javax.swing.JFrame {
    /**
     * Creates new form ObtencionDatosMemoriaCache
     */
    public ObtencionDatosMemoriaCache() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tituloLabel = new javax.swing.JLabel();
        NumeroSetsJTextField = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        PalabrasBloqueJTextField = new javax.swing.JTextField();
        txtW = new javax.swing.JTextField();
        ContinuarjButton = new javax.swing.JButton();
        VolverjButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DatosMemoriaCache");

        tituloLabel.setText("Parametros Memoria Caché");

        NumeroSetsJTextField.setEditable(false);
        NumeroSetsJTextField.setText(" Numero de conjuntos o sets = ");
        NumeroSetsJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroSetsJTextFieldActionPerformed(evt);
            }
        });

        txtC.setText("64");
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        PalabrasBloqueJTextField.setEditable(false);
        PalabrasBloqueJTextField.setText(" Numero de palabras por bloque = ");

        txtW.setText("16");
        txtW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWActionPerformed(evt);
            }
        });

        ContinuarjButton.setText("Continuar");
        ContinuarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarjButtonActionPerformed(evt);
            }
        });

        VolverjButton.setText("Volver");
        VolverjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(tituloLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NumeroSetsJTextField)
                                    .addComponent(PalabrasBloqueJTextField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtW)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ContinuarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VolverjButton)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroSetsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PalabrasBloqueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContinuarjButton)
                    .addComponent(VolverjButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumeroSetsJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroSetsJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroSetsJTextFieldActionPerformed

    private void txtWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWActionPerformed
        // TODO add your handling code here:
        int W = Integer.parseInt(this.txtW.getText());
    }//GEN-LAST:event_txtWActionPerformed

    private void VolverjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverjButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Inicio().setVisible(true);

    }//GEN-LAST:event_VolverjButtonActionPerformed

    private void ContinuarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarjButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        int C = Integer.parseInt(txtC.getText());
        int W = Integer.parseInt(txtW.getText());
        JFrame ventana = new ResultadosObtenidos(C,W);
        ventana.setVisible(true);
    }//GEN-LAST:event_ContinuarjButtonActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
        int C = Integer.parseInt(this.txtC.getText());
    }//GEN-LAST:event_txtCActionPerformed

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
            java.util.logging.Logger.getLogger(ObtencionDatosMemoriaCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObtencionDatosMemoriaCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObtencionDatosMemoriaCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObtencionDatosMemoriaCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObtencionDatosMemoriaCache().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinuarjButton;
    private javax.swing.JTextField NumeroSetsJTextField;
    private javax.swing.JTextField PalabrasBloqueJTextField;
    private javax.swing.JButton VolverjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtW;
    // End of variables declaration//GEN-END:variables
}
