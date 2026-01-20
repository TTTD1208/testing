import java.util.Scanner;

public class EIMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] money = new double[] { 1_000_000, 20_000_000, 50_000_000, 200_000_000 };
        double[] discount = new double[] { 0.02, 0.03, 0.05, 0.07 };
        int k = sc.nextInt();
        long[] result = new long[k];
        for (int j = 0; j < k; j++) {
            double n = sc.nextDouble();
            double totalDiscount = 0;
            for (int i = discount.length - 1; i >= 0; i--) {
                if (n >= money[i])
                    totalDiscount = n * discount[i];
                else if (n < money[0]) {
                    totalDiscount = 0;
                }
            }
            result[j]=(long)totalDiscount;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}
