
package GUI;
import java.awt.Container;
import java.awt.Dimension;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumeroCmp extends JFrame {

     int numeror; 
     String mensaje="";
     boolean control; 
             
    public NumeroCmp()
    {
         setTitle("Practica de GUI - Ejercicio 4 ");
         setSize(400, 300); 
         setLocation(300,250);
         componentesformulario();
    }   
    
    
    public void componentesformulario()
    {
         Container contentPane = getContentPane(); 
         GridBagConstraints constraints = new GridBagConstraints();
         JPanel  jPC = new JPanel();
         contentPane.add(jPC); 
         jPC.setLayout(new  GridBagLayout()); 
         
         JButton Comprobar = new JButton("Comprobar");
         JLabel Numero = new JLabel("Introduza un Numero: ");
         JTextField  TxNumero = new JTextField("");        
         TxNumero.setPreferredSize(new Dimension(60, 20));
                 
         constraints.gridx = 1;
         constraints.gridy = 1;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         jPC.add (Numero, constraints); 
         
         constraints.gridx = 2;
         constraints.gridy = 1;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         jPC.add (TxNumero, constraints); 
         
         constraints.gridx = 1;
         constraints.gridy = 2;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         jPC.add (Comprobar, constraints);

         contentPane.add(jPC);
         
         TxNumero.addFocusListener(new FocusListener() {


             public void focusLost(FocusEvent e) {
                 System.out.println("Perdido foco");

                    try { 
                         numeror=Integer.parseInt(TxNumero.getText());  
                         control=false;
                     }  
                    catch (NumberFormatException f) {
                         System.out.println(" no es un numero");     
                         control=true;
                         JOptionPane.showMessageDialog(null, "Debe introducir un número", "Error - Se espera un número", JOptionPane.WARNING_MESSAGE);
                         TxNumero.setText(null);
                         TxNumero.requestFocus();
                    } 

//                 }
            }
             public void focusGained(FocusEvent e) {
             }
        });
         
         
              ActionListener alhacerclick = new ActionListener() {
         @Override
             public void actionPerformed(ActionEvent e) {
                 
                if ((TxNumero.getText().length()!=0) && (control==false)){
                 mensaje= parsiono(numeror);
                 JOptionPane.showMessageDialog(null, numeror + " " +mensaje, "Resultado de la comparación", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println(TxNumero.getText()+ mensaje);    
                 }
                
             }
        };
     
         Comprobar.addActionListener(alhacerclick);
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
    }
    
        
         public String parsiono (int numeror){     
         String Mensaje="";
       
             if (numeror%2==0) {            
                Mensaje="Es un número par";
             }else{            
                Mensaje="Es un número impar";
             
         } 
         return Mensaje;
    
     }

    
    
}