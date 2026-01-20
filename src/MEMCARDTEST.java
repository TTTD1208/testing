import java.util.Scanner;

public class MEMCARDTEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double tongChi = 0;
        double totalDiscount = 0;
        for (int i = 0; i < n; i++) {
            double spent = sc.nextDouble();
            if (tongChi >= 200_000_000) {
                totalDiscount = 0.07;
            } else if (tongChi >= 50_000_000) {
                totalDiscount = 0.05;
            } else if (tongChi >= 20_000_000) {
                totalDiscount = 0.03;
            } else if (tongChi >= 1_000_000) {
                totalDiscount = 0.02;
            } else
                totalDiscount = 0;
            tongChi += spent;
            System.out.print((long)(totalDiscount * spent) + " ");
        }
        sc.close();
    }
}
