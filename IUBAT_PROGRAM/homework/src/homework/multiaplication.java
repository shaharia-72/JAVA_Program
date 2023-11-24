/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author shaha
 */
import java.util.Scanner;
public class multiaplication {
         public static void main(String[] args) {
        final int rendom_number = 10;               // make change (rendom_number)
        int correct_count = 0;// make change (correct_number)
        int count = 0; 
        long start_time = System.currentTimeMillis(); // make change (start_time)
        
        Scanner input = new Scanner(System.in);

        while (count < rendom_number) {

            int number1 = (int)(Math.random() * 12);
            int number2 = (int)(Math.random() * 12);


            System.out.print("What is " + number1 + " * " + number2 + "? \n"); // make change (print style)
            int answer = input.nextInt();


            if (number1 * number2 == answer) {
                System.out.println("correct!\n"); // make change (print style)
                correct_count++;
            } else {
                System.out.println("wrong.");
                System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2)+"\n"); // make change (print style)
            }


            count++;
        }

        long end_time = System.currentTimeMillis();
        long test_time = end_time - start_time;

        System.out.println("total number is " + count); // make change (don't use this)
        System.out.println("Correct count is " + correct_count);
        System.out.println("Test time is " + test_time / 1000 + " seconds"); // make change (in minuites )
    }
    
}
