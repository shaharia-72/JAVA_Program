/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class divisible_by_3_and_4 {
      public static void main(String[] args) {
        int count = 0;
        
        for (int number = 100; number <= 1000; number++) {
            if (number % 3 == 0 && number % 4 == 0) {
                System.out.print(number + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
