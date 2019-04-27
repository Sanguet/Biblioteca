/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Ivan
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    JFrame ventana = new JFrame("Ejemplo de ventana");
    FormularioCliente c;
    public VentanaPrincipal() {
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

        bt_salir = new javax.swing.JButton();
        bt_abrirVentana = new javax.swing.JButton();
        bt_cerrarVentana = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mb_principal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        m_clientes = new javax.swing.JMenu();
        mi_agregarCliente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_salir.setText("Salir");
        bt_salir.setName("bt"); // NOI18N
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        bt_abrirVentana.setText("Abrir ventana");
        bt_abrirVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_abrirVentanaActionPerformed(evt);
            }
        });

        bt_cerrarVentana.setText("Cerrar ventana");
        bt_cerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrarVentanaActionPerformed(evt);
            }
        });

        jLabel1.setText("Borrar");

        jMenu1.setText("File");
        mb_principal.add(jMenu1);

        jMenu2.setText("Edit");
        mb_principal.add(jMenu2);

        m_clientes.setText("Clientes");

        mi_agregarCliente.setText("AgregarAlumno");
        mi_agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregarClienteActionPerformed(evt);
            }
        });
        m_clientes.add(mi_agregarCliente);

        jMenuItem2.setText("Listar");
        m_clientes.add(jMenuItem2);

        mb_principal.add(m_clientes);

        setJMenuBar(mb_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_abrirVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_abrirVentana)
                        .addGap(57, 57, 57)))
                .addComponent(bt_cerrarVentana)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
    // TODO add your handling code here:
    System.exit(0);
    }//GEN-LAST:event_bt_salirActionPerformed

    private void bt_abrirVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_abrirVentanaActionPerformed
        // TODO add your handling code here:
        ventana.setTitle("JComboBox");
        ventana.getContentPane().setBackground(Color.gray); 
        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.setSize(1000,1000);
        ventana.setVisible(true);
    }//GEN-LAST:event_bt_abrirVentanaActionPerformed

    private void bt_cerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrarVentanaActionPerformed
        // TODO add your handling code here:
        ventana.dispose();
    }//GEN-LAST:event_bt_cerrarVentanaActionPerformed

    private void mi_agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregarClienteActionPerformed
        // TODO add your handling code here:
        c = new FormularioCliente();
        c.setSize(500,500);
        c.setVisible(true);
        c.moveToFront();
        this.add(c);
    }//GEN-LAST:event_mi_agregarClienteActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_abrirVentana;
    private javax.swing.JButton bt_cerrarVentana;
    private javax.swing.JButton bt_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu m_clientes;
    private javax.swing.JMenuBar mb_principal;
    private javax.swing.JMenuItem mi_agregarCliente;
    // End of variables declaration//GEN-END:variables
}
