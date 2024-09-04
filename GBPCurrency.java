public class GBPCurrency extends Currency {
    private static final double USD_CONVERSION_RATE = 1.3; // Example conversion rate

    @Override
    public double convertToUSD(double amount) {
        return amount * USD_CONVERSION_RATE;
    }
}
