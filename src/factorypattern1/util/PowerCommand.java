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
public class PowerCommand extends MathCommand {

    @Override
    public int calculate(int x, int y) {
       int total=1;
       for(int i=0; i<y; i++){
           total =total *x;
       }
       return total;
    }
    
}
