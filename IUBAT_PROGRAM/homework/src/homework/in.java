package homework;

public class in {
    public static void main(String[] args) {
        System.out.println("Inches"+"  "+"Centimeters");
        
        for (int i = 1; i <= 10; i++) {
            double centimeters = i * 2.54;
            System.out.printf("%d"+  "          "+"%.2f%n", i, centimeters);
        }
    }
    
}
