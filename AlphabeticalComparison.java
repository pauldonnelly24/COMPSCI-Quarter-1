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
public class AlphabeticalComparison {
   
public static void main(String[] args){
        String name1, name2;
        int namevalue;
Scanner in = new Scanner(System.in);

System.out.println("What's your name?");
    name1 = in.nextLine();
System.out.println("What's your father's name?");
    name2 = in.nextLine();
if(name1.compareTo(name2) < 0) {
   
   System.out.println("Comparison result: " + name1 + " comes before " + name2);
}else if(name1.compareTo(name2) < 0){
    System.out.println("Comparison result: " + name2 + " comes before " + name1);
}else{
    System.out.println("The names are the same!");
}
}
}
