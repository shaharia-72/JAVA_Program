/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab_6;
import java.util.Scanner;
/**
 *
 * @author shaha
 */
public class JAVA_LAB_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years (N): ");
        int years = scanner.nextInt();

        scanner.close();
        double simpleInterest = (principal * rate * years) / 100;

        System.out.println("Simple Interest (SI) = " + simpleInterest);
    }
    
}
