package Lab04;
import java.util.Scanner;

public class Lab04Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the first day of the year (0-6): ");
        int firstDay = sc.nextInt();

        if (year < 1 || firstDay < 0 || firstDay > 6) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        boolean leapYear = (year % 4 == 0 && year % 100 != 0)
                           || (year % 400 == 0);

        int febDays = leapYear ? 29 : 28;

        // Days before May
        int daysBeforeMay = 31 + febDays + 31 + 30;

        // Days before August
        int daysBeforeAugust = daysBeforeMay + 31 + 30 + 31;

        int mayStart = (firstDay + daysBeforeMay) % 7;
        int augustStart = (firstDay + daysBeforeAugust) % 7;

        // Display May
        System.out.println("\n       May " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < mayStart; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);

            if ((mayStart + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        // Display August
        System.out.println("\n      August " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < augustStart; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);

            if ((augustStart + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        sc.close();
    }
}
