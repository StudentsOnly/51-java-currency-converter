public class GBP {
    private static double exchangeRate = 1.31;

    static double convertToUSD(double amount) throws IllegalArgumentException {
        if (amount < 0) throw new IllegalArgumentException("Amount can't be negative");
        return amount * exchangeRate;
    }
}
