
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Suma extends JFrame {

    public Suma ()
    {
         setTitle("Practica GUI - Ejercicio 5 ");
         setSize(350, 350); 
         setLocation(250,250);
         componentesformulario();
    }
         

    public void componentesformulario(){
     Container contentPane = getContentPane(); 
     contentPane.setLayout(null);
     JPanel panel = new JPanel();
     
     panel.setSize(250, 200);
     panel.setLocation(45, 25);
     Border empty = BorderFactory.createEmptyBorder(10, 10, 10, 10); //creo que no hace lo que yo creia
     panel.setBorder(BorderFactory.createLineBorder(Color.black));
        
     panel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
    
     createComponent("EmptyBorder", empty, panel); 
     panel.setBorder(BorderFactory.createTitledBorder("Number Addition")); 
    
     JButton btExit = new JButton("Exit");
     btExit.setBounds(200, 230, 90, 20);
     add(btExit);
     this.add(panel);
     
      ActionListener alhacerclick = new ActionListener() {
         @Override
             public void actionPerformed(ActionEvent e) {
          
                JOptionPane.showMessageDialog(null, "Usted salio de la aplicacion", "Cerrar la aplicacion",  JOptionPane.INFORMATION_MESSAGE);
                dispose();
             }
        };
     
     btExit.addActionListener(alhacerclick);
     
     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);      
    }    

    private void createComponent(String emptyBorder, Border empty, JPanel panel) {
     
     JLabel label1 = new JLabel();
     JLabel label2 = new JLabel();
     JLabel label3 = new JLabel();
     JTextField txNumeroUno = new JTextField();
     JTextField txNumeroDos = new JTextField();
     JTextField txResultado = new JTextField();
     txNumeroUno.setPreferredSize(new Dimension(120, 20));
     txNumeroDos.setPreferredSize(new Dimension(120, 20));
     txResultado.setPreferredSize(new Dimension(120, 20));
     txResultado.setEditable(false); 
     JButton btAdd = new JButton("Add");
     JButton btClear = new JButton("Clear");
     
     
     label1.setText("Firt Number:");
     label2.setText("Second Number:");
     label3.setText("Result:");
 
     panel.add(label1);
     panel.add(txNumeroUno);
     panel.add(label2);
     panel.add(txNumeroDos);
     panel.add(label3);
     panel.add(txResultado);
     panel.add(btAdd);
     panel.add(btClear);
     
              ActionListener click;
         
         click = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Object fuente = e.getSource();
                    
                 if (fuente.equals(btAdd) && (txNumeroUno.getText().length()!=0) && (txNumeroDos.getText().length()!=0) )                 
                 {
                     //
                     int numero1=0, numero2=0,resultado=0;
                     try { 
                         numero1=Integer.parseInt(txNumeroUno.getText());  
                         numero2=Integer.parseInt(txNumeroDos.getText());
                         resultado=numero1 + numero2;
                         txResultado.setText(String.valueOf(resultado));
                     }  
                    catch (NumberFormatException f) {
                         System.out.println(" no es un numero");     
                         
                         JOptionPane.showMessageDialog(null, "Debe introducir un número", "Error - Se espera un número", JOptionPane.WARNING_MESSAGE);
                         txNumeroUno.setText(null);
                         txNumeroUno.requestFocus();
                         txNumeroDos.setText(null);
                         txResultado.setText(null);
                    } 
                     //
                 } else if ((txNumeroUno.getText().length()==0) && (txNumeroDos.getText().length()==0)) {
                        JOptionPane.showMessageDialog(null, "Debe proporcionar dos valores para realizar la Suma", "Error - Se espera un número", JOptionPane.WARNING_MESSAGE);
                 }  
                 
                 
                 if (fuente.equals(btClear))  
                 {
                     txNumeroUno.setText(null);
                     txNumeroUno.requestFocus();
                     txNumeroDos.setText(null);
                     txResultado.setText(null);
                 }
                

                 }
         }; 
  
         btAdd.addActionListener(click);
         btClear.addActionListener(click);
    }
}
