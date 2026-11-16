package Lab05;
import java.util.Scanner;
import java.util.Random;
public class lab05Q3 {
    // Question 3 – Employee Working Hours (7 Days)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of employees: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of employees.");
            input.close();
            return;
        }

        int[][] hours = new int[n][7];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                hours[i][j] = rand.nextInt(8) + 1;
            }
        }

        System.out.println("Employee Working Hours:");

        for (int i = 0; i < n; i++) {
            int total = 0;

            System.out.print("Employee " + (i + 1) + ": ");

            for (int j = 0; j < 7; j++) {
                System.out.print(hours[i][j] + " ");
                total += hours[i][j];
            }

            System.out.println("| Total Hours: " + total);
        }

        input.close();
    }
}

