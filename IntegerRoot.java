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
public class IntegerRoot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer greater than 10.");
        int input = in.nextInt();
        if (input <= 10){System.out.println("Error.");
        }else if (input>10){
            if(input%2 == 1){
                System.out.println("odd");
            }else{System.out.println("even");}
            if(input%5 == 0){
                System.out.println("divisible by 5");
            }else{System.out.println("not divisble by 5");}
            if((input%5 != 0) && (input%2 == 0)){
                if (input == 22){
                    System.out.println("root");//This is a root of the quadratic x^2-23x+22.
                }else if (input %10 == 4){
                    System.out.println("The last digit is 4.");     
                }else{System.out.println("The last digit isn't 4.");
                        
             }
            }
            
    }}}
