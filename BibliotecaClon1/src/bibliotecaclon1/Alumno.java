package bibliotecaclon1;

import java.util.List;

public class Alumno {
    private int id = -1;
    private String nombre;
    private String email;

    public Alumno(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Alumno(String nombre, String email) {
        this.id = -1;
        this.nombre = nombre;
        this.email = email;
    }
    
    public Alumno() {
        this.id = -1;
    }
    
    
    //Getters 
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static void mostrarAlumnos(List<Alumno> alumnos){
        for (int i = 0; i < alumnos.size(); i++){
                System.out.println("Nombre = " + alumnos.get(i).getNombre()+ " Email = " + alumnos.get(i).getEmail());
        }
    }    
}
