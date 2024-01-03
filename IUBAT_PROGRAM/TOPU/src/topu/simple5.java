package lab7;

public class simple5 {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Valid");
        else
            System.out.println("Welcome to vote...");
    }

    public static void main(String args[]) {
//        validate(13);
        validate(20);
        System.out.println("Rest of the code...");
    }
    
}
