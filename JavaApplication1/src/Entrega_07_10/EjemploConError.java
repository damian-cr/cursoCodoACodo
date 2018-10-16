package Entrega_07_10;

public class EjemploConError {
        public static void main (String []args){
        try{
            System.out.println("Ejecutamos el bloque de instrucciones:" + 
                    "\nInstrucción 1."); 
            int n = Integer.parseInt("Esto Falla");
            System.out.println("\nInstrucción 2." +
                    "\nInstrucción 3, etc.");
        }catch(Exception e){
            System.out.println("Pase por el catch porque no pude asignarle el int a la variable n");
        }finally{
            System.out.println("Y finalmente se ejecuta el Finally como siempre");
        }
        
    }
    
}
