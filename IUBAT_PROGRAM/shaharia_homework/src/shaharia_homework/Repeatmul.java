package shaharia_homework;

import java.util.Scanner;
public class Repeatmul {
     public static void main(String[] args) {
        final int rendom_number = 10;
        int correct_count = 0;
        int count = 0;
        long start_time = System.currentTimeMillis();
        
        Scanner input = new Scanner(System.in);

        while (count < rendom_number) {

            int number1 = (int)(Math.random() * 12);
            int number2 = (int)(Math.random() * 12);


            System.out.print("What is " + number1 + " * " + number2 + "? \n");
            int answer = input.nextInt();


            if (number1 * number2 == answer) {
                System.out.println("correct!\n");
                correct_count++;
            } else {
                System.out.println("wrong.");
                System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2)+"\n");
            }


            count++;
        }

        long end_time = System.currentTimeMillis();
        long test_time = end_time - start_time;

        System.out.println("total number is " + count);
        System.out.println("Correct count is " + correct_count);
        System.out.println("Test time is " + test_time / 1000 + " seconds");
    }
    
}
