package homework;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year (e.g., 2013): ");
        int year = scanner.nextInt();
        
        System.out.print("Enter the first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday): ");
        int firstDay = scanner.nextInt();

        String[] weekname = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("\n First days of each month in " + year + ":");

        for (int month = 0; month < 12; month++) {
            System.out.println(monthname(month) + " 1, " + year + " is " + weekname[firstDay]);
            
            int daysinmonth = daysInMonth(year, month);
            firstDay = (firstDay + daysinmonth) % 7;
        }

        scanner.close();
    }

    public static String monthname(int month) {
        String[] monthnames = {"January", "February", "March", "April", "May", "June", "July", "August",
                               "September", "October", "November", "December"};
        return monthnames[month];
    }

    public static int daysInMonth(int year, int month) {
        int[] daysinmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 1 && isleapyear(year)) {
            return 29;
        }
        return daysinmonth[month];
    }

    public static boolean isleapyear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
}
