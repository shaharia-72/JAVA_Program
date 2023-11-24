/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class pyramid_pattan {
     public static void main(String[] args) {
         
        int num=(int) Math.pow(3, 7 - 1);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7 - i - 1; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j <= i; j++) {
                int number = (int) Math.pow(3, j);
                System.out.printf("%-3d", number);
            }

            for (int j = i - 1; j >= 0; j--) {
                int number = (int) Math.pow(3, j);
                System.out.printf("%-3d", number);
            }

            System.out.println();
        }
    }
    
}
