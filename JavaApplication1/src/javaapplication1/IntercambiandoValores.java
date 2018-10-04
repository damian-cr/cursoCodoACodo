package javaapplication1;

import java.util.Scanner;
public class IntercambiandoValores {
    public static void main(String[] args) {
      
        int a,b,c, aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: " );
        a=teclado.nextInt();
        System.out.println("Ingresa el segundo valor: " );
        b=teclado.nextInt();
        System.out.println("Ingresa el tercer valor: " );
        c=teclado.nextInt();
              
        System.out.println("Ingresaste los siguientes valores:"+a+"-"+b+"-"+c );
        aux=c;
        c=a;
        a=aux;
        System.out.println("Pero yo te los cambie:"+a+"-"+b+"-"+c);         
        
    }
}