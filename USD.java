import java.util.Currency;
import java.util.Locale;

class USD implements Currencies {
    static private Currency currency = Currency.getInstance(Locale.US);

   public Currency getCurrency(){
        return currency;
    }



@Override
public double convertToUSD(double amount){
        return amount;
}


}
