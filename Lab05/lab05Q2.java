package Lab05;
import java.util.Random;
public class lab05Q2 {
    
    public static void main(String[] args) {
        // Question 2 – Generate 10 Non-Duplicate Random Integers (0–20)

        Random rand = new Random();

        int[] numbers = new int[10];
        int count = 0;

        while (count < 10) {
            int num = rand.nextInt(21);
            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.println("10 Non-Duplicate Random Integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}