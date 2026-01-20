import java.util.Scanner;

public class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double[] taxRates = { 0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35 };
        double[] brackets = {0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000, Long.MAX_VALUE };
        double salaryHaveToPayTax = income - 9_000_000;
        double tax = 0;
        double previousBracket = salaryHaveToPayTax;
        if (salaryHaveToPayTax > 0) {
            for (int i = 0; i < brackets.length; i++) {
                if (salaryHaveToPayTax > brackets[i]) {
                    if (salaryHaveToPayTax >= brackets[i + 1]) {
                        tax += (brackets[i + 1] - brackets[i]) * taxRates[i];
                    } else {
                        
                        previousBracket = salaryHaveToPayTax - brackets[i];
                        tax += (previousBracket) * taxRates[i];
                        break;
                    }
                }
            }

        }
        System.out.printf("%.0f\n", tax);
        sc.close();
    }
}
