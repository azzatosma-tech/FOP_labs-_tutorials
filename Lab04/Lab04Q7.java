package Lab04;
    
import java.util.Scanner;

public class Lab04Q7 {
/*
Write a program that used to calculate mortgage loan. The program will create the
amortization table with equal total payment plan. The following are the formula and
the sample output.

 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter loan duration in years: ");
        int years = sc.nextInt();

        if (principal <= 0 || annualRate < 0 || years <= 0) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        // Calculate monthly interest rate
        double monthlyRate = annualRate / (12 * 100);

        // Total number of months
        int months = years * 12;

        // Calculate monthly payment
        double monthlyPayment;

        if (monthlyRate == 0) {
            monthlyPayment = principal / months;
        } else {
            monthlyPayment = principal * monthlyRate
                    / (1 - Math.pow(1 + monthlyRate, -months));
        }

        System.out.printf("\nMonthly Payment: %.2f%n",
                          monthlyPayment);

        System.out.println("\nAmortization Table");
        System.out.println(
            "Month\tPayment\tInterest\tPrincipal\tBalance"
        );

        double balance = principal;
        double totalInterest = 0;
        double totalPaid = 0;

        for (int month = 1; month <= months; month++) {

            // Calculate interest for this month
            double interest = balance * monthlyRate;

            // Calculate principal paid
            double principalPaid = monthlyPayment - interest;

            // Adjust the last payment
            double payment = monthlyPayment;

            if (principalPaid > balance) {
                principalPaid = balance;
                payment = principalPaid + interest;
            }

            // Calculate remaining loan balance
            balance = balance - principalPaid;

            totalInterest += interest;
            totalPaid += payment;

            System.out.printf(
                "%d\t%.2f\t%.2f\t\t%.2f\t\t%.2f%n",
                month, payment, interest, principalPaid, balance
            );
        }

        System.out.printf("\nTotal Interest: %.2f%n",
                          totalInterest);

        System.out.printf("Total Payment: %.2f%n",
                          totalPaid);

        sc.close();
    }
}


