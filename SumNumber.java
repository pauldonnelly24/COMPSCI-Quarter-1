/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author paul.donnelly
 */
public class SumNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i = in.nextInt();
        int sum = 0;
        for (int j=0;j<=i;j++){
            System.out.println(j);
            sum += j;
        }
            System.out.println("The sum of every integer less than your number plus your number: " + sum);
            
        
    }
}
