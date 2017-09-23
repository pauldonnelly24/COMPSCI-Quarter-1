/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter1;
import java.util.Scanner;
/**
 *
 * @author PJ
 */
public class BinarytoDecimal {
    public static void main(String []args){
     Scanner in = new Scanner(System.in);
System.out.println("Please enter a binary number to convert it to a decimal number");
    int bin = in.nextInt();
    int expo = 0;
    int sum = 0;

    
    while (bin > 0){
       
        if(bin % 10 == 1){
       sum += (int)(Math.pow(2, expo));
       expo++;
        }else{
         expo++;
        }
        
         bin /= 10;
        
              
        }}}
