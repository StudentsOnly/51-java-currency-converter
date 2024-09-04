public class GBP {
    private static double exchangeRate = 1.31;

    static double convertToUSD(double amount) {
        return amount * exchangeRate;
    }
}
