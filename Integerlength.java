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
public class Integerlength {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int integer;
        System.out.println("Enter any integer of your choice");
        integer = in.nextInt();
        in.nextLine();
        
        Integer.toString(integer);
        int length = String.valueOf(integer).length();
        System.out.println("There are " + length + " digits.");
      
        
        int digits = 0;
        while(integer > 0){
            integer /= 10;
            digits++;
        }
        System.out.println("There are " + digits + " digits.");
            
        }
    }

