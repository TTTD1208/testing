import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double N = sc.nextDouble();
            double L = sc.nextDouble();
            double M = sc.nextDouble();
            double years = Math.floor(Math.log(M / N) / Math.log(1 + L / 100));
            System.out.println(Math.round(years + 1));
        }
        sc.close();
    }
}
