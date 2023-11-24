package homework;

import java.util.Scanner;
public class grestests {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = scanner.nextInt();

        int d = Math.min(n1, n2);

        int gcd = 1;

        while (d >= 1) {
            if (n1 % d == 0 && n2 % d == 0) {
                gcd = d;
                break;  
            }
            d--;
        }

        System.out.println("The GCD of: " + n1 + " and " + n2 + " is " + gcd);

        scanner.close();
    }
}
