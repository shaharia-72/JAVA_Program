/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author shaha
 */
public class leapyear {
    public static void main(String[] args) {

        int i = 1;
        for (int year = 2014; year <= 2114; year++) {

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.print(year + " ");
                if (i % 10 == 0) {
                    System.out.println();
                }
                i++;
            }

        }
    }
    
}
