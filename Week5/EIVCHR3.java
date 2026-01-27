
import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matHang = sc.nextInt();
        int soVChrs = sc.nextInt();
        long[] giaTri = new long[matHang];
        for (int i = 0; i < matHang; i++) {
            giaTri[i] = sc.nextLong();
        }
        int maxDiscounts = 50000;
        Arrays.sort(giaTri);
        for (int i = 1; i <= soVChrs && i <= matHang; i++) {
            long totalDiscount = (long) (giaTri[matHang - i] * 0.3);
            if (totalDiscount > maxDiscounts) {
                giaTri[matHang - i] = giaTri[matHang - i] - maxDiscounts;
            } else {
                giaTri[matHang - i] = giaTri[matHang - i] - totalDiscount;
            }
        }

        long finalPrice = 0;
        for (int i = 0; i < matHang; i++) {
            finalPrice += giaTri[i];
        }
        System.out.print(finalPrice);
    }

}
