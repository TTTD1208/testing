import java.util.Scanner;

public class EIUCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        int onl = sc.nextInt();
        int vip = sc.nextInt();
        int superCard = sc.nextInt();
        double discount = 0;
        double[] money = new double[] {
                5_000_000, 20_000_000, 100_000_000, 300_000_000, 600_000_000, 900_000_000, Long.MAX_VALUE
        };
        double[] discountRate = new double[] {
                0.03, 0.05, 0.07, 0.1, 0.12, 0.15
        };
        
        for (int i = 0; i < discountRate.length; i++) {
            if (total > money[i]) {
                if (total > money[i + 1])
                        discount += (money[i + 1] - money[i]) * (discountRate[i]);
                    else
                        discount += (total - money[i]) * (discountRate[i]);
            }
        }
        long currentPrice = (long) (total - discount);
        if (onl == 1) {
            currentPrice = (long) (currentPrice * 0.98);
        }
        if (vip == 1) {
            currentPrice = (long) (currentPrice * 0.98);
        }
        if (superCard == 1) {
            currentPrice = (long) (currentPrice * 0.98);
        }
        System.out.println( (currentPrice));
        sc.close();
    }
}
