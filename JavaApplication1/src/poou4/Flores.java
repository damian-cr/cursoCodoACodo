/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poou4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author SGallay
 */
public class Flores extends JFrame{
    private JPanel panel;
    private String titulo;
    private JButton botonAceptar;
    private JComboBox lista;
    private Font f1;
    
    public Flores(){
        this.setSize(550,450);
        setTitle("Flores");
        setLocationRelativeTo(null);
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarListasDesplegables();
        colocarBotones();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }

    private void colocarEtiquetas(){
        JLabel etiquetaFlor = new JLabel("Nombre de Flores:");
        etiquetaFlor.setHorizontalAlignment(SwingConstants.RIGHT);
        etiquetaFlor.setBounds(125, 100, 130, 30);
        panel.add(etiquetaFlor);
    }
    
    private void colocarListasDesplegables(){
        String []flores = {"Azucena","Clavel","Crisantemo","Dalia","Dondiego de noche","Gardenia","Geranios","Gerbera","Gladiolo","Hortensia","Jacinto","Jazmín","Lavanda","Lirio","Margarita","Narciso","Nardo","Pensamiento","Petunia","Rosas","Tulipán"};
        lista = new JComboBox(flores);
        lista.setBounds(260,100,150,30);
        panel.add(lista);
    }
    
    private void colocarBotones(){
        botonAceptar = new JButton();
        botonAceptar.setBounds(210, 200, 130, 130);
        botonAceptar.setIcon(new ImageIcon(getClass().getResource("ok1.png")));
        panel.add(botonAceptar);        
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                titulo = (String) lista.getSelectedItem();
                System.out.println(titulo);
                cambiarTitulo(ae);
                //lista.setFont(new font(Font.BOLD));
                System.out.println(lista.getFont());
                cambiarFuenteLista(lista.getFont());
            }
        };
        
        botonAceptar.addActionListener(oyenteDeAccion);
        
    }
    
    private void cambiarTitulo(java.awt.event.ActionEvent evt) {                                         
        this.setTitle(titulo);
        this.setFont(f1);
        System.out.println("Fuente Titulo: " + this.getFont());
       
    }
    
    private void cambiarFuenteLista(Font f){
        
        String tipo;
        int style, size;
        
        if (f.getStyle() == Font.BOLD)
            style = Font.ITALIC;
        else
            style = Font.BOLD;
        switch(f.getName()){
            case "Dialog": tipo="Arial";
                break;
            case "Arial": tipo = "Calibri";
                break;
            case "Calibri": tipo = "Tahoma";
                break;
            case "Tahoma": tipo = "Century";
                break;
            case "Century": tipo = "Constantia";
                break;
            case "Constantia": tipo = "Segoe Print";
                break;
            case "Segoe Print": tipo = "Verdana";
                break;
            default: tipo = "Dialog";
                break;
        }
        size = f.getSize();
        f1 = new Font(tipo,style,size);
        //System.out.println(f1);
        lista.setFont(f1);
    }
}
