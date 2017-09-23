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
public class CoinSum {
    
public static void main(String[] args){    
    Scanner in = new Scanner(System.in);
    double quarter = .25;
    double dime = .1;
    double nickel = .05;
    double penny = .01;
    int numQ, numD, numN, numP;
    
System.out.println("Enter a dollar amount");
double input = in.nextDouble();

numQ = (int)(input / quarter);
input %= quarter;
numD = (int)(input / dime);
input %= dime;
numN = (int)(input / nickel);
input %= nickel;
numP = (int)(input / penny);

System.out.println("Quarters: " + numQ + ". Dimes: " + numD + ". Nickels: " + numN + ". Pennies: " + numP);

}
}

