import java.util.List;
import java.util.Objects;

public class CurrencyConverter {
    private List<Object> list = List.of(
            new EUR(),
            new GBP(),
            new USD()
    );

    public void convertToUSD(Double amount) {
        for (var currency : list) {
            if (currency instanceof EUR)
                System.out.printf("%.2f EUR = %.2f USD\n", amount, convert((EUR) currency, amount));
            else if (currency instanceof GBP)
                System.out.printf("%.2f GBP = %.2f USD\n", amount, convert((GBP) currency, amount));
            if (currency instanceof USD)
                System.out.printf("%.2f USD = %.2f USD\n", amount, convert((USD) currency, amount));
        }
    }

    private double convert(EUR eur, Double amount) {
        return EUR.convertToUSD(amount);
    }

    private double convert(GBP gbp, Double amount) {
        return GBP.convertToUSD(amount);
    }

    private double convert(USD eur, Double amount) {
        return USD.convertToUSD(amount);
    }

}
