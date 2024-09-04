public class EUR {
    private static double exchangeRate = 1.10;

    static double convertToUSD(double amount) {
        return amount * exchangeRate;
    }

}
