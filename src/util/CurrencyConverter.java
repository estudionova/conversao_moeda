package util;

public class CurrencyConverter {

    public static double conversaoDollar(double valorReal, double valorDollar) {

        double total = valorDollar * valorReal;
        double percentual = 6.0 / 100.0;

        double valorFinal = total + (percentual * total);

        return valorFinal;

    }
}
