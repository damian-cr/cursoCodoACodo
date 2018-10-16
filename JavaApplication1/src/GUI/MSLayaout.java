package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MSLayaout extends JFrame{

   
    public MSLayaout ()
    {
        setTitle("Practica de Layaout - Ejercicio 2 ");
        setSize(600, 300); 
        setLocation(250,250);
        componentesVentana();
    }
  
    private void componentesVentana()
    {
        Container contentPane = getContentPane();   
        setLayout (new BorderLayout()); 
 
        // Los botones
        JButton boton[] = new JButton[8];
        for (int i=0;i<8;i++)
        boton[i] = new JButton("Botón "+Integer.toString(i));
        //al contenedor    
        for (int i=0;i<8;i++)
        contentPane.add (boton[i]);  
        
        JPanel  JPC = new JPanel();
        JPC.setLayout(new GridLayout(2,2));   
        JPC.add (boton[0]);
        JPC.add (boton[1]);
        JPC.add (boton[2]);
        JPC.add (boton[3]);
        
        contentPane.add(JPC, BorderLayout.CENTER);
  
        contentPane.add (boton[4], BorderLayout.NORTH);
        contentPane.add (boton[6], BorderLayout.SOUTH);
        contentPane.add (boton[5], BorderLayout.WEST);    
        contentPane.add (boton[7], BorderLayout.EAST);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        }
    
    
    
    
    
}
