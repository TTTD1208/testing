import java.util.Scanner;

public class SALARY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfEmployees = sc.nextInt();
        double[] workingHours = new double[5];
        double[] salaries = new double[numOfEmployees];
        double totalPartTimeSalary = 0;
        double totalOfficeTimeSalary = 0;
        double countPartTime = 0;
        double countFullTime = 0;
        double totalSalary = 0;
        double averagePartTimeSalary = 0;
        double averageOfficeTimeSalary = 0;
        for (int i = 0; i < numOfEmployees; i++) {
            double partTimeSalary = 0;
            double officeTimeSalary = 0;
            for (int j = 0; j < workingHours.length; j++) {
                workingHours[j] = sc.nextDouble();
            }
            double hourlyWage = sc.nextDouble();
            for (int j = 0; j < workingHours.length; j++) {
                if (workingHours[j] > 8) {
                    partTimeSalary += (workingHours[j] - 8) * hourlyWage * 1.5;
                    officeTimeSalary += 8 * hourlyWage;
                    countPartTime += workingHours[j] - 8;
                    countFullTime += 8;

                } else {
                    officeTimeSalary += workingHours[j] * hourlyWage;
                    countFullTime += workingHours[j];

                }
            }
            totalOfficeTimeSalary += officeTimeSalary;
            totalPartTimeSalary += partTimeSalary;
            totalSalary = officeTimeSalary + partTimeSalary;
            salaries[i] = totalSalary;
        }
        if (countPartTime > 0) {
            averagePartTimeSalary = Math.round((totalPartTimeSalary / countPartTime)*100.0)/100.0;
        }
        if (countFullTime > 0) {
            averageOfficeTimeSalary = Math.round((totalOfficeTimeSalary / countFullTime)*100.0)/100.0;
        }
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }
        System.out.println(averageOfficeTimeSalary);
        System.out.println(averagePartTimeSalary);
        sc.close();
        
    }
}
