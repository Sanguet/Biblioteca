package bibliotecaclon1;

import java.time.LocalDate;
import java.util.List;

public class Prestamo {
    private int id = -1;
    private int idAlumno = -1;
    private int idLibro = -1;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo() {
        this.idAlumno = -1;
        this.idLibro = -1;
    }
    
    //Getters

    public int getId() {
        return id;
    }
    
    public int getIdAlumno() {
        return idAlumno;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public static void mostrarPrestamos(List<Prestamo> prestamo){
        for (int i = 0; i < prestamo.size(); i++){
                System.out.println("Nombre = " + prestamo.get(i).getIdAlumno()+ " Libro = " + prestamo.get(i).getIdLibro() + " Pidio prestado el dia " + prestamo.get(i).getFechaPrestamo() + " Devolvio el dia " + prestamo.get(i).getFechaDevolucion());
        }
    }    
}
    
    

