/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author biane
 */
public class ListaDeAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaDeAlumnos
     */
    public ListaDeAlumnos() {
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

        jLabel1 = new javax.swing.JLabel();
        jlNombreLibro = new javax.swing.JLabel();
        jlCantidad = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlAutor = new javax.swing.JLabel();
        tfInsNombreLibro = new javax.swing.JTextField();
        tfInsCantidad = new javax.swing.JTextField();
        tfInsGenero = new javax.swing.JTextField();
        tfInsAutor = new javax.swing.JTextField();
        jbAgregarLibro = new javax.swing.JButton();

        jLabel1.setText("Agregar Libro");

        jlNombreLibro.setText("Nombre del libro:");

        jlCantidad.setText("Cantidad:");

        jlGenero.setText("Género:");

        jlAutor.setText("Autor:");

        tfInsNombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInsNombreLibroActionPerformed(evt);
            }
        });

        tfInsCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInsCantidadActionPerformed(evt);
            }
        });

        jbAgregarLibro.setText("Agregar y cerrar");
        jbAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbAgregarLibro)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlAutor)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfInsAutor))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlGenero)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfInsGenero))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jlCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfInsCantidad))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jlNombreLibro)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfInsNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreLibro)
                    .addComponent(tfInsNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantidad)
                    .addComponent(tfInsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGenero)
                    .addComponent(tfInsGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAutor)
                    .addComponent(tfInsAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAgregarLibro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfInsNombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInsNombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfInsNombreLibroActionPerformed

    private void tfInsCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInsCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfInsCantidadActionPerformed

    private void jbAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAgregarLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbAgregarLibro;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlNombreLibro;
    private javax.swing.JTextField tfInsAutor;
    private javax.swing.JTextField tfInsCantidad;
    private javax.swing.JTextField tfInsGenero;
    private javax.swing.JTextField tfInsNombreLibro;
    // End of variables declaration//GEN-END:variables
}
