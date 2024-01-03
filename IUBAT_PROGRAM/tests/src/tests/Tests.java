/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tests;
import java.util.Scanner;
/**
 *
 * @author shaha
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic static void main(String[] args) {
Scanner input = new Scanner(System.in);
int number, sum = 0, count;
for (count = 0; count < 5; count++) {
number = input.nextInt();
sum += number;
}
System.out.println("sum is " + sum);
System.out.println("count is " + count);
}
    }
    
