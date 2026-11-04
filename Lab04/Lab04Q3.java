package Lab04;
import java.util.Scanner;
public class Lab04Q3 {
    /* Write a program that calculates the minimum, maximum, average and standard
deviation (s) of the exam score in a subject. The program will accepts the score and
quit if negative score is enter. A sample output is given below */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        double sum = 0;
        double sumSquare = 0;

        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            int score = sc.nextInt();

            if (score < 0) {
                break;
            }

            count++;
            sum += score;
            sumSquare += score * score;

            if (score < min) {
                min = score;
            }

            if (score > max) {
                max = score;
            }
        }

        if (count == 0) {
            System.out.println("No scores entered.");
        } else {
            double average = sum / count;

            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f%n", average);

            if (count > 1) {
                double standardDeviation = Math.sqrt(
                    (sumSquare - (sum * sum) / count)
                    / (count - 1)
                );

                System.out.printf("Standard Deviation: %.2f%n",
                                  standardDeviation);
            } else {
                System.out.println(
                    "Standard Deviation: Undefined (only one score)"
                );
            }
        }

        sc.close();
    }
}
