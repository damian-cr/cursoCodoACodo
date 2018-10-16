package Entrega_23_09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Comprobar extends JFrame{
        
        JPanel panel;
        JTextField cajaNumero;
        JButton comprobar;
    
    public Comprobar(){
        setSize(300, 250); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("¿Par o Impar?"); 
        setLocationRelativeTo(null); 
        setVisible(true); 
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();
        colocarCajasDeTexto();
    }
    
    private void colocarPaneles(){
    
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);             
    }

    private void colocarEtiquetas(){ 
        JLabel nombre = new JLabel();
        nombre.setText("Ingresar un numero");
        nombre.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(nombre);
        nombre.setBounds(40,30,200, 20);
       
    } 

    private void colocarCajasDeTexto(){
        cajaNumero = new JTextField();
        panel.add(cajaNumero);
        cajaNumero.setBounds(70,70, 150, 30);
           
    }
    
    private void colocarBotones(){
        comprobar = new JButton ("Comprobar");
        comprobar.setBounds(95, 130, 110, 30);
        panel.add(comprobar);
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               comprobarNumero(ae); 
            }
        };
        
        comprobar.addActionListener(oyenteDeAccion);
    }
    
    private void comprobarNumero(java.awt.event.ActionEvent evt)  {                                         
        int numero;
        String texto;
        texto = "No ingreso un numero";
        try{
           if (!"".equals(cajaNumero.getText())){
               numero = Integer.parseInt(cajaNumero.getText());
               if (numero %2 != 0)
                   texto = "El numero ingresado es Impar";
               else
                   texto = "EL numero ingresado es Par";
           }
        }catch(NumberFormatException  e){
                texto = "No ingreso un numero valido";
        }
        JOptionPane.showMessageDialog(null,texto,"Resultado",JOptionPane.INFORMATION_MESSAGE);   
       
    }
        
}
