import java.util.Scanner;

public class EIGROSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double afterTax = sc.nextDouble();
            double tax = afterTax / 0.9;
            double gross = tax * 0.1;
            gross = Math.round(gross * 100.0) / 100.0;
            System.out.println(gross);
        }
        sc.close();
    }
}
