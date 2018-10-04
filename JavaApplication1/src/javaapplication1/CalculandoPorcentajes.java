package javaapplication1;

import java.util.Scanner;

public class CalculandoPorcentajes {
    public static void main(String[] args) {
        int niñas,niños,cantidad;
        float porcentajeNiñas,porcentajeNiños;
        
        niñas=54;
        niños=27;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de alumnos del curso: ");
		cantidad = teclado.nextInt();
        porcentajeNiñas=niñas*100/cantidad;
        porcentajeNiños=niños*100/cantidad;
        
        System.out.println("El porcentaje de niños es: " + String.format("%.2f" , porcentajeNiños) + "\nEl porcentaje de niñas es: " + String.format("%.2f", porcentajeNiñas));
        
    }
    
}


