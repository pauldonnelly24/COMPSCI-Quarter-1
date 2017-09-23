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
public class EvenorOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer greater than 10.");
        int input = in.nextInt();
        if (input <= 10) {
            System.out.println("I said 'an integer greater that 10'!");
        }else if (input > 10){
            if (input%2 == 0){
                System.out.println("The integer is even.");
            }else{System.out.println("The integer is odd.");
            if (input%3 == 0){
                System.out.println("The Integer is divisible by 3."); 
            }else{System.out.println("It's not divisible by 3.");}
            if (input%5 == 0){
                System.out.println("the integer is divisible by 5.");
            }else{System.out.println("It's not divisble by 5.");}
            }
            
        
    }
}}
