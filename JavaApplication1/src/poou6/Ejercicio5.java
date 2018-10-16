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
public class Ejercicio5 {
    
    public static void main(String []args){
        int num1,num2;
        num1=100;
        num2=100;
        try{
            while (true){
                System.out.println(num1/num2);
                num2-=2;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }         
    }
    
}
