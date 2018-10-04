/*
 * Algoritmo que lea 10 numeros, calculando su promedio y escribiendo el valor 
 * de su suma y promedio
 */


import java.util.Scanner;

public class Ejerc5 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int totsum = 0;
        float prom;

        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {

            System.out.println("Ingrese numero:");

            numero[i] = num.nextInt();

            totsum = totsum + numero[i];

        }

   /*     for (int i = 0; i < numero.length; i++) {

            totsum = totsum + numero[i];

            prom = (float) totsum / numero.length;

      }*/

         prom = (float)totsum / numero.length;

        System.out.println("El total de la suma de los numeros es de :" + totsum);

        System.out.println("El promedio entre los numeros ingresados es:" + prom);

    }

}