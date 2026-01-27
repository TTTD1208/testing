import java.util.Scanner;

public class EIUPASSBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble() / 100;
        double r2 = sc.nextDouble() / 100;
        int year = (n - m) / 12;
        int month = (n - m) % 12;
        double tienNhan = x * (1 + ((r1 * n) / 12));
        double heSoTienTra = (1 + (r2 * month / 12))*Math.pow(1+r2, year);
        double y = tienNhan / heSoTienTra;
        long opt2 = Math.round(y);
        long result = Math.max(x, opt2);
        System.out.println(result);
    }
}
