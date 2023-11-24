/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class cancellation_errors {
     public static void main(String[] args) {
        int n = 1000000;
        double sum = 0.0;

        for (int i = n; i >= 1; i--) {
            sum += 1.0 / i;
        }

        System.out.println("Sum: " + sum);
    }
}
