/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/*
 *
 * @author PJD
 */
public class NotebookTwo {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
    double tax, notebooks, notebookprice, price, total;
    
    System.out.println("Enter your career here.");
    String career = in.nextLine();
    System.out.println("Enter the number of notebooks purchased here.");
    notebooks = in.nextDouble();
    in.nextLine();
    System.out.println("Enter the price of one notebook here.");
    notebookprice = in.nextDouble();
    in.nextLine();
        
        price=notebooks*notebookprice;
        if(career.equalsIgnoreCase("doctor")){
            tax = 1.1;
        }else if(career.equalsIgnoreCase("student")){
                tax = 1;
            }else{
                tax = 1.06;
            }
        
        total = (tax*price);
        System.out.printf("Your total is " + "$%.2f", total);
    }
}