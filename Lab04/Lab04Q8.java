package Lab04;

import java.util.Random;

    public class Lab04Q8 {
    public static void main(String[] args) {

        Random rand = new Random();

        // Generate a random number between 0 and 10
        int n = rand.nextInt(11);

        System.out.println("Random number n: " + n);
        System.out.println("First " + n + " prime numbers:");

        int count = 0;
        int number = 2;

        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i <= number / i; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

        System.out.println();
    }
}
