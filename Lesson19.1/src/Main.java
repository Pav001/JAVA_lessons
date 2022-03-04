import java.util.Scanner;

public class Main {
    String message = "";

    public static void main(String[] args) {
        int num1 = getNumber();
        int num2 = getNumber();
        String message = getCompare(num1, num2);
        System.out.println(message);
    }

    public static int getNumber() {
        System.out.println("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    public static String getCompare(int num1, int num2) {
        if (num1 > num2) {
            String mes = ("Число " + num1 + " больше числа " + num2);
            return mes;
        } else {
            String mes = ("Число " + num2 + " больше числа " + num1);
            return mes;
        }
    }
}

