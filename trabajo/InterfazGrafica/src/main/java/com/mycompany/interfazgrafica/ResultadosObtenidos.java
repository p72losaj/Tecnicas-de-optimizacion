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
public class ResultadosObtenidos extends javax.swing.JFrame {

    public int C = 0; // Numero de conjuntos o sets
    public int W = 0; // Numero de palabras por bloque
    public int tamano = 50; // Por defecto, el tamano de las matrices es 50
    /**
     * Creates new form ResultadosObtenidos
     */
    public ResultadosObtenidos(int C, int W) {
        initComponents();
        this.C = C;
        this.W = W;
        CJTextField.setText(String.valueOf(C));
        WJTextField.setText(String.valueOf(W));
        jTextField1.setVisible(false);
        TiempojTextField.setVisible(false);
    }
    
    /**
     * Creates new form ResultadosObtenidos
     */
    public ResultadosObtenidos(int C, int W, double t) {
        initComponents();
        this.C = C;
        this.W = W;
        CJTextField.setText(String.valueOf(C));
        WJTextField.setText(String.valueOf(W));
        TiempojTextField.setText(String.valueOf(t));
        
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
        titulojLabel = new javax.swing.JLabel();
        NumeroSetsJTextField = new javax.swing.JTextField();
        CJTextField = new javax.swing.JTextField();
        PalabrasBloquejTextField = new javax.swing.JTextField();
        WJTextField = new javax.swing.JTextField();
        NoOptimizacionjButton = new javax.swing.JButton();
        PermutacionjButton = new javax.swing.JButton();
        PaddingjButton = new javax.swing.JButton();
        VolverjButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        TiempojTextField = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        tamanojTextField = new javax.swing.JTextField();
        VectorjButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulojLabel.setText("Mostrando los resultados obtenidos");

        NumeroSetsJTextField.setEditable(false);
        NumeroSetsJTextField.setText(" Numero de conjuntos o sets = ");
        NumeroSetsJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroSetsJTextFieldActionPerformed(evt);
            }
        });

        CJTextField.setEditable(false);
        CJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CJTextFieldActionPerformed(evt);
            }
        });

        PalabrasBloquejTextField.setEditable(false);
        PalabrasBloquejTextField.setText(" Numero de palabras por bloque = ");
        PalabrasBloquejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabrasBloquejTextFieldActionPerformed(evt);
            }
        });

        WJTextField.setEditable(false);

        NoOptimizacionjButton.setText("No aplicar una tecnica de optimizacion");
        NoOptimizacionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoOptimizacionjButtonActionPerformed(evt);
            }
        });

        PermutacionjButton.setText("Aplicar permutacion");
        PermutacionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermutacionjButtonActionPerformed(evt);
            }
        });

        PaddingjButton.setText("Aplicar padding");

        VolverjButton1.setText("Cambiar memoria");
        VolverjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverjButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Tiempo de computo en segundos = ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TiempojTextField.setEditable(false);
        TiempojTextField.setText("0.0");
        TiempojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempojTextFieldActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("Tamano de las matrices = ");

        tamanojTextField.setText("2000");
        tamanojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanojTextFieldActionPerformed(evt);
            }
        });

        VectorjButton.setText("Vector iteraciones (i,k,j)");
        VectorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VectorjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(titulojLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NumeroSetsJTextField)
                                        .addGap(18, 18, 18)
                                        .addComponent(CJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PalabrasBloquejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(WJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoOptimizacionjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PermutacionjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaddingjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VolverjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tamanojTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TiempojTextField))
                            .addComponent(VectorjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulojLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroSetsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PalabrasBloquejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(NoOptimizacionjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VectorjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(PermutacionjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaddingjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VolverjButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumeroSetsJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroSetsJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroSetsJTextFieldActionPerformed

    private void CJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CJTextFieldActionPerformed

    private void PalabrasBloquejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabrasBloquejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PalabrasBloquejTextFieldActionPerformed

    private void NoOptimizacionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoOptimizacionjButtonActionPerformed
        // TODO add your handling code here:
        double tiempo = calcularTiempoComputo1();
        JFrame ventana = new ResultadosObtenidos(this.C,this.W,tiempo);
        this.setVisible(false);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_NoOptimizacionjButtonActionPerformed

    private void PermutacionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermutacionjButtonActionPerformed
        // TODO add your handling code here:
        // double tiempo = calcularTiempoComputoPermutacion();
        // JFrame ventana = new ResultadosObtenidos(this.C,this.W,tiempo);
        // this.setVisible(false);
        // ventana.setVisible(true);
    }//GEN-LAST:event_PermutacionjButtonActionPerformed

    private void VolverjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverjButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JFrame ventana = new ObtencionDatosMemoriaCache();
        ventana.setVisible(true);

    }//GEN-LAST:event_VolverjButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void TiempojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempojTextFieldActionPerformed

    private void tamanojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanojTextFieldActionPerformed

    private void VectorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VectorjButtonActionPerformed
        // TODO add your handling code here:
        double tiempo = calcularTiempoComputoVector();
        JFrame ventana = new ResultadosObtenidos(this.C,this.W,tiempo);
        this.setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_VectorjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ResultadosObtenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadosObtenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadosObtenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadosObtenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private int C, W;
            public void run() {
                new ResultadosObtenidos(this.C,this.W).setVisible(true);
            }
        });
    }
    
    /**
     * Funcion que calcula el tiempo de computo del algoritmo sin aplicar 
     * tecnicas de optimizacion
     * @return Tiempo de computo en segundos
     */
    private double calcularTiempoComputo1() {
        int tamano = Integer.parseInt(this.tamanojTextField.getText());
        int A[][] = new int[tamano][tamano];
        int B[][] = new int[tamano][tamano];
        int R[][] = new int[tamano][tamano];
        
        // Rellenamos las matrices
        for(int i = 0; i < tamano; i++){
            for(int j=0; j < tamano; j++){
                A[i][j] = (int) (Math.random()*9+1);
                B[i][j] = (int) (Math.random()*9+1);
            }
        }
        long startTime = System.nanoTime();
        // Algoritmo
        for (int i = 0; i < tamano; i++) {
            // Dentro recorremos las filas de la primera (A)
            for (int j = 0; j < tamano; j++) {
                // Y cada columna de la primera (A)
                for (int k = 0; k < tamano; k++) {
                    // Multiplicamos y sumamos resultado
                    R[i][j] = R[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        
        long endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        double seconds = (double)endTime / 1000000000.0; // tiempo en segundos
        return seconds;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Funcion que calcula el tiempo de producto de 2 matrices 
     * aplicando permutacion
     * @return Tiempo de computo en segundos
     */
    private double calcularTiempoComputoVector() {
        int tamano = Integer.parseInt(this.tamanojTextField.getText());
        int A[][] = new int[tamano][tamano];
        int B[][] = new int[tamano][tamano];
        int R[][] = new int[tamano][tamano];
        
        // Rellenamos las matrices
        for(int i = 0; i < tamano; i++){
            for(int j=0; j < tamano; j++){
                A[i][j] = (int) (Math.random()*9+1);
                B[i][j] = (int) (Math.random()*9+1);
            }
        }
        long startTime = System.nanoTime();
        // Algoritmo
        for (int i = 0; i < tamano; i++) {
            // Dentro recorremos las filas de la primera (A)
            for (int k = 0; k < tamano; k++) {
                // Y cada columna de la primera (A)
                for (int j = 0; j < tamano; j++) {
                    // Multiplicamos y sumamos resultado
                    R[i][j] = R[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        
        long endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        double seconds = (double)endTime / 1000000000.0; // tiempo en segundos
        return seconds;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CJTextField;
    private javax.swing.JButton NoOptimizacionjButton;
    private javax.swing.JTextField NumeroSetsJTextField;
    private javax.swing.JButton PaddingjButton;
    private javax.swing.JTextField PalabrasBloquejTextField;
    private javax.swing.JButton PermutacionjButton;
    private javax.swing.JTextField TiempojTextField;
    private javax.swing.JButton VectorjButton;
    private javax.swing.JButton VolverjButton1;
    private javax.swing.JTextField WJTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField tamanojTextField;
    private javax.swing.JLabel titulojLabel;
    // End of variables declaration//GEN-END:variables
    
}
