package POO2;

import java.util.Scanner;

public class paresOImparesDe10Numeros {

    public static void main (String[] args){
        int i,numero,sonPares,sumaPar,sonImpares,sumaImpar;
        float promImpar;
        sonPares = 0;
        sumaPar = 0;
        sonImpares = 0;
        sumaImpar = 0;
        Scanner teclado = new Scanner(System.in);
        for (i=0;i<10;i++){
            System.out.println ("Ingrese un numero");
            numero = teclado.nextInt();
            if (numero%2==0){
                sonPares ++;
                sumaPar = sumaPar + numero;    
            }else {
                sonImpares++;
                sumaImpar = sumaImpar + numero;
            }
        }
        promImpar = (float) sumaImpar / sonImpares;
        System.out.println ("De todos los numeros, " + sonPares + " son pares" );
        System.out.println ("La suma de los pares es: " + sumaPar);
        System.out.println ("El promedio de los impares es: " + promImpar);
    }
}
