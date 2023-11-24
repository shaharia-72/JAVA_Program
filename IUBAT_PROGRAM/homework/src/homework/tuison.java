package homework;
public class tuison {
     public static void main(String[] args) {
        double tuition = 10000;
        double yearlyincrease = 0.06;
        int year_of_tuition = 4;
        double totalcost = 0;

 
        for (int i = 1; i <= 10; i++) {
            tuition += tuition * yearlyincrease;
            if (i == 1) {
                System.out.printf("Year %d tuition: $%.2f%n", i, tuition);
            } else if (i == 10) {
                System.out.printf("Year %d tuition: $%.2f%n", i, tuition);
            }
        }

        for (int i = 1; i <= year_of_tuition; i++) {
            tuition += tuition * yearlyincrease;
            totalcost += tuition;
        }

        System.out.printf("Total cost of %d years's : $%.2f%n", year_of_tuition, totalcost);
    }
}
