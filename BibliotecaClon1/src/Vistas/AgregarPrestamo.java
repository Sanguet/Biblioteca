/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import bibliotecaclon1.Alumno;
import bibliotecaclon1.AlumnoData;
import bibliotecaclon1.Conexion;
import bibliotecaclon1.Libro;
import bibliotecaclon1.LibroData;
import bibliotecaclon1.Prestamo;
import bibliotecaclon1.PrestamoData;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Ivan
 */
public class AgregarPrestamo extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarPrestamo
     */
    public AgregarPrestamo() {
        initComponents();
        AlumnoData.listarAlumnos(jcbAlumno);
        LibroData.listarLibros(jcbLibro);
        AutoCompleteDecorator.decorate(jcbAlumno);
        AutoCompleteDecorator.decorate(jcbLibro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jlTitulo = new javax.swing.JLabel();
        jlAlumno = new javax.swing.JLabel();
        jlLibro = new javax.swing.JLabel();
        jlFechaDePrestamo = new javax.swing.JLabel();
        jlFechaDeDevolucion = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jcbAlumno = new javax.swing.JComboBox<>();
        jcbLibro = new javax.swing.JComboBox<>();
        rsFechaPrestamo = new rojeru_san.componentes.RSDateChooser();
        rsFechaDevolucion = new rojeru_san.componentes.RSDateChooser();

        jTextField1.setText("jTextField1");

        jlTitulo.setText("Agregar Prestamo");

        jlAlumno.setText("Alumno");

        jlLibro.setText("Libro");

        jlFechaDePrestamo.setText("Fecha de prestamo");

        jlFechaDeDevolucion.setText("Fecha de devolucion");

        jbGuardar.setText("Guardar y cerrar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jcbAlumno.setEditable(true);
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jcbLibro.setEditable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCerrar)
                                .addGap(18, 18, 18)
                                .addComponent(jbGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlAlumno)
                                    .addComponent(jlLibro)
                                    .addComponent(jlFechaDePrestamo)
                                    .addComponent(jlFechaDeDevolucion))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rsFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(rsFechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jlTitulo)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAlumno)
                            .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlLibro)
                        .addComponent(jcbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaDePrestamo)
                    .addComponent(rsFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaDeDevolucion)
                    .addComponent(rsFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbCerrar))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        String nombreAlumno = jcbAlumno.getItemAt(jcbAlumno.getSelectedIndex());
        String nombreLibro = jcbLibro.getItemAt(jcbLibro.getSelectedIndex());
        java.util.Date date1= rsFechaPrestamo.getDatoFecha();
        java.util.Date date2= rsFechaDevolucion.getDatoFecha();
        java.sql.Date sqlDate = new java.sql.Date(date1.getTime());  
        java.sql.Date sqlDate2 = new java.sql.Date(date2.getTime()); 
        if (sqlDate.compareTo(java.sql.Date.valueOf(LocalDate.now())) <= 0){
            Conexion con = null;
            try {
                con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
                    LibroData ld = new LibroData(con); 
                    AlumnoData ad = new AlumnoData(con);
                    PrestamoData pd = new PrestamoData(con);
                
                    Libro libro = ld.getLibroByName(nombreLibro);
                    Alumno alumno = ad.getAlumnoByName(nombreAlumno);
                    Prestamo p = new Prestamo(alumno.getId(),libro.getId(),sqlDate,sqlDate2);
                    pd.guardarPrestamo(p);
                    JOptionPane.showMessageDialog(null, "Felicidades la tenes re grande");
                
                    con.close();
                
                    dispose();
                }
            catch (Exception e){
                System.out.println("Error " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha ingresada es invalida");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcbAlumno;
    private javax.swing.JComboBox<String> jcbLibro;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlFechaDeDevolucion;
    private javax.swing.JLabel jlFechaDePrestamo;
    private javax.swing.JLabel jlLibro;
    private javax.swing.JLabel jlTitulo;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private rojeru_san.componentes.RSDateChooser rsFechaDevolucion;
    private rojeru_san.componentes.RSDateChooser rsFechaPrestamo;
    // End of variables declaration//GEN-END:variables
}
