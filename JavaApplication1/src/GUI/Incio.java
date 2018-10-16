/**
 *
 * @author YNava
 */
package GUI;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Constants;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Incio {
    
     public static void main(String[] args) {

         MFLayaout objMFLayaout= new MFLayaout();        
         MSLayaout objMSLayaout= new MSLayaout();   
         Formulario  objFormulario= new Formulario();
         NumeroCmp objParOImpar= new NumeroCmp();
         Suma objSuma= new Suma();
       
         JFrame ventana  = new JFrame();
         ventana.setSize(600, 400);  
         ventana.setTitle("Ejercicios de Interfaz Grafica");
         JPanel panel = new JPanel(); 
         ventana.add(panel);
         ventana.setLayout(null); 
         JLabel lbtitulo = new JLabel("Interfaz Grafica Unidad 4 - 2da Parte ");
         lbtitulo.setBounds(145, 50, 350, 100);
         lbtitulo.setFont(new java.awt.Font("Tahoma", 1, 14));
         ventana.add(lbtitulo);
              
         panel.setBounds(100,130, 350, 200);
         JButton boton[] = new JButton[5];
         for (int i=0;i<5;i++)
         boton[i] = new JButton("Ejercicio "+Integer.toString(i+1));   
         for (int i=0;i<5;i++)                 
             panel.add (boton[i]); 
                         
         ventana.setVisible(true);          
         ventana.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      
         ActionListener click;
         
         click = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Object fuente = e.getSource();
                    
                 if (fuente.equals(boton[0]))                 
                     objMFLayaout.setVisible(true);                    
                 if (fuente.equals(boton[1]))  
                     objMSLayaout.setVisible(true);
                 if (fuente.equals(boton[2]))                 
                     objFormulario.setVisible(true);                
                 if (fuente.equals(boton[3]))  
                     objParOImpar.setVisible(true);   //* 
                 if (fuente.equals(boton[4]))  
                     objSuma.setVisible(true);

                 }
         }; 
         
         boton[0].addActionListener(click);
         boton[1].addActionListener(click);
         boton[2].addActionListener(click);
         boton[3].addActionListener(click);
         boton[4].addActionListener(click);
    }

 
    
     
     
     
    
}
