import java.util.Currency;
import java.util.Locale;

public class GBP implements Currencies{
    static private Currency currency = Currency.getInstance(Locale.UK);
    static private double exchangeRate = 1.31;

   public Currency getCurrency(){
        return currency;
    }

    @Override
    public double convertToUSD(double amount){
        return exchangeRate * amount;
    }
}
