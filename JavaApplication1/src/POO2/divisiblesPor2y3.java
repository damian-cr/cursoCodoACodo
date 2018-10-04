package POO2;

public class divisiblesPor2y3 {
    
    public static void main(String[] args) {
        
        int i;
        System.out.println ("Los siguientes numeros son divisibles por 2 y 3 al mismo tiempo");
        for (i=1;i<=100;i++){
            if (i%2==0 && i%3==0){
                System.out.println (i);
            }
        }
    }
    
}
