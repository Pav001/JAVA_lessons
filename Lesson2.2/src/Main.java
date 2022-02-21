import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello!\nThis program converts temperature from degrees Celsius to Farengeyt.");
        System.out.println("Please enter the temperature in degrees Celsius:");
        Scanner scan = new Scanner(System.in);
        double c = scan.nextDouble();
        double f = c * 1.8 + 32;
        System.out.println("Temperature in Farengeyt:" +f);
    }
}
