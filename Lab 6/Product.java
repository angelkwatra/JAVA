package ecommerce;

public class Product {
    private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void getProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock Available: " + stock);
    }

    protected void applyDiscount(double discountPercent) {
        price -= (price * discountPercent / 100);
        System.out.println("Discount applied! New Price: $" + price);
    }

    void updateStock(int newStock) {
        stock = newStock;
        System.out.println("Stock updated! New Stock: " + stock);
    }

    private double calculateProfit() {
        return price * stock * 0.2;  
    }

    public void showProfit() {
        System.out.println("Profit: $" + calculateProfit());
    }
}
