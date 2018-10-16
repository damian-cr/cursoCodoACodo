package Entrega_07_10;

public class CapturandoOwnException {
    
    public static void main(String []args){

        try{
            throw new OwnException("Ejecutando mi OwnException");
        }catch(OwnException error){
            System.out.println(error.mostraMensaje());
        }
    }
}
