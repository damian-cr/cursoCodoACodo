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
public class Ejercicio1 {
    
    public static void main (String []args){
        try{
            System.out.println("Intentamos ejecutar el bloque de instrucciones:" + 
                    "\nInstrucción 1." + 
                    "\nInstrucción 2." +
                    "\nInstrucción 3, etc.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Instrucción a ejecutar finalmente tanto si se producen errores como si no.");
        }
        
    }
    
}
