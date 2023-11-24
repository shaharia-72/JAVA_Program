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

public class max_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int count = 0;
        
        System.out.print("Enter integers (ending with -1): ");
        
        int num = scanner.nextInt();
        
        if (num == -1) {
            System.out.println("No numbers were entered.");
            System.exit(-1);
        }

        max = num;
        count = 1;

        while (true) {
            num = scanner.nextInt();
            
            if (num == -1) {
                break;
            }

            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }
        }

        scanner.close();

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count for " + max + " is " + count);
    }
}
