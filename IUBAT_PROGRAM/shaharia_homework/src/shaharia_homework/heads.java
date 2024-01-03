package shaharia_homework;

public class heads {
    public static void main(String[] args) {
        int flips = 2000000;
        int head = 0;
        int tails = 0;

        for (int i = 0; i < flips; i++) {
            int coin = Math.random() < 0.5 ? 0 : 1;

            if (coin == 0) {
                tails++;
            } else {
                head++;
            }
        }

        System.out.println("Number of heads: " + head);
        System.out.println("Number of tails: " + tails);
    }
}
