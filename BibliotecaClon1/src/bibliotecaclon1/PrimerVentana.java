package bibliotecaclon1;
import javax.swing.*;
import java.awt.*;

public class PrimerVentana {
     private JFrame ventana;
     private JDialog dialogo;
     private JButton boton;
    
    public PrimerVentana(){
        ventana = new JFrame("Ejemplo de ventana");
        dialogo = new JDialog(ventana,"Error",true);
        boton = new JButton("Apretame PAPAAAAA");
    }
    public void mostrarVentana(){
        ventana.setTitle("JComboBox");
        ventana.getContentPane().setBackground(Color.gray); 
        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.setSize(400,300);
        String[] list = {"Rojo","Amarillo","Blanco"};
        JComboBox c = new JComboBox(list);
        ventana.getContentPane().add(c);
        ventana.setVisible(true);
        
        //dialogo.setSize(100,100);
        //dialogo.setVisible(true);
        
    }
}