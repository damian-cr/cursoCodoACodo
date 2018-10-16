
package GUI;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Formulario extends JFrame {
    
    public Formulario ()
    {
         setTitle("Practica de Layaout - Ejercicio 3 ");
         setSize(300, 300); 
         setLocation(250,250);
         componentesformulario();
    }
            
    public void componentesformulario(){
         Container contentPane = getContentPane(); 
         JPanel  jPC = new JPanel();
         contentPane.add(jPC);   
         jPC.setLayout(null); 
         JButton jBenviar = new JButton("Enviar");
         JLabel jLNombres = new JLabel("Nombres: ");
         JLabel jLApellidos = new JLabel("apellidos: ");
         JLabel jLGenero = new JLabel("Genero: ");
         JLabel jLConfirmar = new JLabel("¿Está usted de acuerdo? ");
         JRadioButton rBHombre = new JRadioButton();
         JRadioButton rBMujer = new JRadioButton();
         JCheckBox cBConfirmar = new  JCheckBox();
         JTextField  jTNombres = new JTextField();
         JTextField  jTApellidos = new JTextField();
         jLNombres.setText("Nombres:");
         jLApellidos.setText("Apellidos:");
         jLGenero.setText("Genero: ");
         jLNombres.setBounds(40, 10, 60, 20);
         jTNombres.setBounds(100, 10, 130, 20);
         jLApellidos.setBounds(40, 35, 60, 20);
         jTApellidos.setBounds(100, 35, 130, 20);
         jLGenero.setBounds(30, 140, 50, 20);
         rBHombre.setBounds(80, 140, 75, 20);
         rBMujer.setBounds(160, 140, 80, 20);
         jLConfirmar.setBounds(45,190 ,150 ,20);
         cBConfirmar.setBounds(185, 190 ,120 ,20);
         jBenviar.setBounds(98, 215, 90, 20);

         this.add(jPC);
         ButtonGroup grupoboton = new ButtonGroup();
         grupoboton.add(rBHombre);
         grupoboton.add(rBMujer);

         rBHombre.setText("Hombre ");
         rBMujer.setText("Mujer ");
         jPC.add(jLNombres);
         jPC.add(jTNombres);
         jPC.add(jLApellidos);
         jPC.add(jTApellidos);
         jPC.add(jLGenero);
         jPC.add(rBHombre);
         jPC.add(rBMujer);
         jPC.add(jLConfirmar);
         jPC.add(cBConfirmar);
         jPC.add(jBenviar);
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
        }
}
