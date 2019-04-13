/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaclon1;

/**
 *
 * @author biane
 */
public class Libro {
    private int id;
    private String nombre;
    private String genero;
    private String autor;
    private String cantidad;

    public Libro(int id, String nombre, String genero, String autor, String cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    public Libro(String nombre, String genero, String autor, String cantidad) {
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    public Libro() {
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
