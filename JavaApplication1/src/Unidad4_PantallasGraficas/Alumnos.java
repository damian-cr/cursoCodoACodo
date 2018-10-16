package Unidad4_PantallasGraficas;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Alumnos extends JFrame{
    
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaNombre;
    private JTextField cajaApellido;
    private JButton botonAceptar;
    private String titulo;
    

    public Alumnos() {
        setSize(600,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Alumnos"); 
        setLocationRelativeTo(null); 
        setVisible(true); 
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarCajasDeTexto();
    }
    
    
    private void colocarPaneles(){
    
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);             
    }
     
    private void colocarEtiquetas(){ 
        JLabel nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(nombre);
        nombre.setBounds(20,30, 100, 20);
       
        JLabel apellido = new JLabel();
        apellido.setText("Apellido:");
        apellido.setHorizontalAlignment(SwingConstants.CENTER);  
        panel.add(apellido);
        apellido.setBounds(20,80, 100, 20);
    }  
    
    private void colocarCajasDeTexto(){
        cajaNombre = new JTextField();
        panel.add(cajaNombre);
        cajaNombre.setBounds(140, 30, 300, 30);
        
        
        cajaApellido = new JTextField();
        panel.add(cajaApellido);
        cajaApellido.setBounds(140, 80, 300, 30);
           
    }
    
    private void colocarBotones (){
        botonAceptar = new JButton();
        botonAceptar.setBounds(220, 150, 150, 50);
        panel.add(botonAceptar);
        ImageIcon imagenAceptar = new ImageIcon("Aceptar.jpg");
        botonAceptar.setIcon(new ImageIcon(imagenAceptar.getImage().getScaledInstance(botonAceptar.getWidth(), botonAceptar.getHeight(), Image.SCALE_SMOOTH)));
        eventoOyenteAccion();
    }
    
    private void eventoOyenteAccion() {
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               titulo = cajaNombre.getText()+" "+cajaApellido.getText();
               cambiarTitulo(e);
            }
        };
        botonAceptar.addActionListener(oyenteAccion);
    }
    
    private void cambiarTitulo(java.awt.event.ActionEvent evt){
        this.setTitle(titulo);
    }
}
