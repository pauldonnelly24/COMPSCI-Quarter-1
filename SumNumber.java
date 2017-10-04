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
        int j = 1;
        for (j=1;j<=i;j++){
            if (i>=j){
                System.out.println(j);
            }
          
        }
        int Sum  =i + j;
        System.out.println("The sum of every integer less than your number plus your number: " + Sum);
    }
}
