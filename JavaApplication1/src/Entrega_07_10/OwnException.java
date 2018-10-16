package Entrega_07_10;

public class OwnException extends Exception {
    private String mensaje;
    
    public OwnException(String mensaje){
        this.mensaje = mensaje;
    }
    
    public String mostraMensaje(){
        return mensaje;
    }
}
