/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import bibliotecaclon1.Conexion;
import bibliotecaclon1.Libro;
import bibliotecaclon1.LibroData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santi
 */
public class ListaDeLibros extends java.awt.Dialog {

    /**
     * Creates new form ListaDeLibros
     */
    public ListaDeLibros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBounds(433, 96, 700, 600);
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
            LibroData ld = new LibroData(con);
            List<Libro> lista = ld.obtenerLibros();
            
            mostrarLista(lista);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
    }
    
    public void mostrarLista(List<Libro> lista){
        try{
            String matris[][] = new String[lista.size()][4];
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = lista.get(i).getNombre();
                matris[i][1] = Integer.toString(lista.get(i).getCantidad());
                matris[i][2] = lista.get(i).getGenero();
                matris[i][3] = lista.get(i).getAutor();
            }
            
            jtPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Libro", "Cantidad", "Genero", "Autor"
            }
            ));
            jtPrestamos.setRowHeight(30);
            jScrollPane1.setViewportView(jtPrestamos);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista, vuelve a intentarlo");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlAListaPrestamos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPrestamos = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlAListaPrestamos.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        jlAListaPrestamos.setText(" Lista de Libros");
        jPanel1.add(jlAListaPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 320, -1));

        jtPrestamos.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jtPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Libro", "Cantidad", "Genero", "Autor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPrestamos.setRowHeight(30);
        jScrollPane1.setViewportView(jtPrestamos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 680, 440));

        jbCerrar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5x5-02.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 30, -1));

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5x5_Mesa de trabajo 1.png"))); // NOI18N
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 30, -1));

        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5x5-03.png"))); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 30, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refrescar (3).png"))); // NOI18N
        jButton1.setText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/light-violet-color-wallpaper-4.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        BuscarLibro dialog = new BuscarLibro(new java.awt.Frame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        AgregarLibro3 dialog = new AgregarLibro3(new java.awt.Frame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer cerrar esta ventana?");
        if(JOptionPane.YES_OPTION == msj){
        DefaultTableModel dtm = (DefaultTableModel) jtPrestamos.getModel();
        try{
            if (jtPrestamos.getSelectedRow() != 1){
                DefaultTableModel tm = (DefaultTableModel) jtPrestamos.getModel();
                String nombreLibro =String.valueOf(tm.getValueAt(jtPrestamos.getSelectedRow(),0));
                Conexion con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
                LibroData ld = new LibroData(con);
                //
                Libro libro = ld.getLibroByName(nombreLibro);
                ld.borrarLibro(libro);
                dtm.removeRow(jtPrestamos.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado ningun prestamo");
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun prestamo");
        }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
            LibroData ld = new LibroData(con);
            List<Libro> lista = ld.obtenerLibros();
            
            mostrarLista(lista);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaDeLibros dialog = new ListaDeLibros(new java.awt.Frame(), true);
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
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JLabel jlAListaPrestamos;
    public static javax.swing.JTable jtPrestamos;
    // End of variables declaration//GEN-END:variables
}
