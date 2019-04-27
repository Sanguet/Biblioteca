/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaclon1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author biane
 */
public class LibroData {
private Connection connection = null;
    
    public LibroData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexión");
        }
    }
    //id nombre genero autor cantidad
    public void agregarLibro(Alumno alumno){
        try {
            String sql = "INSERT INTO libros (nombre, genero, autor, cantidad) VALUES (?,?,?,?)";
            
            PreparedStatement statement = connection.prepareStatement (sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString (1, libro.getNombre());
            //statement.setDate(2, Date.valueOf(alumno.getFechaNac()));
            statement.setString (2, libro.getGenero());
            statement.setString (3, libro.getAutor());
            statement.setString (4, libro.getCantidad());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if (rs.next()){
                libro.setId(rs.getInt(1));
            } else {
                 System.out.println("No se pudo obtener el id luego de insertar un nuevo libro");
            }
        } catch(Exception e){
            System.out.println("Error al instanciar la clase conexión: " + e.getMessage());
        }
    }
    
    public void borrarLibro(Libro a){
        try {
            String sql = "DELETE FROM libros WHERE id = ?";
            
            PreparedStatement statement = connection.prepareStatement (sql);
            statement.setInt(1, a.getId());
                        
            statement.executeUpdate();
            
        } catch(Exception e){
            System.out.println("Error al borrar el libro: " + e.getMessage());
        }
    }
}
