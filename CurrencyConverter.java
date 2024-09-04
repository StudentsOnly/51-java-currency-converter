public class CurrencyConverter {

    public static void main(String[] args) {

        Currency[] currencies = {new USD(), new EUR(), new GBP()};
        double amount = 1.0;
        double convertedAmount = 0.0;
        for (Currency currency : currencies) {
            convertedAmount = switch (currency.getClass().getSimpleName()) {
                case "USD" -> USD.convertToUSD(amount);
                case "EUR" -> EUR.convertToUSD(amount);
                case "GBP" -> GBP.convertToUSD(amount);
                default -> 0;
            };
            System.out.println(amount + " " +
                    currency.getClass().getSimpleName() + " is " +
                    "%.2f".formatted(convertedAmount) + " USD");
        }

    }

}
