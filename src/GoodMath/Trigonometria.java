/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodMath;

import MiMath.Avanzadas;
import static java.lang.Math.*;
import javax.swing.JOptionPane;
import MiMath.Convertidor;

/**
 *
 * @author HP
 */
public class Trigonometria extends javax.swing.JFrame {

    /**
     * Creates new form Trigonometria
     */
    public Trigonometria() {
        super("Trigonometria");
        this.setLocation(450, 50);
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
        miniEnca1 = new miSwing.miniEnca();
        tang = new javax.swing.JButton();
        Tangente = new javax.swing.JTextField();
        seno = new javax.swing.JButton();
        Seno = new javax.swing.JTextField();
        cose = new javax.swing.JButton();
        Coseno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonBack1 = new miSwing.BotonBack();
        Resultado = new javax.swing.JLabel();
        miEtiqueta1 = new miSwing.miEtiqueta();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(miniEnca1);
        miniEnca1.setBounds(0, 0, 500, 105);

        tang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tan.png"))); // NOI18N
        tang.setToolTipText("Calcular Tangente");
        tang.setBorder(null);
        tang.setContentAreaFilled(false);
        tang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangActionPerformed(evt);
            }
        });
        jPanel1.add(tang);
        tang.setBounds(140, 280, 120, 70);

        Tangente.setFont(new java.awt.Font("Berlin Sans FB", 1, 42)); // NOI18N
        Tangente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Tangente);
        Tangente.setBounds(270, 290, 80, 50);

        seno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seno.png"))); // NOI18N
        seno.setToolTipText("Calcular Seno");
        seno.setBorder(null);
        seno.setContentAreaFilled(false);
        seno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoActionPerformed(evt);
            }
        });
        jPanel1.add(seno);
        seno.setBounds(150, 130, 120, 70);

        Seno.setFont(new java.awt.Font("Berlin Sans FB", 1, 42)); // NOI18N
        Seno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Seno);
        Seno.setBounds(270, 140, 80, 50);

        cose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coseno.png"))); // NOI18N
        cose.setToolTipText("Calcular Coseno");
        cose.setBorder(null);
        cose.setContentAreaFilled(false);
        cose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coseActionPerformed(evt);
            }
        });
        jPanel1.add(cose);
        cose.setBounds(150, 200, 120, 70);

        Coseno.setFont(new java.awt.Font("Berlin Sans FB", 1, 42)); // NOI18N
        Coseno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Coseno);
        Coseno.setBounds(270, 210, 80, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ang.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 210, 40, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ang.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 290, 40, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ang.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(350, 130, 40, 30);

        botonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBack1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBack1);
        botonBack1.setBounds(10, 400, 90, 91);

        Resultado.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        Resultado.setText("Resultado:");
        jPanel1.add(Resultado);
        Resultado.setBounds(10, 360, 480, 40);

        miEtiqueta1.setText("Pulse en la función trigonometrica que deseé calcular");
        jPanel1.add(miEtiqueta1);
        miEtiqueta1.setBounds(30, 90, 460, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBack1ActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonBack1ActionPerformed

    private void senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoActionPerformed
        if(!Seno.getText().trim().isEmpty()){
            double s = Double.parseDouble(Seno.getText().trim());
            double S = Convertidor.GradosRadianes(Seno.getText().trim());
            if(s<=360){
                double respuesta = sin(S);
                if(Seno.getText().trim().equals("180")||Seno.getText().trim().equals("360")){
                    respuesta = 0;
                }
                Resultado.setText("Resultado del Seno: "+respuesta);
                Seno.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "El angulo ingresado no es válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un valor para seno", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_senoActionPerformed

    private void coseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coseActionPerformed
        if(!Coseno.getText().trim().isEmpty()){
            double s = Double.parseDouble(Coseno.getText().trim());
            double S = Convertidor.GradosRadianes(Coseno.getText().trim());
            if(s<=360){
                double respuesta = cos(S);
                if(Coseno.getText().trim().equals("90")){
                    respuesta = 0;
                }
                Resultado.setText("Resultado del Coseno: "+respuesta);
                Coseno.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "El angulo ingresado no es válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un valor para coseno", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_coseActionPerformed

    private void tangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangActionPerformed
        if(!Tangente.getText().trim().isEmpty()){
            double s = Double.parseDouble(Tangente.getText().trim());
            double S = Convertidor.GradosRadianes(Tangente.getText().trim());
            if(s<=360){
                double respuesta = tan(S);
                if(Tangente.getText().trim().equals("180")||Tangente.getText().trim().equals("360")){
                    respuesta = 0;
                }
                if(Tangente.getText().trim().equals("45")){
                    respuesta = 1;
                }
                Resultado.setText("Resultado de la tangente: "+respuesta);
                Tangente.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "El angulo ingresado no es válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un valor para tangente", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tangActionPerformed

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
            java.util.logging.Logger.getLogger(Trigonometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trigonometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trigonometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trigonometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trigonometria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Coseno;
    private javax.swing.JLabel Resultado;
    private javax.swing.JTextField Seno;
    private javax.swing.JTextField Tangente;
    private miSwing.BotonBack botonBack1;
    private javax.swing.JButton cose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private miSwing.miEtiqueta miEtiqueta1;
    private miSwing.miniEnca miniEnca1;
    private javax.swing.JButton seno;
    private javax.swing.JButton tang;
    // End of variables declaration//GEN-END:variables
}