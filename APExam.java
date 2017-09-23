/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PAGE 83!!
package Quarter1;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class APExam {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your exam type.");
        String type = in.nextLine();
        System.out.println("Enter your score.");
        int Score = in.nextInt();
        
        if (type.equalsIgnoreCase("A")){
            if (Score >= 60){
                System.out.println("5");
            }else if (Score >= 50){
                System.out.println("4");
            }else if (Score >= 40){
                System.out.println("3");
            }else if (Score >= 30){
                System.out.println("2");
            }else{ System.out.println("1");}
        }else if (type.equalsIgnoreCase("AB")){
          if (Score >= 70){
                System.out.println("5");
            }else if (Score >= 60){
                System.out.println("4");
            }else if (Score >= 50){
                System.out.println("3");
            }else if (Score >= 40){
                System.out.println("2");
            }else{ System.out.println("1");
             }
        }else{
            System.out.print("Please try again with a valid exam type.");
        }
    }}

