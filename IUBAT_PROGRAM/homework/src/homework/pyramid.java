
package homework;

public class pyramid {
     public static void main(String[] args) {

        int a = 0,b = 7;
        for (int i = 1; i <= 128; i += i) {
            for (int k = 0; k < b; k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j += j) {
                System.out.printf("%4d", (j));
            }
            for (int x = a; x > 0; x /= 2) {
                System.out.printf("%4d", (x));
            }
            a = i;
            --b;
            System.out.println();
        }
    }
}
