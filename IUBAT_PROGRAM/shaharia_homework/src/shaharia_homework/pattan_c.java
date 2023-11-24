/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class pattan_c {
      public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) {

            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    
