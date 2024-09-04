public class EUR implements Currency {

    public static double conversionToUsd = 1.11;

    public static double convertToUSD(double amount) {
        return conversionToUsd * amount;
    }

}
