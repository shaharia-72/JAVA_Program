/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */

import java.util.Scanner;

public class multiapplication {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number for the multiplication: ");
        int number = scanner.nextInt();
        
        scanner.close();

        System.out.println("Using a for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println("\nUsing a while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        System.out.println("\nUsing a do-while loop:");
        i = 1;
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }
}
