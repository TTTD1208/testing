import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaryAfterTax = new double[] {
                0, 4_750_000, 9_250_000, 16_050_000, 27_250_000, 42_250_000, 61_850_000
        };
        double[] taxRates = new double[] {
                0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35
        };
        double gross = 0;
        long n = sc.nextLong();
        double net = n - 11000000;
        if (net <= 0) {
            System.out.println(n);
            return;
        }
        for (int i = taxRates.length - 1; i >= 0; i--) {
            if (net  > salaryAfterTax[i]) {
                gross += (net - salaryAfterTax[i]) / (1 - taxRates[i]);
                net = salaryAfterTax[i];

            }
        }
        System.out.println(Math.round(gross + 11000000));
    }
}
