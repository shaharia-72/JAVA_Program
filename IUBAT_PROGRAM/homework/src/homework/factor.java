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
public class factor {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("factors of " + number + " are: ");

        int factor = 2;

        while (number > 1) {
            if (number % factor == 0) {
                System.out.print(factor);
                number = number / factor;
                
            } else {
                factor++;
            }
            System.out.print(" ");
        }
        input.close();
    }
    
}
