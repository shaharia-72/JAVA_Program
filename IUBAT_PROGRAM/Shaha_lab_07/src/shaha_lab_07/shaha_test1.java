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
public class shaha_test1 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("select number from 1,2,3,4,....,12 as month : ");
            int input = scanner.nextInt();
            
            if (input >= 1 && input <= 12) {
                String monts = months[input - 1];
                int days = dom[input - 1];
                System.out.println(monts + " has " + days + " days.");
            } 
            else {
                System.out.println("Wrong selection. Please enter a valid number: ");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong selection. Please enter a valid number: ");
            } 
        catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number: ");
        }
    } 
}
