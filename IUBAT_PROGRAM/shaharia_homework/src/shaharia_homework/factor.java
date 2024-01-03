
package shaharia_homework;

import java.util.Scanner;
public class factor {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("The smallest factors of " + number + " are: ");

        int factor = 2;

        while (number > 1) {
            if (number % factor == 0) {
                System.out.print(factor);
                number /= factor;

                if (number > 1) {
                    System.out.print(", ");
                }
            } else {
                factor++;
            }
        }
        scanner.close();
    }
}
