/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author shaha
 */
public class errors {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1000000; i >= 1; i--) {
            sum += 1.0 / i;
        }
        System.out.println("Sum from right to left: " + sum);
    }
    
}
