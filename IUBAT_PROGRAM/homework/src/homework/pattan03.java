package homework;

public class pattan03 {
       public static void main(String[] args) {
        int n = 6 * 2 - 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
