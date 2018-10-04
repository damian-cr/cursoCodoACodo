package Unidad4_PantallasGraficas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaAlumnos extends JFrame{
    
    public VentanaAlumnos(){
        setSize(600,400); //setea el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //se coloca esta sentencia para que cuando presiono la X para cerrar la ventana se cierre el programa o sino continuara corriendo
        setTitle("Alumnos"); //titulo de ventana
        setLocationRelativeTo(null); //centra la ventana
        setVisible(true); //por default la ventana no es visible asi que debo habilitarlo con este comando
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);        //     desactiva el Layout del panel para poder ubicar el label en diferente lugar
  //    panel.setBackground(Color.green); cambia el color del panel
        
        JLabel nombre = new JLabel("Nombre");
        panel.add(nombre);
        nombre.setBounds(20,30, 200, 10);
        
        JLabel apellido = new JLabel("Apellido",SwingConstants.CENTER);//texto de la etiqueta + ubicacion SwingConstants (left,center,right) 
   /*   apellido.setText("Apellido");
        apellido.setHorizontalAlignment(SwingConstants.CENTER);  */ // si no quiero usar el constructor y lo quiero setear por fuera
        panel.add(apellido);
        apellido.setBounds(20,80, 100, 20);
        apellido.setForeground(Color.yellow);  //cambia el color de la letra de la etiqueta
        apellido.setOpaque(true);  //damos permiso para que se pinte la etiqueta
        apellido.setBackground(Color.blue);  //cambia el color de fondo de la etiqueta pero antes debo desactivar el diseño por defecto para que permita cambiarse
        apellido.setFont(new Font("courier new",Font.PLAIN,20)); // seteo la fuente de la letra de la etiqueta. El tipo de letra puedo colocarlo en forma numerica:0(normal),1(negrita),2(cursiva),3(cursiva y negrita)
   
        JLabel imagen = new JLabel (new ImageIcon("copaMundial.jpg")); //etiqueta con imagen
        panel.add(imagen);
        imagen.setBounds(20, 120, 259, 194);
         

    
    }
}
