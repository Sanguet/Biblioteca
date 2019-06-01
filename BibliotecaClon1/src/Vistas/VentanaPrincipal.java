/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.KeyEvent;

/**
 *
 * @author santi
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JBSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        JBInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        jLabel1.setText("¡Bienvenido a Book Shelves! ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        jLabel2.setText("Presiona cualquier tecla para ingresar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jLabel3.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        JBSalir.setBackground(new java.awt.Color(204, 102, 255));
        JBSalir.setForeground(new java.awt.Color(204, 102, 255));
        JBSalir.setToolTipText("");
        JBSalir.setOpaque(false);
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(JBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos-03.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/light-violet-color-wallpaper-4.jpg"))); // NOI18N
        jLabelFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelFondoKeyPressed(evt);
            }
        });
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        JBInicio.setBackground(new java.awt.Color(204, 102, 255));
        JBInicio.setText("Haz Click Para Iniciar");
        JBInicio.setOpaque(false);
        JBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInicioActionPerformed(evt);
            }
        });
        JBInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JBInicioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBInicioKeyTyped(evt);
            }
        });
        getContentPane().add(JBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 870, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFondoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelFondoKeyPressed
        this.dispose();
    }//GEN-LAST:event_jLabelFondoKeyPressed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInicioActionPerformed
        VentanaPrincipalInicio a = new VentanaPrincipalInicio();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBInicioActionPerformed

    private void JBInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBInicioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            VentanaPrincipalInicio a = new VentanaPrincipalInicio();
            a.setVisible(true);
            this.dispose();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_JBInicioKeyPressed

    private void JBInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBInicioKeyTyped
        // TODO add your handling code here:
        VentanaPrincipalInicio a = new VentanaPrincipalInicio();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_JBInicioKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBInicio;
    private javax.swing.JButton JBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
