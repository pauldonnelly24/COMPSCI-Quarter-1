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
public class Notebooks2 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double notebooks, notebookprice, pricewithtax, total;
    
    System.out.println("Enter your career.");
    in.nextLine();
    System.out.println("Enter the number of notebooks purchased here.");
    notebooks = in.nextDouble();
    in.nextLine();
    System.out.println("Enter the price of one notebook here.");
    notebookprice = in.nextDouble();
    in.nextLine();
    
    double tax = 0.06*notebookprice*notebooks;
    pricewithtax = (notebooks*notebookprice)+tax;
    System.out.printf("Your total is " + "$%.2f", pricewithtax);
    
}
}