public class CurrencyConverter {

    public double convertToUSD(double amount, USDCurrency usd) {
        if (usd == null) {
            throw new IllegalArgumentException("Currency object cannot be null.");
        }
        return usd.convertToUSD(amount);
    }

    public double convertToUSD(double amount, EURCurrency eur) {
        if (eur == null) {
            throw new IllegalArgumentException("Currency object cannot be null.");
        }
        return eur.convertToUSD(amount);
    }

    public double convertToUSD(double amount, GBPCurrency gbp) {
        if (gbp == null) {
            throw new IllegalArgumentException("Currency object cannot be null.");
        }
        return gbp.convertToUSD(amount);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        double amountToConvert = 1000;

        try {
            // Compile-time polymorphism
            System.out.println("EUR to USD (compile-time PM): " + converter.convertToUSD(amountToConvert, new EURCurrency()));
            System.out.println("GBP to USD (compile-time PM): " + converter.convertToUSD(amountToConvert, new GBPCurrency()));
            System.out.println("USD to USD (compile-time PM): " + converter.convertToUSD(amountToConvert, new USDCurrency()));

            // Runtime polymorphism
            Currency[] currencies = new Currency[3];
            currencies[0] = new USDCurrency();
            currencies[1] = new EURCurrency();
            currencies[2] = new GBPCurrency();

            // Loop through the currencies and convert to USD
            for (Currency currency : currencies) {
                if (currency != null) {
                    System.out.println("Converted amount (runtime PM): " + currency.convertToUSD(amountToConvert));
                } else {
                    System.err.println("Error: Currency object is null.");
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}