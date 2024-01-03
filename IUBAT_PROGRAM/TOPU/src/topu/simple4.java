package lab7;

public class simple4 {
    public static void main(String args[]) {
        int LIMIT = 2;
        try {
            int a[] = new int[5];
//            a[5] = 50 / LIMIT;
            a[4] = 50 / LIMIT;
        } catch (ArithmeticException e) {
            System.out.println("Task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task2 is completed");
        } catch (Exception e) {
            System.out.println("Common Task Completed");
        } finally {
            System.out.println("Rest Of the code");
        }
    }
    
}
