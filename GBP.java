public class GBP implements Currency {

    public static double conversionToUsd = 1.31;

    public static double convertToUSD(double amount) {
        return conversionToUsd * amount;
    }

}
