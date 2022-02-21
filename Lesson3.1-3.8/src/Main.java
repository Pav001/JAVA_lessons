import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*byte a = 1;
        short b = 2000;
        int bigDog1 = 3000000;
        int catCount22 = 400000000;
        long angryBird333 = 5000000000000000l;
        String hello = "Hello World !";
        char ch1 = 'a';
        char ch2 = 97;
        int ten = 10;
        double pi = 3.14;
        System.out.println("a="+a+"\nb="+b+"\nbigDog1="+bigDog1+"\ncatCount22="+catCount22+
                "\nangryBird333="+angryBird333+"\n"+hello+"\n"+ch1+"\n"+ch2+"\n"+ten+"\n"+pi);
*/
    // простой калькулятор для двух цифр
        System.out.println("Hello!\n This is a calculator.");
        //ввод первой цифры
        System.out.println("Enter first number:");
        Scanner scan1 = new Scanner(System.in);
        double aC = scan1.nextDouble();
        //ввод второй цифры
        System.out.println("Enter second number:");
        Scanner scan2 = new Scanner(System.in);
        double bC = scan2.nextDouble();
        // расчеты
        double sum1 = aC - bC;
        double sum2 = aC * bC;
        double sum3 = aC / bC;
        // вывод на печать
        System.out.println("Results:\n" + aC + "-" + bC + "=" + sum1);
        System.out.println(aC + "*" + bC + "=" + sum2);
        System.out.println(aC + "/" + bC + "=" + sum3);
    }
}
