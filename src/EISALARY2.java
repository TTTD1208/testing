import java.util.Scanner;

public class EISALARY2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double avgSalaryOffice = 0;
        double avgSalaryOT = 0;
        int n = sc.nextInt();
        double[] result = new double[n];
        for (int k = 0; k < n; k++) {
            double timeOT = 0;
            double timeOffice = 0;
            double salary = 0;
            double officePart = 0;
            double otPart = 0;
            double[] workingHour = new double[5];
            for (int i = 0; i < workingHour.length; i++) {
                workingHour[i] = sc.nextDouble();
            }
            double salaryPerHour = sc.nextDouble();
            for (int i = 0; i < workingHour.length; i++) {
                if (workingHour[i] > 8) {
                    otPart = (workingHour[i] - 8) * salaryPerHour * 1.5;
                    officePart = 8 * salaryPerHour;
                    salary += otPart + officePart;
                    avgSalaryOT += salary;
                } else {
                    officePart = workingHour[i] * salaryPerHour;
                    salary += officePart;
                    avgSalaryOffice = salary;
                }
            }
            result[k] = salary;

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println((avgSalaryOffice) / n);
        System.out.println((avgSalaryOT) / n);

    }

}
