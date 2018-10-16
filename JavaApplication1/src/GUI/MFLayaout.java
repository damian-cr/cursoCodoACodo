package GUI;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MFLayaout extends JFrame{

   
    public MFLayaout ()
    {
        setTitle("Practica de Layaout - Ejercicio 1 ");
        setSize(600, 300); 
        setLocation(250,250);
        componentesVentana();
    }
    
    
    private void componentesVentana()
    {
        Container contentPane = getContentPane();   
        setLayout(new GridLayout(5,5));   
 
        // Los botones
        JButton boton[] = new JButton[25];
        for (int i=0;i<25;i++)
        boton[i] = new JButton("Botón "+Integer.toString(i));
        //al contenedor    
        for (int i=0;i<25;i++)
        contentPane.add (boton[i]);  
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        }
    
    
    
    
    
}
