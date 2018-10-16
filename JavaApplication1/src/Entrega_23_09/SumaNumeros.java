package Entrega_23_09;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SumaNumeros extends JFrame{
        
        JPanel panel;
        JTextField cajaPrimerNum,cajaSegundoNum,cajaResultado;
        JButton botonSumar,botonLimpiar,botonSalir;
        
    public SumaNumeros(){
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Number Addition"); 
        setLocationRelativeTo(null); 
        setVisible(true); 
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarBotones();
    } 
    
    private void colocarPaneles(){
    
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);             
    }    
    
    private void colocarEtiquetas(){ 
        JLabel primerNum = new JLabel();
        primerNum.setText("First Number");
        primerNum.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(primerNum);
        primerNum.setBounds(20,40, 100, 20);
       
        JLabel segundoNum = new JLabel();
        segundoNum.setText("Second Number");
        segundoNum.setHorizontalAlignment(SwingConstants.CENTER);  
        panel.add(segundoNum);
        segundoNum.setBounds(20,80, 100, 20);
        
        JLabel resultado = new JLabel();
        resultado.setText("Resultado");
        resultado.setHorizontalAlignment(SwingConstants.CENTER);  
        panel.add(resultado);
        resultado.setBounds(20,120, 100, 20);
    }      
    
    private void colocarCajasDeTexto(){
        cajaPrimerNum = new JTextField();
        panel.add(cajaPrimerNum);
        cajaPrimerNum.setBounds(130, 40, 200, 30);
        
        
        cajaSegundoNum = new JTextField();
        panel.add(cajaSegundoNum);
        cajaSegundoNum.setBounds(130, 80, 200, 30);
        
        cajaResultado = new JTextField();
        panel.add(cajaResultado);
        cajaResultado.setBounds(130, 120, 200, 30);
           
    }
    
    
    private void colocarBotones (){
        botonSumar = new JButton();
        botonSumar.setText("Add");
        panel.add(botonSumar);
        botonSumar.setBounds(130, 170, 80, 30);
        eventoOyenteSumar();
      
      
        botonLimpiar = new JButton();
        botonLimpiar.setText("Clear");
        panel.add(botonLimpiar);
        botonLimpiar.setBounds(220, 170, 80, 30);
        eventoOyenteLimpiar();
        
        
        botonSalir = new JButton();
        botonSalir.setText("Exit");
        panel.add(botonSalir);
        botonSalir.setBounds(250, 230, 80, 30);
        eventoOyenteSalir();
    }
    
    private void eventoOyenteSumar() {
        ActionListener oyenteSumar= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int res;
                 try{
                    if (!"".equals(cajaPrimerNum.getText()) || !"".equals(cajaSegundoNum.getText())){
                        res = Integer.parseInt(cajaPrimerNum.getText()) + Integer.parseInt(cajaSegundoNum.getText());
                        cajaResultado.setText(Integer.toString(res));
                    }else
                       JOptionPane.showMessageDialog(null,"No ingreso numeros en los dos campos","Resultado",JOptionPane.INFORMATION_MESSAGE);  
                 }catch(NumberFormatException  ee){
                       JOptionPane.showMessageDialog(null,"No ingreso un numero valido en alguno de los dos campos","Resultado",JOptionPane.INFORMATION_MESSAGE);
                 }
            }
        };
        botonSumar.addActionListener(oyenteSumar);
    }
    
    private void eventoOyenteLimpiar() {
        ActionListener oyenteLimpiar= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 cajaPrimerNum.setText("");
                 cajaSegundoNum.setText("");
                 cajaResultado.setText("");
            }
        };
        botonLimpiar.addActionListener(oyenteLimpiar);
    }
    
    private void eventoOyenteSalir() {
        ActionListener oyenteSalir= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        };
        botonSalir.addActionListener(oyenteSalir);
    }
    
}
