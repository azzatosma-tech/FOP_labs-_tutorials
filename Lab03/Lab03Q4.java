package Lab03;
import java.util.Random;
public class Lab03Q4 {

    public static void main(String[] args) {

        Random random = new Random();

        // Player 1 rolls twice
        int p1Roll1 = random.nextInt(6) + 1;
        int p1Roll2 = random.nextInt(6) + 1;

        int player1Total = p1Roll1 + p1Roll2;

        // Player 2 rolls twice
        int p2Roll1 = random.nextInt(6) + 1;
        int p2Roll2 = random.nextInt(6) + 1;

        int player2Total = p2Roll1 + p2Roll2;

        // Display results
        System.out.println("Player 1:");
        System.out.println("First roll: " + p1Roll1);
        System.out.println("Second roll: " + p1Roll2);
        System.out.println("Total score: " + player1Total);

        System.out.println();

        System.out.println("Player 2:");
        System.out.println("First roll: " + p2Roll1);
        System.out.println("Second roll: " + p2Roll2);
        System.out.println("Total score: " + player2Total);

        // Determine the winner
        if (player1Total > player2Total) {
            System.out.println("Player 1 wins!");
        } else if (player2Total > player1Total) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}

