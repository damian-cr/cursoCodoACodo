/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poou6;

/**
 *
 * @author SGallay
 */
public class Ejercicio2 {
    
    public static void main (String []args){
        try{
            System.out.println("Intentamos ejecutar el bloque de instrucciones:" + 
                    "\nInstrucción 1."); 
            int n = Integer.parseInt("M");
            System.out.println("\nInstrucción 2." +
                    "\nInstrucción 3, etc.");
        }catch(Exception e){
            System.out.println("Instrucciones a ejecutar cuando se produce un error");
        }finally{
            System.out.println("Instrucción a ejecutar finalmente tanto si se producen errores como si no.");
        }
        
    }
    
}
