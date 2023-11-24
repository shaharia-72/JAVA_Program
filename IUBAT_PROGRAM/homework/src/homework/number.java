/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author shaha
 */
public class number {
      public static void main(String[] args) {
        int count = 0;
        
        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }
    
}
