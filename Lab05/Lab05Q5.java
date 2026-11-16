package Lab05;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Lab05Q5 {
    //Question 5 – Linear Search vs Binary Search
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] numbers = new int[20];

        System.out.println("A list of 20 random integers within 0 to 100");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101);
            System.out.print(numbers[i] + " ");
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("\nArray in descending order");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\nEnter a number to search: ");
        int target = input.nextInt();

        // Linear Search
        int linearLoops = 0;
        boolean linearFound = false;

        for (int i = 0; i < numbers.length; i++) {
            linearLoops++;

            if (numbers[i] == target) {
                linearFound = true;
                break;
            }
        }

        if (linearFound) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }

        System.out.println("Linear Search - " + linearLoops + " loop(s)");

        // Binary Search
        int low = 0;
        int high = numbers.length - 1;
        int binaryLoops = 0;
        boolean binaryFound = false;

        while (low <= high) {
            binaryLoops++;

            int mid = low + (high - low) / 2;

            if (numbers[mid] == target) {
                binaryFound = true;
                break;
            } else if (numbers[mid] < target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (binaryFound) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }

        System.out.println("Binary Search - " + binaryLoops + " loop(s)");

        input.close();
    }
}

