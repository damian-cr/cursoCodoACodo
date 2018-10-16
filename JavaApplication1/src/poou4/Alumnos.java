/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poou4;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author SGallay
 */
public class Alumnos extends JFrame{
    private JPanel panel;
    private JButton botonAceptar;
    private JTextField campoNombre;
    private JTextField campoApellido;
    private String titulo;
    
    public Alumnos(){
        this.setSize(600,400);
        setTitle("Alumnos");
        setLocationRelativeTo(null);
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
}
    
    private void iniciarComponentes(){
       colocarPaneles(); 
       colocarEtiquetas();
       colocarCajasDeTexto();
       colocarBotones();
        
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }   
    
    private void colocarEtiquetas(){
        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        etiquetaNombre.setBounds(210, 10, 50, 30);
        panel.add(etiquetaNombre);
        
        JLabel etiquetaApellido = new JLabel("Apellido: ");
        etiquetaApellido.setHorizontalAlignment(SwingConstants.RIGHT);
        etiquetaApellido.setBounds(200, 50, 60, 30);
        panel.add(etiquetaApellido);
    }
    
    private void colocarCajasDeTexto(){
        campoNombre = new JTextField();
        campoNombre.setBounds(265, 10, 100, 30);
        panel.add(campoNombre);
        
        campoApellido = new JTextField();
        campoApellido.setBounds(265, 50, 100, 30);
        panel.add(campoApellido);
    }
    
    private void colocarBotones(){
        botonAceptar = new JButton();
        botonAceptar.setBounds(250, 90, 100, 100);
        ImageIcon aceptar = new ImageIcon("Student.png");
        //botonAceptar.setOpaque(true);
        //botonAceptar.setBackground(Color.yellow);
        //botonAceptar.setIcon(new ImageIcon(aceptar.getImage().getScaledInstance(botonAceptar.getWidth(), botonAceptar.getHeight(), Image.SCALE_DEFAULT)));
        //botonAceptar.setIcon(aceptar);
        botonAceptar.setIcon(new ImageIcon(getClass().getResource("Student.png")));
        panel.add(botonAceptar);        
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                titulo = "Alumno: " + campoNombre.getText() + " " + campoApellido.getText();
                System.out.println(titulo);
                cambiarTitulo(ae);
            }
        };
        
        botonAceptar.addActionListener(oyenteDeAccion);
        
    }
    
    private void cambiarTitulo(java.awt.event.ActionEvent evt) {                                         
        this.setTitle(titulo);
    }  
    
}
