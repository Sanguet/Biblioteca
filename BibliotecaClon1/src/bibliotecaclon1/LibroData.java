package bibliotecaclon1;
import java.sql.*;
import java.util.*;
import javax.swing.JComboBox;

public class LibroData {
    private Connection connection = null;
    public LibroData(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al abrr al obtener la conexion");
        }
    }
    
    public void guardarLibro(Libro libro){
        try{
            String sql = "INSERT INTO libros (nombre,cantidad,genero,autor) VALUES (?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, libro.getNombre());
            stmt.setInt(2,libro.getCantidad());
            stmt.setString(3, libro.getGenero());
            stmt.setString(4, libro.getAutor());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                libro.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar un libro" + ex.getMessage());
        }
        
        
    }
    public void borrarLibro(Libro libro){
        try{
            String sql = "DELETE FROM libros WHERE id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, libro.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar un libro" + ex.getMessage());
        }
    
    }
    
    public Libro getLibroByName(String nombre){
        Libro a = null;
        try{
            String sql = "SELECT * FROM libros WHERE nombre = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Libro(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener un libro" + ex.getMessage());
        }
        return a;
    }
        public Libro getLibroById(int id){
        Libro a = null;
        try{
            String sql = "SELECT * FROM libros WHERE id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Libro(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener un libro" + ex.getMessage());
        }
        return a;
    }
    
    //Devuelve un array con todos los alumnos de la base de datos
    public List <Libro> obtenerLibros(){
        List <Libro> libros = new ArrayList<Libro>();
        
        try {
            String sql = "SELECT * FROM libros;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Libro libro;
            while (rs.next()){
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setNombre(rs.getString("nombre"));
                libro.setCantidad(rs.getInt("cantidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setAutor(rs.getString("autor"));
                
                libros.add(libro);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los libros: " + ex.getMessage());
        }
        return libros;
    } 
    
    //Devuelve un array con los alumnos que tengan un nombre similar al especificado
    public List <Libro> obtenerLibrosByNombre(String nombre){
        List <Libro> librosNombre = new ArrayList<Libro>();
        
        try {
            String sql = "SELECT * FROM libros WHERE libros.nombre LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            Libro libro;
            while (rs.next()){
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setNombre(rs.getString("nombre"));
                libro.setCantidad(rs.getInt("cantidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setAutor(rs.getString("autor"));
                
                librosNombre.add(libro);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los libros: " + ex.getMessage());
        }
        return librosNombre;
    } 
    
    public List <Libro> obtenerLibrosByAutor(String autor){
        List <Libro> librosAutor = new ArrayList<Libro>();
        
        try {
            String sql = "SELECT * FROM libros WHERE libros.autor LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, autor);
            ResultSet rs = stmt.executeQuery();
            Libro libro;
            while (rs.next()){
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setNombre(rs.getString("nombre"));
                libro.setCantidad(rs.getInt("cantidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setAutor(rs.getString("autor"));
                
                librosAutor.add(libro);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los libros: " + ex.getMessage());
        }
        return librosAutor;
    }
    
    
    public List <Libro> obtenerLibrosByCantidad(int cantidad){
        List <Libro> librosCantidad = new ArrayList<Libro>();
        
        try {
            String sql = "SELECT * FROM libros WHERE libros.cantidad LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cantidad);
            ResultSet rs = stmt.executeQuery();
            Libro libro;
            while (rs.next()){
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setNombre(rs.getString("nombre"));
                libro.setCantidad(rs.getInt("cantidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setAutor(rs.getString("autor"));
                
                librosCantidad.add(libro);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los libros: " + ex.getMessage());
        }
        return librosCantidad;
    }
    
    public List <Libro> obtenerLibrosByGenero(String genero){
        List <Libro> librosGenero = new ArrayList<Libro>();
        
        try {
            String sql = "SELECT * FROM libros WHERE libros.genero LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, genero);
            ResultSet rs = stmt.executeQuery();
            Libro libro;
            while (rs.next()){
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setNombre(rs.getString("nombre"));
                libro.setCantidad(rs.getInt("cantidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setAutor(rs.getString("autor"));
                
                librosGenero.add(libro);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los libros: " + ex.getMessage());
        }
        return librosGenero;
    } 
    
    public static void listarLibros(JComboBox<String> cbx){
        Conexion con = null;
        try {
            con = new Conexion("jdbc:mysql://localhost/biblioteca","root","");
                LibroData a = new LibroData(con); 
                
                List<Libro> libros = a.obtenerLibros();
                for (int i = 0; i < libros.size(); i++){
                cbx.addItem(libros.get(i).getNombre());
                }
                con.close();
            }
         catch (Exception e){
            System.out.println("Error de " + e.getMessage());
        }
    }
    
    public List <Libro> obtenerLibrosPorNombreGeneroAutor(String nombre, String genero, String autor){
        List <Libro> librosTodo = new ArrayList<Libro>();
        
        try {
            String sql = "SELECT * FROM libros WHERE libros.nombre LIKE ? AND libros.genero LIKE ? AND libros.autor LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,"%" + nombre + "%");
            stmt.setString(2,"%" + genero + "%");
            stmt.setString(3,"%" + autor + "%");
            ResultSet rs = stmt.executeQuery();
            Libro libro;
            while (rs.next()){
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setNombre(rs.getString("nombre"));
                libro.setCantidad(rs.getInt("cantidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setAutor(rs.getString("autor"));
                
                librosTodo.add(libro);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los libros: " + ex.getMessage());
        }
        return librosTodo;
    }
    
    
}
