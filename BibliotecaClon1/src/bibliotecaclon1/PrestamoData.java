package bibliotecaclon1;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class PrestamoData {
    private Connection connection = null;
    public PrestamoData(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al abrr al obtener la conexion");
        }
    }
    
    public void guardarPrestamo(Prestamo prestamo){
        try{
            String sql = "INSERT INTO prestamo (idAlumno,idLibro,fechaPrestamo,fechaDevolucion) VALUES (?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, prestamo.getIdAlumno());
            stmt.setInt(2,prestamo.getIdLibro());
            stmt.setDate(3,prestamo.getFechaPrestamo());
            stmt.setDate(4,prestamo.getFechaDevolucion());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                prestamo.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar un prestamo" + ex.getMessage());
        }
        
    }
    public void borrarPrestamo(Prestamo prestamo){ 
        try{
            String sql = "DELETE FROM prestamo WHERE id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,prestamo.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar un prestamo" + ex.getMessage());
        }
    
    }
    /* Dejo esto aca por las dudas de que lo necesite despues 
    public Prestamo getPrestamosByIdAlumno(Alumno alumno){
        Prestamo a = null;
        try{
            String sql = "SELECT a.nombre, l.nombre, p.fechaPrestamo, p.fechaDevolucion FROM prestamo p, alumnos a, libros l WHERE p.idAlumno = a.id AND p.idLibro = l.id AND p.idAlumno = ? ";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, alumno.getId());
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Prestamo(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar un prestamo" + ex.getMessage());
        }
        return a;
    }
    */
    //Devuelve un array con todos los prestamos de la base de datos
    public List <Prestamo> obtenerPrestamos(){
        List <Prestamo> prestamos = new ArrayList<Prestamo>();
        
        try {
            String sql = "SELECT a.id as alumno, l.id as libro, p.fechaPrestamo, p.fechaDevolucion FROM prestamo p, alumnos a, libros l WHERE p.idAlumno = a.id AND p.idLibro = l.id";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Prestamo prestamo;
            while (rs.next()){
                prestamo = new Prestamo();
                prestamo.setIdAlumno(rs.getInt("alumno"));
                prestamo.setIdLibro(rs.getInt("libro"));
                prestamo.setFechaPrestamo(rs.getDate("fechaPrestamo"));
                prestamo.setFechaDevolucion(rs.getDate("fechaDevolucion"));
                
                prestamos.add(prestamo);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los prestamos: " + ex.getMessage());
        }
        return prestamos;
    } 
    
    //Devuelve un array con los prestamos que tengan un alumno similar al especificado
    public List <Prestamo> obtenerPresatamosByAlumnos(Alumno alumno){
        List <Prestamo> prestamosDeAlumno = new ArrayList<Prestamo>();
        
        try {
            String sql = "SELECT a.id as alumno, l.id as libro, p.fechaPrestamo, p.fechaDevolucion FROM prestamo p, alumnos a, libros l WHERE p.idAlumno = a.id AND p.idLibro = l.id AND p.idAlumno = ? ";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, alumno.getId());
            
            ResultSet rs = stmt.executeQuery();
            Prestamo prestamo;
            while (rs.next()){
                prestamo = new Prestamo();
                prestamo.setIdAlumno(rs.getInt("alumno"));
                prestamo.setIdLibro(rs.getInt("libro"));
                prestamo.setFechaPrestamo(rs.getDate("fechaPrestamo"));
                prestamo.setFechaDevolucion(rs.getDate("fechaDevolucion"));
                
                prestamosDeAlumno.add(prestamo);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return prestamosDeAlumno;
    } 
    
    //Devuelve un array con los prestamos que tengan un libro similar al especificado
    public List <Prestamo> obtenerPrestamosByLibro(Libro libro){
    List <Prestamo> prestamosDelLibro = new ArrayList<Prestamo>();
        
        try {
            String sql = "SELECT a.id as alumno, l.id as libro, p.fechaPrestamo, p.fechaDevolucion FROM prestamo p, alumnos a, libros l WHERE p.idAlumno = a.id AND p.idLibro = l.id AND p.idLibro = ? ";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, libro.getId());
            ResultSet rs = stmt.executeQuery();
            Prestamo prestamo;
            while (rs.next()){
                prestamo = new Prestamo();
                prestamo.setIdAlumno(rs.getInt("alumno"));
                prestamo.setIdLibro(rs.getInt("libro"));
                prestamo.setFechaPrestamo(rs.getDate("fechaPrestamo"));
                prestamo.setFechaDevolucion(rs.getDate("fechaDevolucion"));
                
                prestamosDelLibro.add(prestamo);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return prestamosDelLibro;
    }
    
    public List <Prestamo> obtenerPrestamosByAlumnoByLibro(String alumno, String libro){
    List <Prestamo> prestamosDelLibro = new ArrayList<Prestamo>();
        
        try {
            String sql = "SELECT a.id as alumno, l.id as libro, p.fechaPrestamo, p.fechaDevolucion FROM prestamo p, alumnos a, libros l WHERE p.idAlumno = a.id AND p.idLibro = l.id AND a.nombre LIKE \"%?%\" AND l.nombre LIKE \"%?%\"";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, alumno);
            stmt.setString(2, libro);
            
            ResultSet rs = stmt.executeQuery();
            Prestamo prestamo;
            while (rs.next()){
                prestamo = new Prestamo();
                prestamo.setIdAlumno(rs.getInt("alumno"));
                prestamo.setIdLibro(rs.getInt("libro"));
                prestamo.setFechaPrestamo(rs.getDate("fechaPrestamo"));
                prestamo.setFechaDevolucion(rs.getDate("fechaDevolucion"));
                
                prestamosDelLibro.add(prestamo);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return prestamosDelLibro;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Borrar despues
     public ArrayList <String> obtenerPrestamosNombre(Conexion con){
    ArrayList <String> prestamosConNombre = new ArrayList<String>();
        
        try {
            String sql = "SELECT a.id as alumno, l.id as libro, p.fechaPrestamo, p.fechaDevolucion FROM prestamo p, alumnos a, libros l WHERE p.idAlumno = a.id AND p.idLibro = l.id";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(); 
            AlumnoData ad = new AlumnoData(con);
            LibroData ld = new LibroData(con);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            while (rs.next()){ 
                String a = ad.getAlumnoById(rs.getInt("alumno")).getNombre();
                String b = ld.getLibroById(rs.getInt("libro")).getNombre();
                String c = sdf.format(rs.getDate("fechaPrestamo"));
                String d = sdf.format(rs.getDate("fechaDevolucion"));
                                           
                prestamosConNombre.add(a);
                prestamosConNombre.add(b);
                prestamosConNombre.add(c);
                prestamosConNombre.add(d);
                
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los préstamos: " + ex.getMessage());
        }
        return prestamosConNombre;
    } 
    
    
    //Arreglar esto con la funcion que tiene bianca
    public List <String> obtenerPresatamosBy(String alumno, String libro, Conexion con){
        List <String> prestamosConNombre = new ArrayList<String>();
        
        try {
            String sql = "SELECT a.id as alumno, l.id as libro, p.fechaPrestamo, p.fechaDevolucion FROM prestamo p, alumnos a, libros l WHERE p.idAlumno = a.id AND p.idLibro = l.id AND a.nombre LIKE \"%?%\" AND l.nombre LIKE \"%?%\"";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, alumno);
            stmt.setString(2, libro);
            AlumnoData ad = new AlumnoData(con);
            LibroData ld = new LibroData(con);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                String a = ad.getAlumnoById(rs.getInt("alumno")).getNombre();
                String b = ld.getLibroById(rs.getInt("libro")).getNombre();
                String c = sdf.format(rs.getDate("fechaPrestamo"));
                String d = sdf.format(rs.getDate("fechaDevolucion"));
                                           
                prestamosConNombre.add(a);
                prestamosConNombre.add(b);
                prestamosConNombre.add(c);
                prestamosConNombre.add(d);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return prestamosConNombre;
    } 
}