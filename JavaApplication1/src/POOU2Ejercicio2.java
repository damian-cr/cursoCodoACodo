import java.util.Scanner;

/**
 *
 * Dados 10 números enteros que se ingresan por teclado, calcular
cuántos de ellos son pares, cuánto suman ellos y el promedio de los
impares
 */
public class POOU2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]= new int[10];
        int contPar, sumPar,sumImpar;
        float contImpar,prom;
        Scanner sc= new Scanner(System.in);
        
        contPar=0;
        contImpar=0;
        sumPar=0;
        sumImpar=0;
        
        System.out.println("Ingrese 10 numeros enteros: ");
        for (int i=0;i<10;i++){
            num[i] = sc.nextInt();
            if(num[i]%2==0){
                contPar++;
                sumPar+=num[i];
            }else{
                contImpar++;
                sumImpar+=num[i];
            }
        }
        prom=sumImpar/contImpar;
        
        System.out.println("\n\nLos resultados de los numeros ingresados son:\nCantidad Par: " + contPar + 
                "\nSuma de numeros Par: " + sumPar+
                "\nCantidad Impar: "+  String.format("%.0f" , contImpar)+
                "\nPromedio Impar: " +prom);
        
            
        
        
    }
    
}