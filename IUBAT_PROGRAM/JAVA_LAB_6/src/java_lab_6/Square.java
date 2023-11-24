/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab_6;

/**
 *
 * @author shaha
 */
public class Square {
    public static int findSquare(int number) {
        return number * number;
    }
    public static double findSquare(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        int integerNumber = 5;
        int squareInt = findSquare(integerNumber);
        System.out.println("Square of " + integerNumber + " is " + squareInt);
    }
    
}
