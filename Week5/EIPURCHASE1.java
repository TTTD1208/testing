import java.util.Scanner;

public class EIPURCHASE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long v = sc.nextLong();
        int t = sc.nextInt();
        long n = sc.nextLong();
        long m = sc.nextLong();
        double result = findRate(v, n, m, t);
        //result = Math.round(result*1000)/1000;
        double round = (double)Math.round(result*1000)/1000;
        System.out.println(round);

    }

    public static double findRate(double productValue, double downPayment, double monthlyPayment, int months) {
        double loanAmount = productValue - downPayment;
        double low = 0.0, high = 1.0;

        while (high - low > 1e-9) {
            double mid = (low + high) / 2.0;
            double R = 1.0 + mid;

            double remaining = loanAmount * Math.pow(R, months) -
                    monthlyPayment * (Math.pow(R, months) - 1) / (R - 1);

            if (remaining > 0)
                high = mid;
            else
                low = mid;
        }

        return (low + high) / 2.0;

    }
}
