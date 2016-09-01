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
public class ExitCommand extends MathCommand {

    @Override
    public int calculate(int x, int y) {
        System.exit(0);
       return 0;
    }
    
}
