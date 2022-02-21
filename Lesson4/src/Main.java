import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!\n This is a programme to find Min Max and Average ages");
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Enter three different ages:");
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            int c = new Scanner(System.in).nextInt();
            // Search Min
            if (a < b && a < c) {
                System.out.println("Min age: " + a);
            } else if (b < a && b < c) {
                System.out.println("Min age: " + b);
            } else {
                System.out.println("Min age: " + c);
            }
            // Search Max
            if (a > b && a > c) {
                System.out.println("Max age: " + a);
            } else if (b > a && b > c) {
                System.out.println("Max age: " + b);
            } else {
                System.out.println("Max age: " + c);
            }
            //Search Average
            if ((a > b && a < c) || (a < b && a > c)) {
                System.out.println("Average age: " + a);
            } else if ((b > a && b < c) || (b < a && b > c)) {
                System.out.println("Average age: " + b);
            } else {
                System.out.println("Average age: " + c);
            }
            System.out.println("Are you want to try again? Enter y/n:");
            String ch = new Scanner(System.in).nextLine();
            if (ch.equals("n")) {
                isContinue = false;
            }
        }
    }
}
