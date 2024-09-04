import java.util.Currency;
import java.util.Locale;

public class EUR implements Currencies{
    static private Currency currency = Currency.getInstance(Locale.GERMANY);
    static private double exchangeRate = 1.1;

    public Currency getCurrency(){
        return currency;
    }

@Override
    public double convertToUSD(double amount){
        return exchangeRate * amount;
    }


}
