
public class Tutorial04 {

    public static void main(String[] args) {

        // Question 1(a): Find the largest integer n where n^3 < 2000
        System.out.println("Question 1(a)");

        int n = 1;

        while ((n + 1) * (n + 1) * (n + 1) < 2000) {
            n++;
        }

        System.out.println("Largest integer: " + n);


        // Question 1(b): Display squares of the first 12 integers
        System.out.println("\nQuestion 1(b)");

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " squared = " + (i * i));
        }


        // Question 1(c): Display a 4-by-5 matrix of random numbers
        System.out.println("\nQuestion 1(c)");

        for (int y = 0; y < 4; y++) {
            for (int j = 0; j < 5; j++) {
                int randomNumber = (int) (Math.random() * 101);
                System.out.print(randomNumber + "\t");
            }
            System.out.println();
        }


        // Question 1(d): Sum numbers from 1 to a given number
        System.out.println("\nQuestion 1(d)");

        int number = 10;
        int sum = 0;

        for (int z = 1; z <= number; z++) {
            sum += z;
        }

        System.out.println("Sum = " + sum);


        // Question 1(e): Sum the series to two decimal places
        System.out.println("\nQuestion 1(e)");

        double sums = 0;

        for (int r = 1; r <= 25; r++) {
            sums += (double) r / (26 - r);
        }

        System.out.printf("Sum = %.2f%n", sums);


        // Question 2(a): Correct the for loop
        System.out.println("\nQuestion 2(a)");

        int sumsss = 0;

        for (int x = 10; x > 0; x--) {
            sumsss += x;
        }

        System.out.println("Sum = " + sumsss);


        // Question 2(b): Correct the do-while loop
        System.out.println("\nQuestion 2(b)");

        int w = 0;
        int l = 0;

        do {
            w += 2;
            l += w;
            System.out.println(w + " and " + l);
        } while (w < 100);


        // Question 2(c): Correct the for loop
        System.out.println("\nQuestion 2(c)");

        for (int x = 1, y = 20; x < y; x++, y -= 2) {
            System.out.println(x + " " + y);
        }


        // Question 2(d): Correct the while loop
        System.out.println("\nQuestion 2(d)");

        int d = 1;

        while (d <= 10) {
            if (d == 10) {
                System.out.println("Program End");
            }
            d++;
        }


        // Question 3: Display the first ten Fibonacci numbers
        System.out.println("\nQuestion 3");

        int first = 1;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= 10; i++) {
            int next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;
        }

        System.out.println();


        // Question 4: Display a string in reverse order
        System.out.println("\nQuestion 4");

        String text = "University of Malaya";

        for (int k = text.length() - 1; k >= 0; k--) {
            System.out.print(text.charAt(k));
        }

        System.out.println();
    }
}
