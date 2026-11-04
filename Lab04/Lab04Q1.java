package Lab04;

import java.util.Scanner;

public class Lab04Q1 {
    public static void main(String[] args) {
        /*Write a program that accepts an integer from user. Then, display its entire factors in
increasing order*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            scanner.close();
        }
    }
}