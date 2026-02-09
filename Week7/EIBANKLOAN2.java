import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long g = sc.nextLong();
        double r = sc.nextDouble() / 100;
        r = r / 12;
        r = r + 1;
        double remaining = 0;
        int month = 0;
        for (int i = 0; ; i++) {
            remaining = x * Math.pow((r), i) - g * (Math.pow(r, i) - 1) / (r - 1);
            if (remaining <= 0) {
                break;
            } else
                month++;
        }
        System.out.println(month);
    }
}
