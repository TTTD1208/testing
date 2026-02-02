import java.util.Scanner;

public class EIUPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long OriginPrice = sc.nextLong();
        long prePay = sc.nextLong();
        int monthly = sc.nextInt();
        double interst = sc.nextDouble();
        long moneyNeedToPay = OriginPrice - prePay;
        double preFinal = (moneyNeedToPay * Math.pow(1+interst, monthly))*(interst);
        double monthlyPayment = preFinal / (Math.pow(1+interst, monthly)-1);
        long result = (long)Math.floor(monthlyPayment);
        System.out.println(result);
        sc.close();
    }
}
