/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjproject;
import java.util.Scanner;
/**
 *
 * @author paul.donnelly
 */
public class Table {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer less than 20.");
        double i = in.nextInt();
        double square = 0, cube = 0;
        if (i>20){
            System.out.println("LESS THAN 20");
            i--;
        }else{
        for (double j = 1; j<i; j++){
            square = Math.sqrt(j);
        }
    }}
}
