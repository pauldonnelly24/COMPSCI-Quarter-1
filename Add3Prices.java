/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter1;
import java.util.Scanner;
/**
 *
 * @author PJD
 */
public class Add3Prices {

public static void main(String[] args){
double price1, price2, price3, sum, average;

 Scanner in = new Scanner(System.in);
 System.out.println("Enter 1st price");
 price1 = in.nextDouble();
 in.nextLine();
 System.out.println("Enter 2nd price");
 price2 = in.nextDouble();
 in.nextLine();
 System.out.println("Enter 3rd price");
 price3 = in.nextDouble();
 in.nextLine();
 
 
 sum = price1 + price2 + price3;
 System.out.printf("The sum is" + "$%.2f", sum);
 average = sum/3;
 System.out.printf("The average is" + "$%.2f", average);
}
}

