package homework;

public class smallests {
    public static void main(String[] args) {
        int n = 1;

        while (n * n * n <= 12000) {
            n++;
        }

        System.out.println("The smallest integer n is: " + n); // make changes in writing 
    }
    
}
