/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class inch_to_centimeter {
    public static void main(String[] args) {
        System.out.println("Inches  Centimeters");
        
        for (int inches = 1; inches <= 10; inches++) {
            double centimeters = inches * 2.54;
            System.out.printf("%-10d  %-15.2f%n", inches, centimeters);
        }
    }
    
}
