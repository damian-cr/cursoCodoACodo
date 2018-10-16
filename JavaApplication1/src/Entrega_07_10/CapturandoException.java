
package Entrega_07_10;

public class CapturandoException {
        public static void main(String []args){

        try{
            throw new Exception("Mostrando el mensaje del Exception");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }finally{
            System.out.println("Y finalmente se ejecuta el Finally como siempre");
        }
    }
}
