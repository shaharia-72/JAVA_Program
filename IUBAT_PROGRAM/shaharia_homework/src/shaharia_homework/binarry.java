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

public class binarry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = dec_to_bina(decimal);
        
        System.out.println("Binary: " + binary);
    }

    public static String dec_to_bina(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binaryBuilder = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryBuilder.insert(0, remainder); 
            decimal /= 2;
        }

        return binaryBuilder.toString();
    }
}
