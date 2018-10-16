package Entrega_23_09;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class Botones8 extends JFrame{
        JButton b0,b1,b2,b3,b5,b6,b7,b8;
        JPanel panel;
    
    public Botones8(){
        setSize(600, 300);         
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Mi Segundo Layout"); 
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
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }
    
    private void colocarBotones(){
        
        b0 = new JButton ("Botón 0");
        b0.setBounds(80, 30, 212, 101);
        panel.add(b0);
        
        b1 = new JButton ("Botón 1");
        b1.setBounds(292, 30, 213, 101);
        panel.add(b1);
        
        b2 = new JButton ("Botón 2");
        b2.setBounds(80, 131, 212, 101);
        panel.add(b2);
        
        b3 = new JButton ("Botón 3");
        b3.setBounds(292, 131, 213, 101);
        panel.add(b3);
        
        
        b5 = new JButton ("Botón 5");
        b5.setBounds(0, 0, 585, 30);
        panel.add(b5);
        
        b6 = new JButton ("Botón 6");
        b6.setBounds(0, 30, 80, 202);
        panel.add(b6);
        
        b7 = new JButton ("Botón 7");
        b7.setBounds(0, 232,  585, 30);
        panel.add(b7);
        
        b8 = new JButton ("Botón 8");
        b8.setBounds(505, 30,80, 202);
        panel.add(b8);
        
        
    }
   
}
