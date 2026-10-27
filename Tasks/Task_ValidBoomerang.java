package Tasks;
public class Task_ValidBoomerang {

    public static boolean isBoomerang(int[][] points) {

        int x1 = points[0][0];
        int y1 = points[0][1];

        int x2 = points[1][0];
        int y2 = points[1][1];

        int x3 = points[2][0];
        int y3 = points[2][1];

        return (x2 - x1) * (y3 - y1) !=
               (y2 - y1) * (x3 - x1);
    }

    public static void main(String[] args) {

        int[][] points1 = {{1, 1}, {2, 3}, {3, 2}};
        int[][] points2 = {{1, 1}, {2, 2}, {3, 3}};

        System.out.println(isBoomerang(points1)); // true
        System.out.println(isBoomerang(points2)); // false
    }
}
