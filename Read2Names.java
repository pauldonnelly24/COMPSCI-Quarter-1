/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter1;

/**
 *
 * @author Owner
 */
import java.util.Scanner;
public class Read2Names {
    public static void main (String[] args) {
    String name1, name2;
Scanner in = new Scanner(System.in);
System.out.println("What's your name?");
    name1 = in.nextLine();
System.out.println("What's your father's name?");
    name2 = in.nextLine();
System.out.println(name1.length());
System.out.println(name2.length()); 
if(name1.equalsIgnoreCase(name2)){
    System.out.println("You share the same name.");
}else{
    System.out.println("Your names are not the same.");
}
   
}
}
