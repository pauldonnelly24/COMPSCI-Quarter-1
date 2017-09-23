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
public class Change {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int cents, quarter, quarterq, dime, dimeq, nickel, nickelq, penny, pennyq;
        System.out.println("Enter the amount of money you have in cents here.");
        cents = in.nextInt();
        in.nextLine();
        
        penny = 1;
        pennyq = cents/penny;
        System.out.println("You could have " + pennyq + " pennies.");
       
        nickel = 5;
        nickelq  = cents/nickel;
        System.out.println("You could have " + nickelq + " nickels.");
        
        dime = 10;
        dimeq = cents/dime;
        System.out.println("You could have " + dimeq + " dimes.");
        
        quarter = 25;
        quarterq = cents/quarter;
        System.out.println("You could have " + quarterq + " quarters.");
        
    }
}
