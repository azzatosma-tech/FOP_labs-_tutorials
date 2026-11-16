package Lab05;


    // WIX1002 – Tutorial 5: Arrays (Java)
    // Question : Student score
    /*
    WIX1002 Fundamentals of Programming
Lab 5: Arrays

1. Write a program to randomly generate N student scores (0-100). The program will prompt the user to enter N students and store the score in an array. Then, the program will display a list of score, the highest score, the lowest score and the average score.
     */


import java.util.Scanner;
import java.util.Random;

public class lab05Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of students.");
            input.close();
            return;
        }

        int[] scores = new int[n];
        int highest = 0;
        int lowest = 100;
        int sum = 0;

        System.out.println("Student Scores:");

        for (int i = 0; i < n; i++) {
            scores[i] = rand.nextInt(101);
            System.out.println("Student " + (i + 1) + ": " + scores[i]);

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }

            sum += scores[i];
        }

        double average = (double) sum / n;

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.printf("Average Score: %.2f%n", average);

        input.close();
    }
}


