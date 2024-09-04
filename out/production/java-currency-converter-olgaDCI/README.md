## Exercise: Currency Converter

#### Objective:

Practice using polymorphism by creating a currency conversion program.

#### Description:

- You should create a set of classes representing different currencies (e.g., USDCurrency, EURCurrency, GBPCurrency) and a currency conversion utility.
- Each currency class should have a method called convertToUSD(double amount) that converts an amount from that currency to USDCurrency.
- Create a class called CurrencyConverter that demonstrates the use of polymorphism to convert amounts from different currencies to USDCurrency.

#### Guidelines:

#### Currency Classes:

- Create three classes: USDCurrency, EURCurrency, and GBPCurrency, each representing a different currency.
- Each currency class should have a static method called convertToUSD(double amount) that takes an amount in that currency and returns the equivalent amount in USDCurrency.

#### CurrencyConverter Class:

- Create a class called CurrencyConverter that demonstrates polymorphism.
- In CurrencyConverter, create an array of currency objects that includes instances of USDCurrency, EURCurrency, and GBPCurrency.
- Use a loop to iterate through the array and convert an amount from each currency to USDCurrency.
- Display the converted amounts.
