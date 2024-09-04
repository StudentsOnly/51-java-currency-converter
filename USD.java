public class USD {
    private static double exchangeRate = 1;

    static double convertToUSD(double amount) {
        return amount * exchangeRate;
    }
}
