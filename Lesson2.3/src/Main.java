import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      System.out.println("This is a Currency Converter from RUB to USD and EUR.");
      System.out.println("Enter the amount (RUB):");
      Scanner scan = new Scanner(System.in);
      double rub = scan.nextDouble();
      // current exchange rate
      double usd = 76.25;
      double eur = 86.31;
      double sumUsd = rub / usd;
      double sumEur = rub / eur;
      System.out.println("The amount in USD:" +sumUsd);
      System.out.println("The amount in EUR:" +sumEur);
    }
}
