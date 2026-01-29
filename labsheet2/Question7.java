import java.util.Scanner;
public class Question7 {
    final double deductionRate = 0.08;
    int grossSalary(int hours, int hourlyRate){
        int grossSalary = hours * hourlyRate;
        return grossSalary;

    }

    double deduction(int grossSalary){
        return grossSalary* deductionRate;
    }
    
    public static void main(String[] args) {
        Question7 q7 = new Question7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter the Hourly Rate:");
        int hourlyRate = sc.nextInt();
        int grossPay = q7.grossSalary(hours, hourlyRate);
        System.out.println("The Gross Salary is: " + grossPay);
        double deductionAmount = q7.deduction(grossPay);
        System.out.println("The Deduction amount is: " + deductionAmount);
        double netSalary = grossPay - deductionAmount;
        System.out.println("The Net Salary is: " + netSalary);
    }
}
