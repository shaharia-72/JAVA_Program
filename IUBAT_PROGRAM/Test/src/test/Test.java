/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;

/**
 *
 * @author shaha
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 int number1 = (int)(Math.random() * 10);
 int number2 = (int)(Math.random() * 10);

// Create a Scanner
 Scanner input = new Scanner(System.in);

 System.out.print(
 "What is " + number1 + " + " + number2 + "? ");
 int answer = input.nextInt();

 while (number1 + number2 != answer) {
 System.out.print("Wrong answer. Try again. What is "
 + number1 + " + " + number2 + "? ");
 answer = input.nextInt();
 }

 System.out.println("You got it!");
 }
    }
    
}
