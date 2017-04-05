/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam122
 */
public class FizzBuzz {
    
    
    
   /* public int getFizzBuzz(int num){
        return num;
    }
   */
    public String getFizzBuzz(int num){
        
        String resultado = String.valueOf(num);
        
        if(num==3){
            resultado = "Fizz";
        }  
        return resultado;          
    }
}
