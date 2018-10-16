package Entrega_07_10;

public class BucleConException {
    
    public static void main(String []args){
        try{
            while (true){
                System.out.println(num1/num2);
                num2-=2;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }             
}
