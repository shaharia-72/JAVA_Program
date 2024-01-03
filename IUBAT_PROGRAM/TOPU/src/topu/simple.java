package lab7;

public class simple {


    public static void main(String[] args) {
         try {
            int data = 50 / 0;
            System.out.println("Rest Of the code");
        } catch (ArithmeticException e) {

            System.out.println(e);
        }
    }

}
