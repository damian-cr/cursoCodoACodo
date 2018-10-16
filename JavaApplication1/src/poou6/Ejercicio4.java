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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        try {
            throw new ExcepcionPropia("Ejecutando una excepcion Propia");
        } catch(ExcepcionPropia e) {
            System.out.println(e.getMessage());
        }        
      }
    
}
