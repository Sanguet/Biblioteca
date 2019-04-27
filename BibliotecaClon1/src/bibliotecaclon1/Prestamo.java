package bibliotecaclon1;

import java.sql.Date;
import java.util.List;

public class Prestamo {
    private int id = -1;
    private int idAlumno ;
    private int idLibro ;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(int idAlumno, int idLibro, Date fechaPrestamo, Date fechaDevolucion) {
        this.idAlumno = idAlumno;
        this.idLibro = idLibro;
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

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
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

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public static void mostrarPrestamos(List<Prestamo> prestamo){
        for (int i = 0; i < prestamo.size(); i++){
                System.out.println("Nombre = " + prestamo.get(i).getIdAlumno()+ " Libro = " + prestamo.get(i).getIdLibro() + " Pidio prestado el dia " + prestamo.get(i).getFechaPrestamo() + " Devolvio el dia " + prestamo.get(i).getFechaDevolucion());
        }
    }    
}
    
    

