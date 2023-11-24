/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shaha_lab_07;

/**
 *
 * @author shaha
 */
public class shaha_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            System.out.println("Rest Of the code");
        } catch (ArithmeticException e) {

            System.out.println(e);
        }
    }  
}
