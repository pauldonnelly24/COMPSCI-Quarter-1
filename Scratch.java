/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author matthew.gonzalgo
 */
public class Scratch {

public static void main(String []args){
    Scanner in = new Scanner(System.in);
    
    System.out.println("Did you take exam A or AB?");
    String examType = in.nextLine();
    
    System.out.println("What score did you get?");
    int percentScore = in.nextInt();
    
    int grade = 0;
    if(examType.equalsIgnoreCase("A")){
        if(percentScore > 60){
            grade = 5;
        }else if((percentScore >= 50)){
            grade = 4;
        }else if((percentScore >= 40)){
            grade = 3;
        }else if((percentScore >= 30)){
            grade = 2;
        }
    }else if(examType.equalsIgnoreCase("AB")){
        if(percentScore > 70){
            grade = 5;
        }else if((percentScore >= 60)){
            grade = 4;
        }else if((percentScore >= 50)){
            grade = 3;
        }else if((percentScore >= 40)){
            grade = 2;
    }else{
        System.out.println("You did not take a valid exam");
    }
  
    }
   System.out.println("Your grade: " + grade);
}
}