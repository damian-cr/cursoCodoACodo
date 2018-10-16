package Entrega_07_10;

public class EjemploSinError {
    public static void main (String []args){
        try{
            System.out.println("Ejecutamos el bloque de instrucciones:" + 
                    "\nInstrucción 1." + 
                    "\nInstrucción 2." +
                    "\nEjecute todo y solo pase por el try.");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }finally{
            System.out.println("Y finalmente se ejecuta el Finally como siempre");
        }
        
    }
}
