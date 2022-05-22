/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodMath;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        super("Menú");
        this.setResizable(false);
        initComponents();
        jPanel1.setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonBack1 = new miSwing.BotonBack();
        jPanel1 = new javax.swing.JPanel();
        encabezado1 = new miSwing.Encabezado();
        botonProbest1 = new miSwing.BotonProbest();
        botonGA1 = new miSwing.BotonGA();
        botonGB1 = new miSwing.BotonGB();
        botonTri1 = new miSwing.BotonTri();
        botonProx21 = new miSwing.BotonProx2();
        miEtiqueta1 = new miSwing.miEtiqueta();
        miEtiqueta2 = new miSwing.miEtiqueta();
        miEtiqueta3 = new miSwing.miEtiqueta();
        miEtiqueta4 = new miSwing.miEtiqueta();

        botonBack1.setText("botonBack1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setLocation(new java.awt.Point(150, 50));

        jPanel1.setLayout(null);
        jPanel1.add(encabezado1);
        encabezado1.setBounds(817, 0, 0, 0);

        botonProbest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProbest1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonProbest1);
        botonProbest1.setBounds(50, 100, 100, 110);

        botonGA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGA1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonGA1);
        botonGA1.setBounds(423, 63, 1, 1);

        botonGB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGB1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonGB1);
        botonGB1.setBounds(489, 63, 1, 1);

        botonTri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTri1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonTri1);
        botonTri1.setBounds(555, 63, 1, 1);

        botonProx21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProx21ActionPerformed(evt);
            }
        });
        jPanel1.add(botonProx21);
        botonProx21.setBounds(816, 102, 1, 1);

        miEtiqueta1.setText("Probabilidad y Estadística");
        jPanel1.add(miEtiqueta1);
        miEtiqueta1.setBounds(10, 62, 230, 37);

        miEtiqueta2.setText("Geometría Analítica");
        jPanel1.add(miEtiqueta2);
        miEtiqueta2.setBounds(246, 34, 178, 23);

        miEtiqueta3.setText("Geometría Básica");
        jPanel1.add(miEtiqueta3);
        miEtiqueta3.setBounds(499, 109, 154, 23);

        miEtiqueta4.setText("Trigonometría");
        jPanel1.add(miEtiqueta4);
        miEtiqueta4.setBounds(555, 34, 126, 23);

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

    private void botonProx21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProx21ActionPerformed
        Menu2 obj = new Menu2();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonProx21ActionPerformed

    private void botonProbest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProbest1ActionPerformed
        ProbEst pro = new ProbEst();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonProbest1ActionPerformed

    private void botonGA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGA1ActionPerformed
        GeometriaA geo = new GeometriaA();
        geo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonGA1ActionPerformed

    private void botonGB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGB1ActionPerformed
        GeometriaB geob = new GeometriaB();
        geob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonGB1ActionPerformed

    private void botonTri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTri1ActionPerformed
        Trigonometria trigo = new Trigonometria();
        this.setVisible(false);
        trigo.setVisible(true);
    }//GEN-LAST:event_botonTri1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private miSwing.BotonBack botonBack1;
    private miSwing.BotonGA botonGA1;
    private miSwing.BotonGB botonGB1;
    private miSwing.BotonProbest botonProbest1;
    private miSwing.BotonProx2 botonProx21;
    private miSwing.BotonTri botonTri1;
    private miSwing.Encabezado encabezado1;
    private javax.swing.JPanel jPanel1;
    private miSwing.miEtiqueta miEtiqueta1;
    private miSwing.miEtiqueta miEtiqueta2;
    private miSwing.miEtiqueta miEtiqueta3;
    private miSwing.miEtiqueta miEtiqueta4;
    // End of variables declaration//GEN-END:variables
}
