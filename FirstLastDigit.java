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
public class FirstLastDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int integer;
        System.out.println("Enter an integer.");
        integer = in.nextInt();
        String intString = String.valueOf(integer);
        char a = intString.charAt(0);
        char z = intString.charAt(intString.length() - 1);
     System.out.println("First digit is " + a + " and the last digit is " + z);
        /*int num = in.nextInt();

String numString = String.valueOf(num);
char first = numString.charAt(0);
char last = numString.charAt(numString.length() - 1);

System.out.println("The first digit is " + first + ", and the last digit is " + last);*/
        
       
    int fdig, ldig, num;

    System.out.println("Enter an Integer.");
    num = in.nextInt();

    ldig = num%10;
    fdig = num/10;
    while (num > 0)
    { 
        num = num/10;
    }
         System.out.println("The first digit is " + fdig + ", and the last digit is " + ldig + ".");
         
}
    }
    

