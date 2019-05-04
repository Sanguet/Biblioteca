package bibliotecaclon1;

import java.sql.*;
import java.util.*;

public class AlumnoData {
    private Connection connection = null;
    public AlumnoData(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al abrr al obtener la conexion");
        }
    }
    
    public void guardarAlumno(Alumno alumno){
        try{
            String sql = "INSERT INTO alumnos (nombre,email) VALUES (?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, alumno.getNombre());
            stmt.setString(2,alumno.getEmail());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                alumno.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar un alumno" + ex.getMessage());
        }
        
        
    }
    public void borrarAlumno(Alumno alumno){
        try{
            String sql = "DELETE FROM alumnos WHERE id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, alumno.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar un alumno" + ex.getMessage());
        }
    
    }
    
    public Alumno getAlumnoByMail(String mail){
        Alumno a = null;
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
            System.out.println("Error al obtener un alumno" + ex.getMessage());
        }
        return a;
    }
    
    public Alumno getAlumnoById(int id){
        Alumno a = null;
        try{
            String sql = "SELECT * FROM alumnos WHERE id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Alumno(rs.getInt(1),rs.getString(2),rs.getString(3));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener un alumno" + ex.getMessage());
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