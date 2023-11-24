/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class prime_numbers {
     public static void main(String[] args) {
         
        int count = 0;

        for (int number = 2; number <= 1200; number++) {
            if (isprime(number)) {
                System.out.printf("%-5d", number);
                count++;

                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isprime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
