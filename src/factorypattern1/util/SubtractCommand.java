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
public class SubtractCommand extends MathCommand {

    @Override
    public int calculate(int x, int y) {
       return x-y;
    }
    
}
