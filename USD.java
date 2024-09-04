public class USD implements Currency {

    public static double conversionToUsd = 1;

    public static double convertToUSD(double amount) {
        return conversionToUsd * amount;
    }

}
