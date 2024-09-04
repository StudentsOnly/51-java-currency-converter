public class CurrencyConverter {

    // Overloaded methods for converting currencies to USD
    public double convertToUSD(double amount, USDCurrency usd) {
        return usd.convertToUSD(amount);
    }

    public double convertToUSD(double amount, EURCurrency eur) {
        return eur.convertToUSD(amount);
    }

    public double convertToUSD(double amount, GBPCurrency gbp) {
        return gbp.convertToUSD(amount);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        double amountToConvert = 1000;

        // compile-time polymorphism
        System.out.println("EUR to USD (compile-time PM): " + converter.convertToUSD(amountToConvert, new EURCurrency()));
        System.out.println("GBP to USD (compile-time PM): " + converter.convertToUSD(amountToConvert, new GBPCurrency()));
        System.out.println("USD to USD (compile-time PM): " + converter.convertToUSD(amountToConvert, new USDCurrency()));

        // runtime polymorphism
        Currency[] currencies = new Currency[3];

        currencies[0] = new USDCurrency();
        currencies[1] = new EURCurrency();
        currencies[2] = new GBPCurrency();

        // Loop through the currencies and convert to USD
        for (Currency currency : currencies) {
            System.out.println("Converted amount (runtime PM): " + currency.convertToUSD(amountToConvert));
        }
    }
}
