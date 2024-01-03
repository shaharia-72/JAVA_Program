
package shaharia_homework;

import java.util.Scanner;

public class each_month {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstday = 1;

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int[] days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("\n First days of each month in " + 2013 + ":");
        
        for (int month = 0; month < 12; month++) {
            System.out.println(monthName(month) + " 1, " + 2013 + " is " + week[firstday]);
            
            firstday = (firstday + days_in_month[month]) % 7;
        }

        scanner.close();
    }

    public static String monthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August",
                               "September", "October", "November", "December"};
        return monthNames[month];
    }
}
