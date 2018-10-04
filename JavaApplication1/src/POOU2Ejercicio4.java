
import static java.lang.Thread.sleep;

public class POOU2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    
    static int vacunas;
        
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        //Se agrega un contador para probar el programa
        int contador;
        contador=0;
        vacunas=1000;
        boolean entregando;
        entregando=true;
        
        do{
            while (vacunas>200&&entregando==true){
                sleep(1000);
                contador++;
                if (contador >= 10)
                    entregando=false;
            }
            if(vacunas<=200)
                System.out.println("Quedan menos de 200 vacunas");
        }while(entregando==true);
        
    }
    

    
}
