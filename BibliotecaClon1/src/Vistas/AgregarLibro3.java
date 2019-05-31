/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import bibliotecaclon1.Conexion;
import bibliotecaclon1.Libro;
import bibliotecaclon1.LibroData;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author santi
 */
public class AgregarLibro3 extends java.awt.Dialog {

    /**
     * Creates new form AgregarLibro3
     */
    public AgregarLibro3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setModal(true);
        this.setBounds(550, 142, 700, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlNombreLibro = new javax.swing.JLabel();
        jlCantidad = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlAutor = new javax.swing.JLabel();
        tfGenero = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JTextField();
        tfAutor = new javax.swing.JTextField();
        jbAgregarLibro = new javax.swing.JButton();
        jlRestriccionNombre = new javax.swing.JLabel();
        jlRestriccionGenero = new javax.swing.JLabel();
        jlRestriccionAutor = new javax.swing.JLabel();
        jbCerrar = new javax.swing.JButton();
        jlRestriccionCantidad = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        jLabel1.setText("Agregar Libro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jlNombreLibro.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jlNombreLibro.setText("Nombre del libro:");
        jPanel1.add(jlNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 50));

        jlCantidad.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jlCantidad.setText("Cantidad:");
        jPanel1.add(jlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 40));

        jlGenero.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jlGenero.setText("Género:");
        jPanel1.add(jlGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jlAutor.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jlAutor.setText("Autor:");
        jPanel1.add(jlAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        tfGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfGeneroFocusLost(evt);
            }
        });
        tfGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGeneroActionPerformed(evt);
            }
        });
        tfGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfGeneroKeyTyped(evt);
            }
        });
        jPanel1.add(tfGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 400, 30));

        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 400, 30));

        tfCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCantidadFocusLost(evt);
            }
        });
        tfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(tfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 400, 30));

        tfAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAutorFocusLost(evt);
            }
        });
        tfAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAutorActionPerformed(evt);
            }
        });
        tfAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAutorKeyTyped(evt);
            }
        });
        jPanel1.add(tfAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 400, 30));

        jbAgregarLibro.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jbAgregarLibro.setText("Agregar y cerrar");
        jbAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 220, 40));

        jlRestriccionNombre.setVisible(false);
        jlRestriccionNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlRestriccionNombre.setForeground(new java.awt.Color(255, 51, 51));
        jlRestriccionNombre.setText("* Es necesario rellenar este campo");
        jPanel1.add(jlRestriccionNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jlRestriccionGenero.setVisible(false);
        jlRestriccionGenero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlRestriccionGenero.setForeground(new java.awt.Color(255, 51, 51));
        jlRestriccionGenero.setText("* Es necesario rellenar este campo");
        jPanel1.add(jlRestriccionGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jlRestriccionAutor.setVisible(false);
        jlRestriccionAutor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlRestriccionAutor.setForeground(new java.awt.Color(255, 51, 51));
        jlRestriccionAutor.setText("* Es necesario rellenar este campo");
        jPanel1.add(jlRestriccionAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jbCerrar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 110, 40));

        jlRestriccionCantidad.setVisible(false);
        jlRestriccionCantidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlRestriccionCantidad.setForeground(new java.awt.Color(255, 51, 51));
        jlRestriccionCantidad.setText("* Es necesario rellenar este campo");
        jPanel1.add(jlRestriccionCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/light-violet-color-wallpaper-4.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void tfGeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfGeneroFocusLost
        if (tfGenero.getText().length() == 0){
            jlRestriccionGenero.setVisible(true);
        } else {
            jlRestriccionGenero.setVisible(false);
        }
    }//GEN-LAST:event_tfGeneroFocusLost

    private void tfGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGeneroActionPerformed

    private void tfGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGeneroKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_tfGeneroKeyTyped

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        if (tfNombre.getText().length() == 0){
            jlRestriccionNombre.setVisible(true);
        } else {
            jlRestriccionNombre.setVisible(false);
        }
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
        if (tfNombre.getText().length() > 1){
            jlRestriccionNombre.setVisible(true);
        } else {
            jlRestriccionNombre.setVisible(false);
        }
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped

    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCantidadFocusLost
        if (tfCantidad.getText().length() == 0){
            jlRestriccionCantidad.setVisible(true);
        } else {
            jlRestriccionCantidad.setVisible(false);
        }
    }//GEN-LAST:event_tfCantidadFocusLost

    private void tfCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_tfCantidadKeyTyped

    private void tfAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAutorFocusLost
        if (tfAutor.getText().length() == 0){
            jlRestriccionAutor.setVisible(true);
        } else {
            jlRestriccionAutor.setVisible(false);
        }
    }//GEN-LAST:event_tfAutorFocusLost

    private void tfAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAutorActionPerformed

    private void tfAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAutorKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_tfAutorKeyTyped

    private void jbAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarLibroActionPerformed
        // TODO add your handling code here:

        try {
            if (tfNombre.getText().length() > 0 && tfCantidad.getText().length() > 0 && tfGenero.getText().length() > 0 && tfAutor.getText().length() > 0 ){
                Conexion con = null;
                con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
                Libro libro = new Libro(tfNombre.getText(),Integer.parseInt(tfCantidad.getText()),tfGenero.getText(),tfAutor.getText());
                LibroData a = new LibroData(con);
                a.guardarLibro(libro);
                JOptionPane.showMessageDialog(null, "Felicidades, libro agregado");

                con.close();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar el libro, un campo quedo sin rellenar");
            }
        } catch (Exception e){
            System.out.println("Error al instanciar la clase conexion" + e.getMessage());
            JOptionPane.showMessageDialog(null,"No se pudo guardar el libro, intente nuevamente");
        }
    }//GEN-LAST:event_jbAgregarLibroActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarLibro3 dialog = new AgregarLibro3(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregarLibro;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlNombreLibro;
    private javax.swing.JLabel jlRestriccionAutor;
    private javax.swing.JLabel jlRestriccionCantidad;
    private javax.swing.JLabel jlRestriccionGenero;
    private javax.swing.JLabel jlRestriccionNombre;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
