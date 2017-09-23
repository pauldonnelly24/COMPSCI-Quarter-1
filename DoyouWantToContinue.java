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
public class DoyouWantToContinue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("Y")||answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("Sure")||answer.equalsIgnoreCase("OK")||answer.equalsIgnoreCase("Why not?")){
            System.out.println("OK");
        }else if (answer.equalsIgnoreCase("N")||answer.equalsIgnoreCase("No")||answer.equalsIgnoreCase("No thanks")){
            System.out.println("Terminating.");
        }else{
            System.out.println("Bad input.");
        }
        
}}    
