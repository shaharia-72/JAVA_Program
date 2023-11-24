/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaha_lab_07;

/**
 *
 * @author shaha
 */
public class shaha_simple4 {
    public static void main(String args[]) {
        int LIMIT = 2;
        try {
            int a[] = new int[5];
//            a[5] = 50 / LIMIT;
            a[4] = 50 / LIMIT;
        }
        catch (ArithmeticException e) {
            System.out.println("Task1 is completed");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task2 is completed");
        }
        catch (Exception e) {
            System.out.println("Common Task completed");
        }
        finally {
            System.out.println("Rest of the code");
        }
    }
}
