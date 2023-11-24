/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaha_lab_07;

import java.util.Scanner;

/**
 *
 * @author shaha
 */
public class shaha_test2 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean wrong_input = false;

        while (!wrong_input) {
            try {
                System.out.print("enter an integer between 1 and 12: ");
                input = scanner.nextInt();
                if (input >= 1 && input <= 12) {
                    wrong_input = true;
                } else {
                    System.out.println("Wrong number. Please enter a valid number between 1 to 12: ");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number: ");
                scanner.nextLine();
            }
        }

        String month = months[input - 1];
        int day = dom[input - 1];
        System.out.println(month + " has " + day + " days.");
    }
}
