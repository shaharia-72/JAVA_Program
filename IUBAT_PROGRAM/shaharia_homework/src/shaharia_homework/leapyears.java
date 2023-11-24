/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class leapyears {
    public static void main(String[] args) {
        
        int count = 0;
        
        for (int year = 2014; year <= 2114; year++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n Number of leap years in this period: " + count);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
}
