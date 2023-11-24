/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author shaha
 */
public class sum {
     public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 1; i <= 97; i += 2) {
            double term = (double) i / (i + 2);
            sum += term;
            System.out.printf("%d/%d + ", i, i + 2);
        }

        System.out.printf("%d/%d\n = %.2f\n", 95, 97, sum + 95.0 / 97.0);
    }
}
