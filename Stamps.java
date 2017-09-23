/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter1;
import java.util.Scanner;
/**
 *
 * @author PEYJAYY Donnelly
 */
public class Stamps {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    
    System.out.println("How much money do you have in dollars?");
    double money = in.nextDouble();
    in.nextLine();
    
    double onecent = .01;
    double firstclass = .47;
    
    double dcent = money/onecent;
    int intcent = (int) dcent;
        System.out.println("You can buy " +  intcent + " one-cent stamps.");
        System.out.println("OR!");
    double dfirst = money/firstclass;
    int intfirst = (int) dfirst;
    double remainingcents = (money%firstclass)*100;
    int intremainingcents = (int) remainingcents;
        System.out.println("You can buy " + intfirst + " first-class and " + intremainingcents + " one-cent stamps.");
   
        
    }  
}
