package Lab04;
import java.util.Random;
    /* 
    Write a simple two players dice game. Each player will take turns to roll a dice. The
first players that reach more than 100 points win the game. If the player rolls a 6, the
player will score 6 points and has the chance to roll again.
    */ 



public class Lab04Q5 {
    public static void main(String[] args) {

        Random rand = new Random();

        int player1 = 0;
        int player2 = 0;
        int currentPlayer = 1;

        while (player1 < 100 && player2 < 100) {

            int dice = rand.nextInt(6) + 1;

            System.out.println("\nPlayer " + currentPlayer
                               + " rolled: " + dice);

            if (currentPlayer == 1) {
                player1 += dice;
                System.out.println("Player 1 score: " + player1);

                if (player1 >= 100) {
                    System.out.println("Player 1 wins!");
                    break;
                }
            } else {
                player2 += dice;
                System.out.println("Player 2 score: " + player2);

                if (player2 >= 100) {
                    System.out.println("Player 2 wins!");
                    break;
                }
            }

            if (dice == 6) {
                System.out.println("Rolled a 6! Roll again.");
            } else {
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
        }
    }
}


