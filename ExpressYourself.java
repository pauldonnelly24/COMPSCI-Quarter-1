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
public class ExpressYourself {
    public static void main (String[] args) {
String fullName, gender, title;
String m = "male";
String f = "female";
int age, height; 

Scanner in = new Scanner(System.in);

System.out.println("What is your gender? Enter either 'male' or 'female'");
gender = in.nextLine();
if (gender.equalsIgnoreCase(m) == true){
    title = "Mr.";
}else if(gender.equalsIgnoreCase(f) == true){
    title = "Mrs.";
}else{
    System.out.println("You either didn't enter 'male' or 'female correctly, or you somehow identify as a different gender...");
}
System.out.println("What's your age?");
age = in.nextInt();
in.nextLine();

System.out.println("What's your full name, friend?");
fullName = in.nextLine();

System.out.println("What's your height (i.e 57 for 5 feet 7 inches)?");
height = in.nextInt();
in.nextLine();

System.out.println("Hello " + fullName + "!");
System.out.printf("You are " + age + " years old, " + gender + " and " + height + " inches tall!");
    
}
}

