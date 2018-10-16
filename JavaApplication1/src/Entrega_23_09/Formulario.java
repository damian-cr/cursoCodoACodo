package Entrega_23_09;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class Formulario extends JFrame{
        
        JPanel panel;
        JTextField cajaNombre,cajaApellido;
        JButton enviar;
    
    public Formulario(){
        setSize(400, 400);         
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Formulario"); 
        setLocationRelativeTo(null); 
        setVisible(true); 
        iniciarComponentes();
    
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarRadioBotones();
        colocarBotones();
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
        nombre.setBounds(15,20, 100, 20);
       
        JLabel apellido = new JLabel();
        apellido.setText("Apellido:");
        apellido.setHorizontalAlignment(SwingConstants.CENTER);  
        panel.add(apellido);
        apellido.setBounds(15,60, 100, 20);
        
        JLabel genero = new JLabel();
        genero.setText("Género");
        genero.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(genero);
        genero.setBounds(70,180, 100, 20);

        JLabel acuerdo = new JLabel();
        acuerdo.setText("¿Estás de acuerdo?");
        acuerdo.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(acuerdo);
        acuerdo.setBounds(90,225, 120, 20);        
        
    }  
    
    private void colocarCajasDeTexto(){
        cajaNombre = new JTextField();
        panel.add(cajaNombre);
        cajaNombre.setBounds(115, 20, 250, 30);
        
        
        cajaApellido = new JTextField();
        panel.add(cajaApellido);
        cajaApellido.setBounds(115, 60, 250, 30);
           
    }
    
        public void colocarRadioBotones(){
        JRadioButton radioBotonH = new JRadioButton("H", false);
        panel.add(radioBotonH);
        radioBotonH.setBounds(180, 175, 35, 30);
        
        
        JRadioButton radioBotonM = new JRadioButton("M", false);
        panel.add(radioBotonM);
        radioBotonM.setBounds(240, 175, 35, 30);
        
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBotonH);
        grupoRadioBotones.add(radioBotonM);
        
        JToggleButton  contrato = new JToggleButton();
        panel.add(contrato);
        contrato.setBounds(240, 227, 15, 15);
           
    }
        
    private void colocarBotones(){
        enviar = new JButton ("Enviar");
        panel.add(enviar);
        enviar.setBounds(140, 280, 90, 30);
        
    }
}
