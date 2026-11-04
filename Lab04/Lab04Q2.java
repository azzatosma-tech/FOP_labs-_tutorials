package Lab04;

import java.util.Scanner;

public class Lab04Q2 {
    /*
    Write a program that accepts an integer n from user and then sum the following
series.
1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
        */
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();

        int sum = 0;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            total += sum;
        }

        System.out.println("Sum of the series: " + total);

        sc.close();
    }
}

