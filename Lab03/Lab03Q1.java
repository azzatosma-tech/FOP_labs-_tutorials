package Lab03;
import java.util.Scanner;

public class Lab03Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter the operand: ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 +
                        " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " - " + num2 +
                        " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 +
                        " = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 +
                            " = " + ((double) num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    System.out.println(num1 + " % " + num2 +
                            " = " + (num1 % num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}
