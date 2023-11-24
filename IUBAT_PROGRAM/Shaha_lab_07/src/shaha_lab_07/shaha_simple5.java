/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaha_lab_07;

/**
 *
 * @author shaha
 */
public class shaha_simple5 {
    public static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Valid");
        else
            System.out.println("Welcome to vote...");
    }

    public static void main(String args[]) {
//        validate(13);
        validate(20);
        System.out.println("Rest of the code...");
    }
}
