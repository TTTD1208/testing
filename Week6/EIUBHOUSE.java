import java.util.Scanner;

public class EIUBHOUSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        double lai = sc.nextDouble();
        long soTienCanPhaiTraLai = n - m;
        if (soTienCanPhaiTraLai <= 0) {
            return;
        }
        double soTienCanThanhToanMoiThang = (double) soTienCanPhaiTraLai / k;
        for (int i = 0; i < k; i++) {
            //tính dư nợ tháng thứ i
            double duNo = soTienCanPhaiTraLai - (soTienCanThanhToanMoiThang * (i));
            //tính lãi của tháng thứ i
            double tienLai = duNo * (lai/100);
            //tính tổng tiền cần thanh toán
            double tongThanhToan = soTienCanThanhToanMoiThang + tienLai;
            long result = Math.round(tongThanhToan);
            System.out.println((i+1) + " " + result);
        }
        sc.close();
    }
}