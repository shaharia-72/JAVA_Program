package homework;

public class cel02 {
    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit | Fahrenheit  Celsius");
    for(int c =0; c<=100; c +=2)
        {
        for(int f = 20; f<=270;f+=5)
            {
                double fah = (c * 9.0 / 5.0) + 32.0;
                double cel = (f - 32.0) * 5.0 / 9.0;
                System.out.printf("%-7d  %-10.3f | %-11d %-6.3f%n", c, fah, f, cel);
            }

        }
    }
    
}
