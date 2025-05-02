package taxsystem;

public class Invoice extends TaxCalculator {
    public double calculateTotalWithTax(double amount) {
        return amount + (amount * GST_RATE / 100);
    }
}
