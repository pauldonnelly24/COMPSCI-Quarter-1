/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter1;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
/*
ONLY VALID FOR FORMULAS IN THE FORM ax^2+bx+c=0!!
USE WHEN TRYING TO CALCULATE X!!
*/
public class Quadratic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c, x, discriminant, quadratic;
        
        
        System.out.println("Assign a value for a.");
        a = in.nextDouble();
        
        System.out.println("Assign a value for b.");
        b = in.nextDouble();
        
        System.out.println("Assign a value for c.");
        c = in.nextDouble();
        
        discriminant = (Math.pow(b, 2))-(4*a*c);
        
        if((a == 0)&&(b == 0)&&(c == 0)){
            System.out.println("Any value of x may be the solution.");
        }else if((a == 0)&&(b == 0)&&(c != 0)){
            System.out.println("No solution!");
        }else if((a == 0)&&(b != 0)&&(c != 0)){
            System.out.println("Solution is " + (-c/b));
        }else if((a!=0)&&(discriminant < 0)){
                System.out.println("No real solution!");
        }else{
            double solution1 = ((-b + discriminant)/(2*a));
            double solution2 = ((-b - discriminant)/(2*a)); 
            System.out.println("X is either " + solution1 + " or " + solution2 + ".");
    }}}
