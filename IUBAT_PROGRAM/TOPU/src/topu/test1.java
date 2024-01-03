package lab7;

import java.util.Scanner;

public class test1 {
     public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("enter an integer between 1 and 12: ");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 12) {
                String month_name = months[input - 1];
                int days_in_month = dom[input - 1];
                System.out.println(month_name + " has " + days_in_month + " days.");
            } else {
                System.out.println("Wrong number. Please enter a valid number between 1 to 12: ");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number. Please enter a valid number between 1 to 12: ");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number: ");
        }
    }
    
}
