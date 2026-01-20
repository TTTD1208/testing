import java.util.Scanner;

public class EIUMARKUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long products = sc.nextLong();
        long cost = 200;
        long pay = 0;
        while (products != 0) {
            if (cost > 180) {
                long productsWithCurrentCost = Math.min(products, 100);
                pay += productsWithCurrentCost * cost;
                products -= productsWithCurrentCost;
                cost -= 1;
            } else {
                pay += products * cost;
                products = 0;
            }
        }
        System.out.println(pay);
        sc.close();
    }

}
