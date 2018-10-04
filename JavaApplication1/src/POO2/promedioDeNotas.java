package POO2;

public class promedioDeNotas {
    
    public static void main (String [] args){
        
        int i,n,suma;
        float prom;
        n = 10;
        suma = 0;
        int nota[] = new int[35];
        
        for (i=0; i < nota.length; i++){
            nota[i] = (int) (Math.random() * n) + 1;
            suma = suma + nota[i];
        }
       
        prom = (float)suma/nota.length;
        System.out.println ("El promedio de todas las notas es: "+ prom);
  
    }
    
}
