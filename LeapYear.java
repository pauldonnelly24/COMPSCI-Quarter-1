/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter1;
import java.util.Scanner;
//THIS CODE FINDS IF THE YEAR INPUT IS A LEAP YEAR.
/**
 *
 * @author Owner
 */
public class LeapYear {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a year.");
        int year = in.nextInt();
        
        if (year >= 1582){
            if (year%400 == 0){
                System.out.println("It's a leap year!");
            }else if ((year%100==0) && (year%4 == 0)){ 
                System.out.println("It's not a leap year:(");
            }else if (year%4 == 0){
                System.out.println("It's a leap year!");
            }
        }else if (year%4==0){
            System.out.println("It's a leap year");   
        }else{System.out.println("It's not a leap year.");
                
        }
        }
    }
