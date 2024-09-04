import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class CurrencyConverter {

    private double amount ;
    private ArrayList<Currencies> currencies;

    public CurrencyConverter(double amount){
        this.amount = amount;
        this.currencies = new ArrayList<>();
        currencies.add(new USD());
        currencies.add(new EUR());
        currencies.add(new GBP());
    }

    public void display(){
        System.out.println("\nCurrencies:");
        for(Currencies cur: currencies){
            System.out.println(amount + cur.getCurrency().getSymbol() + " = " + String.format("%.2f", cur.convertToUSD(amount)) + Currency.getInstance(Locale.US).getSymbol());
        }
    }

}
