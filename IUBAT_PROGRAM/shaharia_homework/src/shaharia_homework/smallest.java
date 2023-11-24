/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class smallest {
    public static void main(String[] args) {
        int n = 1;

        while (n * n * n <= 12000) {
            n++;
        }

        System.out.println("The smallest integer n is: " + n);
    }
    
}
