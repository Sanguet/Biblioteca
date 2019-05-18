//No borren ningun paquete por favor f
package bibliotecaclon1;

import java.sql.*;
import java.util.*;
import java.text.*;
import Vistas.VentanaPrincipal;
import java.time.LocalDate;

public class Biblioteca {

    public static void main(String[] args) {
        try {
            Conexion con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
            
            AlumnoData alumnoData = new AlumnoData(con);
            PrestamoData prestamoData = new PrestamoData(con);
            LibroData libroData = new LibroData(con);
             
            //String fec = "31-03-2016";
            //LocalDate date3 = LocalDate.parse("2018-10-30");
            
            //Alumno a = new Alumno("Juan Gomez","juangomez@gmail.com");
            //Alumno b = new Alumno("Pepito Escudero","pepitoescudero@gmail.com");
            
            //Libro l = libroData.getLibrosById(2);
            //List<Prestamo> prestamos = prestamoData.obtenerPrestamosByLibro(l);
            //Prestamo.mostrarPrestamosPlus(prestamos,con);
            
            con.close();
        }
        catch (Exception e){
            System.out.println("Error al instanciar la clase conexion" + e.getMessage());
        }

        //PrimerVentana pv = new PrimerVentana();
        //pv.mostrarVentana();
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
    }
}
