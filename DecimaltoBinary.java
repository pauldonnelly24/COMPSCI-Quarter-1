/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter1;
import java.util.Scanner;
/**
 *
 * @author PJJJ
 */
public class DecimaltoBinary {
public static void main(String[] args){
    System.out.println("Enter a decimal number to convert it into a binary number.");
    Scanner in = new Scanner(System.in);
    int dec = in.nextInt();
    int expo = 0;
    int sum = 0;
   
    while(dec >= (int)(Math.pow(2, expo))){
            expo++;
        }
    
    if((int)(Math.pow(2, expo)) > dec){
            expo--;
    }
        while(expo >= 0){
        if(((dec % (int)(Math.pow(2, expo)) != 0)&&((expo != (dec % (int)(Math.pow(2, expo)))))||(dec == 1 + (int)(Math.pow(2, expo))))||(dec == Math.pow(2, expo))){
        sum += (int)(Math.pow(10, expo));
        dec -= (int)(Math.pow(2, expo));
        }
      

    expo--;
}
System.out.println(sum);
        }
       
    }

