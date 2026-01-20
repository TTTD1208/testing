import java.util.Scanner;
import java.util.ArrayList;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of employees
        // Using hasNext to prevent errors if input format varies slightly
        if (!scanner.hasNext()) return;
        int n = 0;
        try {
            n = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            // Fallback if the first line isn't just a clean integer
            if(scanner.hasNextInt()) n = scanner.nextInt();
        }

        // storage for outputs
        ArrayList<Double> employeeSalaries = new ArrayList<>();
        
        double totalOfficePay = 0;
        double totalOfficeHours = 0;
        double totalOvertimePay = 0;
        double totalOvertimeHours = 0;

        for (int i = 0; i < n; i++) {
            // We assume the input line contains 6 doubles: 
            // Hour1, Hour2, Hour3, Hour4, Hour5, HourlyWage
            
            double[] dailyHours = new double[5];
            for(int d = 0; d < 5; d++) {
                dailyHours[d] = scanner.nextDouble();
            }
            double hourlyWage = scanner.nextDouble();

            double currentEmpSalary = 0;

            for (double hours : dailyHours) {
                double officeHours = 0;
                double overtimeHours = 0;

                if (hours > 8) {
                    officeHours = 8;
                    overtimeHours = hours - 8;
                } else {
                    officeHours = hours;
                    overtimeHours = 0;
                }

                // Calculate pay components
                double officePay = officeHours * hourlyWage;
                double overtimePay = overtimeHours * hourlyWage * 1.5;

                // Add to current employee total
                currentEmpSalary += (officePay + overtimePay);

                // Add to global totals for averages
                totalOfficePay += officePay;
                totalOfficeHours += officeHours;
                
                totalOvertimePay += overtimePay;
                totalOvertimeHours += overtimeHours;
            }
            
            employeeSalaries.add(currentEmpSalary);
        }

        // Output 1: Wages of n people
        for (Double salary : employeeSalaries) {
            System.out.printf("%.2f%n", salary);
        }

        // Output 2: Average salary per office hour
        // Formula: Total Money Paid for Office Hours / Total Office Hours Worked
        double avgOfficeRate = (totalOfficeHours == 0) ? 0 : (totalOfficePay / totalOfficeHours);
        System.out.printf("%.2f%n", avgOfficeRate);

        // Output 3: Average salary per hour overtime
        // Formula: Total Money Paid for OT / Total OT Hours Worked
        double avgOvertimeRate = (totalOvertimeHours == 0) ? 0 : (totalOvertimePay / totalOvertimeHours);
        System.out.printf("%.2f%n", avgOvertimeRate);
        
        scanner.close();
    }
}