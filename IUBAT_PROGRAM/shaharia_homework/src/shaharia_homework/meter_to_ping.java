package shaharia_homework;

public class meter_to_ping {
     public static void main(String[] args) {
        System.out.println("Ping Square meter | Square meter Ping");
        for (int ping = 10; ping <= 100; ping += 5) {
            double square_meter = ping * 3.305;
            double convert_ping = square_meter / 3.305;
            System.out.printf("%-4d %-14.3f | %-4.0f %-11.3f%n", ping, square_meter, convert_ping, square_meter);
        }
    }
}
