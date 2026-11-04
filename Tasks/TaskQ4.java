// #task q4: change month to nov and calendar format to start from Monday

package Lab04;

import java.util.Scanner;

public class Lab04Q1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int dayUntilMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
            int dayUntilAug = dayUntilMay + 31 + 30 + 31;

            int firstDayOfMay = (firstDayOfYear + dayUntilMay) % 7;
            int firstDayOfAug = (firstDayOfYear + dayUntilAug) % 7;

            printCalendar("May", 31, firstDayOfMay);
            printCalendar("August", 31, firstDayOfAug);
        }
    }

    private static void printCalendar(String monthName, int totalDays, int firstDay) {
        String columnFormat = "%4s";
        String headerFormat = "%4s%4s%4s%4s%4s%4s%4s%n";

        System.out.println();
        System.out.println(monthName);
        System.out.printf(headerFormat, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.printf(columnFormat, "");
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf(columnFormat, day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        // TaskQ4

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the year: ");
            int year = sc.nextInt();

            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // Check whether the year is a leap year
            boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);

            // Days from January 1 to October 31
            int daysUntilNov = 31 + (isLeapYear ? 29 : 28)
                    + 31 + 30 + 31 + 30 + 31
                    + 31 + 30 + 31;

            // Convert Sunday-first (0=Sun) to Monday-first (0=Mon)
            int firstDayOfNov =
                (firstDayOfYear + daysUntilNov + 6) % 7;

            // Print November calendar
            printCalendar("November", 30, firstDayOfNov);
        }
    }

    private static void printCalendar(
            String monthName, int totalDays, int firstDay) {

        String columnFormat = "%4s";

        System.out.println();
        System.out.println(monthName);

        // Calendar starts on Monday
        System.out.printf("%4s%4s%4s%4s%4s%4s%4s%n",
                "Mon", "Tue", "Wed", "Thu",
                "Fri", "Sat", "Sun");

        // Print empty spaces before November 1
        for (int i = 0; i < firstDay; i++) {
            System.out.printf(columnFormat, "");
        }

        // Print days of November
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf(columnFormat, day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}

