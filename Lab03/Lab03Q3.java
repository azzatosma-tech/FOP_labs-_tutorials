package Lab03;
import java.util.Scanner;
public class Lab03Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sales volume: ");
        double sales = input.nextDouble();

        double commission;

        if (sales < 0) {
            System.out.println("Invalid sales volume.");
        } else {
            if (sales <= 100) {
                commission = sales * 0.05;
            } else if (sales <= 500) {
                commission = sales * 0.075;
            } else if (sales <= 1000) {
                commission = sales * 0.10;
            } else {
                commission = sales * 0.125;
            }

            System.out.printf("Commission: %.2f%n", commission);
        }

        input.close();
    }
}
