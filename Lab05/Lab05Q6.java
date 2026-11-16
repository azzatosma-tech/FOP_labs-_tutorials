package Lab05;

import java.util.Scanner;
public class Lab05Q6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of rows.");
            input.close();
            return;
        }

        int[][] pascal = new int[n][n];

        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            pascal[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1]
                             + pascal[i - 1][j];
            }
        }

        System.out.println("The Pascal Triangle with " + n + " row(s)");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", pascal[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
