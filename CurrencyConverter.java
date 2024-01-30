package currency_convertor;

import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usdAmount = input.nextDouble();
        double conversionRate = 0.85;
        double euroAmount = usdAmount * conversionRate;
        System.out.println(usdAmount + " USD is equal to " + euroAmount + " Euro");
    }
}
