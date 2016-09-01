/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern1.util;

/**
 *
 * @author Lenovo
 */
public class MathFactory {
    
    public MathCommand get(String key){
        if(key.equals("+")){
            return new AddCommand();
            
        }
        else if(key.equals("-")){
            return new SubtractCommand();
        }
        else if(key.equals("^")){
            return new PowerCommand();
        }
        else if(key.equalsIgnoreCase("x")){
            return new ExitCommand();
        }
       return null; 
    }
    
    
}
