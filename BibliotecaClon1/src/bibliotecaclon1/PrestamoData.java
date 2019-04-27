package bibliotecaclon1;

import java.sql.*;
import java.util.*;
import java.sql.Date;

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
            stmt.setDate(3,Date.valueOf(prestamo.getFechaPrestamo()));
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                prestamo.setIdAlumno(rs.getInt(1));
                prestamo.setIdLibro(rs.getInt(2));
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
    
    public Alumno getAlumnoByMail(String mail){
        Prestamo a = null;
        try{
            String sql = "SELECT * FROM alumnos WHERE email = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, mail);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Alumno(rs.getInt(1),rs.getString(2),rs.getString(3));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar un alumno" + ex.getMessage());
        }
        return a;
    }
    
    //Devuelve un array con todos los alumnos de la base de datos
    public List <Alumno> obtenerAlumnos(){
        List <Alumno> alumnos = new ArrayList<Alumno>();
        
        try {
            String sql = "SELECT * FROM alumnos;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Alumno alumno;
            while (rs.next()){
                alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEmail(rs.getString("email"));
                
                alumnos.add(alumno);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return alumnos;
    } 
    
    //Devuelve un array con los alumnos que tengan un nombre similar al especificado
    public List <Alumno> obtenerAlumnosByName(String nombre){
        List <Alumno> alumnosNombre = new ArrayList<Alumno>();
        
        try {
            String sql = "SELECT * FROM alumnos WHERE alumnos.nombre LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            Alumno alumno;
            while (rs.next()){
                alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEmail(rs.getString("email"));
                
                alumnosNombre.add(alumno);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return alumnosNombre;
    } 
    
    //Devuelve un array con los alumnos que tengan un email similar al especificado
    public List <Alumno> obtenerAlumnosByEmail(String email){
    List <Alumno> alumnosEmail = new ArrayList<Alumno>();
        
        try {
            String sql = "SELECT * FROM alumnos WHERE alumnos.email LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            Alumno alumno;
            while (rs.next()){
                alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEmail(rs.getString("email"));
                
                alumnosEmail.add(alumno);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return alumnosEmail;
    } 
    
}