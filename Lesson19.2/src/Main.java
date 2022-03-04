import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int num = getNumber();
        String message = getMultiple(num);
        System.out.println(message);
    }
    public static int getNumber(){
        System.out.println("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }
    public static String getMultiple (int num){
        String mes="";
        if (num%2==0){
            mes = (num + "- четное число");
        }else mes = (num + "- не четное число");
        return mes;
    }
}

