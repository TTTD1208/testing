import java.util.Scanner;

public class EIBANKFEE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] phiHangThang = { 12.00, 7.5, 5.00, 0.0 };
        double[] phiMoiCheck = { 0.20, 0.20, 0.10, 0.0 };
        double[] mucTien = { 500, 2000, 5000, Long.MAX_VALUE };
        int n = sc.nextInt();
        double tongSoTamSec = 0.0;
        double tongPhi = 0.0;
        for (int k = 0; k < n; k++) {
            double soTien = sc.nextDouble();
            double soTamSec = sc.nextDouble();
            tongSoTamSec += soTamSec;
            for (int i = 0; i < mucTien.length; i++) {
                if (soTien < mucTien[i]) {
                    double phiThang = phiHangThang[i];
                    double phiCheck = phiMoiCheck[i] * soTamSec;
                    tongPhi += phiThang + phiCheck;
                    break;
                }
            }
        }
        System.out.println(tongPhi / tongSoTamSec);
    }
}
