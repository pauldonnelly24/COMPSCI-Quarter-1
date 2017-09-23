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
public class TwoNames2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name.");
        String name1 = in.nextLine();
        System.out.println("Enter another name.");
        String name2 = in.nextLine();
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("The names are identical.");
        }else if (name1.compareTo(name2)<0){
            System.out.println("The first name comes before the second name alphabetically.");
        }else{System.out.println("The second name comes before the first alphabetically");
            
        }
    }
}
