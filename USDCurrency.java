public class USDCurrency extends Currency {

    @Override
    public double convertToUSD(double amount) {
        // Since this is already USD, the conversion is direct
        return amount;
    }
}
