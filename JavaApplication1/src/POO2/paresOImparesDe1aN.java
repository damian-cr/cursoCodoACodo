package POO2;

import java.util.Scanner;

public class paresOImparesDe1aN {
    
    public static void main (String[] args){
        int i,max,sumaPar,sumaImpar;
        sumaPar = 0;
        sumaImpar = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Ingrese el numero hasta el cual se analizara");
        max = teclado.nextInt();
        
        for (i=1;i<=max;i++){
            if (i%2==0){
                sumaPar = sumaPar + i;
            }else {
                sumaImpar = sumaImpar + i;
            }
        } 
        
        System.out.println("La suma de los numeros pares es: " + sumaPar);
        System.out.println ("La suma de los numeros impares es: " + sumaImpar);
    }
    
}
