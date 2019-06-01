/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Vistas.ListaDePrestamos.jScrollPane1;
import static Vistas.ListaDePrestamos.jtPrestamos;
import bibliotecaclon1.AlumnoData;
import bibliotecaclon1.Conexion;
import bibliotecaclon1.LibroData;
import bibliotecaclon1.Prestamo;
import bibliotecaclon1.PrestamoData;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class BuscarLibro extends java.awt.Dialog {

    /**
     * Creates new form BuscarLibro
     */
    public BuscarLibro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBounds(565, 260, 450, 292);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbLibro = new javax.swing.JLabel();
        tfLibro = new javax.swing.JTextField();
        btmBuscar = new javax.swing.JButton();
        btmCerrar = new javax.swing.JButton();
        tfLibro1 = new javax.swing.JTextField();
        lbLibro1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombre.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        lbNombre.setText("Libro:");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 40));

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 227, 30));

        lbLibro.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        lbLibro.setText("Autor:");
        jPanel1.add(lbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        tfLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLibroActionPerformed(evt);
            }
        });
        tfLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLibroKeyTyped(evt);
            }
        });
        jPanel1.add(tfLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 227, 30));

        btmBuscar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btmBuscar.setText("Buscar");
        btmBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btmBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 90, 30));

        btmCerrar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btmCerrar.setText("Cerrar");
        btmCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btmCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 30));

        tfLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLibro1ActionPerformed(evt);
            }
        });
        tfLibro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLibro1KeyTyped(evt);
            }
        });
        jPanel1.add(tfLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 227, 30));

        lbLibro1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        lbLibro1.setText("Genero:");
        jPanel1.add(lbLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/light-violet-color-wallpaper-4.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

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

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLibroActionPerformed

    }//GEN-LAST:event_tfLibroActionPerformed

    private void btmBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Conexion con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
            PrestamoData pd = new PrestamoData(con);
            List<Prestamo> nuevaLista = pd.obtenerPrestamosByAlumnoByLibro(tfNombre.getText(), tfLibro.getText());
            mostrarLista(nuevaLista);

        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Fallo bro" );
        }
    }//GEN-LAST:event_btmBuscarActionPerformed

    private void btmCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCerrarActionPerformed
        int msj = JOptionPane.showConfirmDialog(null,"Estas seguro de querer cerrar esta ventana?");
        if(JOptionPane.YES_OPTION == msj){
            dispose();
        }
    }//GEN-LAST:event_btmCerrarActionPerformed

    private void tfLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLibro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLibro1ActionPerformed

    private void tfLibro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLibro1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE)){
        evt.consume();
        }
    }//GEN-LAST:event_tfLibro1KeyTyped

    private void tfLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLibroKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE)){
        evt.consume();
        }
    }//GEN-LAST:event_tfLibroKeyTyped
        public void mostrarLista(List<Prestamo> lista){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
            String matris[][] = new String[lista.size()][4];
            AlumnoData ad = new AlumnoData(con);
            LibroData ld = new LibroData(con);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = ad.getAlumnoById(lista.get(i).getIdAlumno()).getNombre();
                matris[i][1] = ld.getLibroById(lista.get(i).getIdLibro()).getNombre();
                matris[i][2] = sdf.format(lista.get(i).getFechaPrestamo());
                matris[i][3] = sdf.format(lista.get(i).getFechaDevolucion());
            }
            
            ListaDePrestamos.jtPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Alumno", "Libro", "Fecha de prestamo", "Fecha de devolucion"
            }
            ));
            jtPrestamos.setRowHeight(30);
            jScrollPane1.setViewportView(jtPrestamos);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No funciono bro");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarLibro dialog = new BuscarLibro(new java.awt.Frame(), true);
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
    private javax.swing.JButton btmBuscar;
    private javax.swing.JButton btmCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLibro;
    private javax.swing.JLabel lbLibro1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTextField tfLibro;
    private javax.swing.JTextField tfLibro1;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
