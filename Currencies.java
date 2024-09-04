import java.util.Currency;

public interface Currencies {

    Currency getCurrency();

    public double convertToUSD(double amount);
}
