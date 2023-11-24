package homework;

public class metertoping {
     public static void main(String[] args) {
        System.out.println("Ping Square meter | Square meter Ping");
        for (int i = 10; i <= 100; i += 5) {
            double sqmeter = i * 3.305;
            double ping = sqmeter / 3.305;
            System.out.printf("%d %.3f |"+"        "+" %.0f %.3f%n", i, sqmeter, ping, sqmeter);
        }
    }
    
}
