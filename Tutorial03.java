
import java.util.Scanner;

public class Tutorial03 {

    public static void main(String[] args) {

        // Create only ONE Scanner for the entire program
        Scanner input = new Scanner(System.in);

        // ==========================================
        // QUESTION 01
        // ==========================================

        // (a) Determine whether 3 x 8 = 27

        int myNum1 = 8;
        int myNum2 = 3;

        if (myNum1 * myNum2 == 27) {
            System.out.println("The calculation is correct");
        } else {
            System.out.println("The calculation is wrong");
        }

        // (b) Determine whether an integer is odd or even

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // (c) Determine whether a character is capital

        System.out.print("Enter a character: ");
        char letter = input.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Capital letter");
        } else {
            System.out.println("Not a capital letter");
        }

        // (d) Display two strings alphabetically,
        // ignoring their case

        input.nextLine(); // Clear remaining newline

        System.out.print("Enter first string: ");
        String first = input.nextLine();

        System.out.print("Enter second string: ");
        String second = input.nextLine();

        if (first.compareToIgnoreCase(second) <= 0) {
            System.out.println(first);
            System.out.println(second);
        } else {
            System.out.println(second);
            System.out.println(first);
        }

        // (e) Display a day based on a number from 0 to 6

        System.out.print("Enter a number (0-6): ");
        int day = input.nextInt();

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }

        // ==========================================
        // QUESTION 02 - Correct the errors
        // ==========================================

        // (a) Compare two numbers

        int num1 = 3;
        int num2 = 3;

        if (num1 == num2) {
            System.out.println(
                "Number 1 is equal to number 2."
            );
        }

        // (b) Check if x is the largest number

        int x = 1;
        int y = 2;
        int z = 3;

        if (x > y && x > z) {
            System.out.println("x is the largest number");
        }

        // (c) Compare two strings

        String s1 = "Hello";
        String s2 = "Hello";

        if (s1.equals(s2)) {
            System.out.println("They are equal strings.");
        } else {
            System.out.println("They are not equal strings.");
        }

        // (d) Check if either x or y is positive

        if (x > 0 || y > 0) {
            System.out.println("Either x or y is positive");
        }

        // ==========================================
        // QUESTION 03 - Nested if statements
        // ==========================================

        // (a)

        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
            }
        }

        System.out.println("$$$$$");

        // (b)

        if (x < 10) {
            if (y < 10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }

        // (c)

        if (x < 10) {
            if (y < 10) {
                System.out.println("*****");
            }

            System.out.println("#####");
        } else {
            System.out.println("$$$$$");
        }

        // (d)

        if (x > 10) {
            if (y > 10) {
                System.out.println("*****");
                System.out.println("#####");
            } else {
                System.out.println("$$$$$");
            }
        }

        // ==========================================
        // QUESTION 04 - Find the largest number
        // ==========================================

        System.out.print("Enter first number: ");
        int xx = input.nextInt();

        System.out.print("Enter second number: ");
        int yy = input.nextInt();

        System.out.print("Enter third number: ");
        int zz = input.nextInt();

        if (xx >= yy && xx >= zz) {
            System.out.println("Biggest number: " + xx);
        } else if (yy >= xx && yy >= zz) {
            System.out.println("Biggest number: " + yy);
        } else {
            System.out.println("Biggest number: " + zz);
        }

        // Close Scanner only at the end
        input.close();
    }
}
