package Lab05;

public class Lab05Q4 {
    // Question 4 – Rotate a 3×3 Matrix 90° Clockwise

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

        int[][] rotated = new int[3][3];

        System.out.println("3 by 3 Matrix");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotated[j][2 - i] = matrix[i][j];
            }
        }

        System.out.println("After rotates 90 degrees clockwise");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}

