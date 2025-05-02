import taxsystem.Invoice;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.displayGST();
        double total = invoice.calculateTotalWithTax(1000);
        System.out.println("Total Amount after GST: " + total);
    }
}
