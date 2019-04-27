package bibliotecaclon1;
import java.sql.*;
import java.util.*;
import vistas.VentanaPrincipal;

public class Biblioteca {

    public static void main(String[] args) {
        try {
            Conexion con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
            
            AlumnoData alumnoData = new AlumnoData(con);
            
            //Alumno a = new Alumno("Juan Gomez","juangomez@gmail.com");
            //Alumno b = new Alumno("Pepito Escudero","pepitoescudero@gmail.com");
            
            //alumnoData.guardarAlumno(a);
            //alumnoData.guardarAlumno(b);
            List<Alumno> alumnos = alumnoData.obtenerAlumnosByEmail("%marc%");
            Alumno.mostrarAlumnos(alumnos);
            
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

