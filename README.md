## Exercise: Currency Converter

#### Objective:

Practice using polymorphism by creating a currency conversion program.

#### Description:

- You should create a set of classes representing different currencies (e.g., USD, EUR, GBP) and a currency conversion utility.
- Each currency class should have a method called convertToUSD(double amount) that converts an amount from that currency to USD.
- Create a class called CurrencyConverter that demonstrates the use of polymorphism to convert amounts from different currencies to USD.

#### Guidelines:

#### Currency Classes:

- Create three classes: USD, EUR, and GBP, each representing a different currency.
- Each currency class should have a static method called convertToUSD(double amount) that takes an amount in that currency and returns the equivalent amount in USD.

#### CurrencyConverter Class:

- Create a class called CurrencyConverter that demonstrates polymorphism.
- In CurrencyConverter, create an array of currency objects that includes instances of USD, EUR, and GBP.
- Use a loop to iterate through the array and convert an amount from each currency to USD.
- Display the converted amounts.
