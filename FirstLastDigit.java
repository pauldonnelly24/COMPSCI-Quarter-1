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
    
}
    }
    

