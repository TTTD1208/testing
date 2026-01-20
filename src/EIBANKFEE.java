import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soTien = sc.nextDouble();
        double soTamSec = sc.nextDouble();
        double[] phiHangThang = {12.00, 7.5, 5.00, 0.0};
        double[] phiMoiCheck = {0.20, 0.20, 0.10, 0.0};
        double[] mucTien = {500, 2000, 5000, Long.MAX_VALUE};
        for (int i = 0; i < mucTien.length; i++) {
            if (soTien < mucTien[i]) {
                double phiThang = phiHangThang[i];
                double phiCheck = phiMoiCheck[i] * soTamSec;
                System.out.printf("%.2f\n", phiThang + phiCheck);
                break;
            }
        }
        sc.close();
    }
}
