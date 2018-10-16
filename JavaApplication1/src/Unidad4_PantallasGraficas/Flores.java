package Unidad4_PantallasGraficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Flores extends JFrame {
    private JPanel panel;
    private JComboBox lista;
    private JButton botonAceptar;
    private String titulo;
    
public Flores (){
        setSize(550,450); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Flores"); 
        setLocationRelativeTo(null); 
        setVisible(true); 
        iniciarComponentes();

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarLista();
        colocarBotones();
    }
    
    private void colocarPaneles(){
    
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);             
    }
    
     private void colocarEtiquetas(){ 
        JLabel nombre = new JLabel();
        nombre.setText("Nombre de Flor:");
        nombre.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(nombre);
        nombre.setBounds(20,30, 100, 20);
       
    }  
     
     private void colocarLista(){
        String []flores = {"Rosas","Margarita","Jazmín","Azucena","Clavel","Petunia","Tulipán"};
        lista = new JComboBox(flores);
        panel.add(lista);
        lista.setBounds(200,30,150,30);

    }
     
     
    private void colocarBotones(){
        botonAceptar = new JButton();
        panel.add(botonAceptar);
        botonAceptar.setBounds(200, 100, 150, 90);
        botonAceptar.setText("ACEPTAR");
        eventoOyenteAccion();        
    
    }
    
    private void eventoOyenteAccion() {
        ActionListener oyenteAccion;
        oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                titulo = (String)lista.getSelectedItem();
                cambiarTitulo(e);
            }
        };
        botonAceptar.addActionListener(oyenteAccion);
    } 
    
     private void cambiarTitulo(java.awt.event.ActionEvent evt){
        this.setTitle(titulo);
    }
   
}