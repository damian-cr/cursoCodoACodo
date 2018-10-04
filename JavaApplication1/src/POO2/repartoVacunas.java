package POO2;
/* Se toma como supuesto que la ONG realizara un total de 10 entregas por dia. En el caso de 
que el stock disponible luego de realizar una entrega sea mayor o igual a 200 se continuara con la 
siguiente.Pero en el caso de que luego de una entrega el stock sea menor a 200 se suspendera las entregas
informando que el stock es menor al esperado.
*/
public class repartoVacunas {
    
    public static void main (String[] args){
    int vacunasDisponibles = 1000;
    int n = 200;
    boolean entregando = true;
    int vacunasEntregadas;
    int entregas = 1;
    
    while (vacunasDisponibles >= 200 && entregando == true){
        /*se genera en forma aleatoria un numero que reprentara las vacunas de cada entrega a realizar*/
        vacunasEntregadas = (int) (Math.random() * n) + 1; 
            if (entregas != 11){
            vacunasDisponibles = vacunasDisponibles - vacunasEntregadas;
            entregas++;
            }else {
                entregando = false;
            }
    }
    
    if (vacunasDisponibles <=200){
        System.out.println("No se realizaron mas entregas porque tienen menos de 200 vacunas disponibles");
        System.out.println ("Solo le quedan " + vacunasDisponibles + " vacunas");
    }else {
        System.out.println("Se finalizaron las entregas con "+ vacunasDisponibles + " vacunas disponibles");
    }
    
    }
}
