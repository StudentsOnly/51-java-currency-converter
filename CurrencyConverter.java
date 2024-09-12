import java.util.List;

public class CurrencyConverter {
    private List<Object> list = List.of(
            new EUR(),
            new GBP(),
            new USD(),
            new Object() // check exception handling
    );

    public void convertToUSD(Double amount) {
        for (Object currency : list) {
            try {
                convertCurrency(currency, amount);
            } catch (ClassNotFoundException e) {
                System.out.println("Currency: " + currency.getClass().getSimpleName() + ", Error message: " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Null pointer");
            }
        }
    }

    private void convert(EUR eur, Double amount) {
        double usd = 0;
        try {
            usd = EUR.convertToUSD(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Amount: " + amount + ", Error message: " + e.getMessage());
            return;
        }
        if (usd > 0) {
            System.out.printf("%.2f EUR = %.2f USD\n", amount, usd);
        }
    }

    private void convert(GBP gbp, Double amount) {
        double usd = 0;
        try {
            usd = GBP.convertToUSD(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Amount: " + amount + ", Error message: " + e.getMessage());
            return;
        }
        if (usd > 0) {
            System.out.printf("%.2f GBP = %.2f USD\n", amount, usd);
        }
    }

    private void convert(USD eur, Double amount) {
        double usd = 0;
        try {
            usd = EUR.convertToUSD(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Amount: " + amount + ", Error message: " + e.getMessage());
            return;
        }
        if (usd > 0) {
            System.out.printf("%.2f USD = %.2f USD\n", amount, usd);
        }
    }

    private void convertCurrency(Object obj, double amount) throws ClassNotFoundException, NullPointerException {
        switch (obj) {
            case EUR eur -> convert(eur, amount);
            case GBP gbp -> convert(gbp, amount);
            case USD usd -> convert(usd, amount);
            case null -> throw new NullPointerException();
            default -> throw new ClassNotFoundException("Unknown Currency");
        }
    }

}
