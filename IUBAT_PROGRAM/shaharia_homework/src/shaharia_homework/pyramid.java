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
public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number between 1 and 15: ");
        int num = scanner.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = num; j >= i; j--) {
                    System.out.print(j + " ");
                }

                for (int j = i + 1; j <= num; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
                   scanner.close();
        }

 
    }

