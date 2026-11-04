package Lab04;
//Write a program that generates a non-negative random integer. Display the number of digits in the integer.

import java.util.Random;

public class Lab04Q6 {
    public static void main(String[] args) {

        Random rand = new Random();

        int number = rand.nextInt(Integer.MAX_VALUE);

        int temp = number;
        int digits = 0;

        do {
            digits++;
            temp = temp / 10;
        } while (temp > 0);

        System.out.println("Random number: " + number);
        System.out.println("Number of digits: " + digits);
    }
}

