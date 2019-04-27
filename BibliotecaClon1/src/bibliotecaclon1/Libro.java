package bibliotecaclon1;

import java.util.List;

public class Libro {
    private int id;
    private String nombre;
    private int cantidad;
    private String genero;
    private String autor;

    public Libro(int id, String nombre, int cantidad, String genero, String autor) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.genero = genero;
        this.autor = autor;
    }

    public Libro(String nombre, int cantidad, String genero, String autor) {
        this.id = -1;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.genero = genero;
        this.autor = autor;
    }

    public Libro() {
        this.id = -1;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public static void mostrarLibros(List<Libro> libros){
        for (int i = 0; i < libros.size(); i++){
                System.out.println("Nombre = " + libros.get(i).getNombre()+ " Cantidad = " + libros.get(i).getCantidad() + " Genero = " + libros.get(i).getGenero() + " Autor = " + libros.get(i).getAutor());
            }
    }
    
    
}
