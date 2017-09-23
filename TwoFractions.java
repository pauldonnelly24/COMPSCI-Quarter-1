/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author paul.donnelly
 */
public class TwoFractions {
public static void main(String[] args) {
int a, b, c, d, addNumerator, commonDenominator, newNum1, newNum2;
Scanner in = new Scanner(System.in);
System.out.println("Enter the first numerator");
a = in.nextInt();

System.out.println("Enter second numerator");
c = in.nextInt();

System.out.println("Enter first denominator");
b = in.nextInt();

System.out.println("Enter second denominator");
d = in.nextInt();

newNum1 = a * d;
newNum2 = c * b;

addNumerator = newNum1 + newNum2;

commonDenominator = b * d;

System.out.println(addNumerator + "/" + commonDenominator);
}    
}