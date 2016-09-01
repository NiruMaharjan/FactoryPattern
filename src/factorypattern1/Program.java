/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern1;

import factorypattern1.util.MathCommand;
import factorypattern1.util.MathFactory;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MathFactory mf=new MathFactory();
        System.out.println("Enter the value of x");
        int x=input.nextInt();
        System.out.println("Enter the value of y");
        int y=input.nextInt();
        
        System.out.println("+.Add");
        System.out.println("-Subtract");
        System.out.println("^Power");
        System.out.println("x.Exit");
        System.out.println("Enter your choice");
        
        String ch=input.next();
        MathCommand cmd=mf.get(ch);
        if(cmd!=null){
            System.out.println(cmd.calculate(x,y));
        }
        
        
    }
    
}
