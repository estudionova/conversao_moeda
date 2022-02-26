package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar prices?: ");
        double valorDollar = sc.nextDouble();

        System.out.println("How many dollars will be bought?: ");
        double valorReais = sc.nextDouble();

        double valorConversao = CurrencyConverter.conversaoDollar(valorDollar, valorReais);

        System.out.printf("Amount to be paid in reais R$: %.2f%n", valorConversao);

        sc.close();

    }
}
