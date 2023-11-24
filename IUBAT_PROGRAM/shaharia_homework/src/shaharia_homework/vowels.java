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

public class vowels {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        input = input.toUpperCase();

        int vow_count = 0;
        int con_count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vow_count++;
                } else {
                    con_count++;
                }
            }
        }

        System.out.println("Number of vowels: " + vow_count);
        System.out.println("Number of consonants: " + con_count);
    }
    
}
