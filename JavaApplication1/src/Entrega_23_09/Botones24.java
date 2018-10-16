package Entrega_23_09;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class Botones24 extends JFrame{
    
    JPanel panel;
    JButton boton;
    
    public Botones24(){
        setSize(600, 300); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Mi Primer Layout"); 
        setLocationRelativeTo(null); 
        setVisible(true); 
        iniciarComponentes();
    }
        
    private void iniciarComponentes(){
        colocarPaneles();
        colocarBotones();
    }    
    
    private void colocarPaneles(){
    
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);             
    }
    
    private void colocarBotones (){
        int nroBoton = 0;
        int y,x,posX,posY;
        int largo = 117;
        int alto = 53; 
        
        for (y = 0; y < 5; y++){
            posY = y * alto;
            for (x= 0 ; x < 5; x++){
                posX = x * largo;
                boton = new JButton("Boton " + nroBoton);
                panel.add(boton); 
                boton.setBounds(posX,posY, largo, alto);
                nroBoton++;
            }
        }
    }
}
