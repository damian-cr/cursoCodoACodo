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
public class ExcepcionPropia extends Exception{
    private String mensaje;
    
    public ExcepcionPropia(String mensaje){
        this.mensaje = mensaje;
    }
    
    public String getMessage(){
        return mensaje;
    }
    
}
