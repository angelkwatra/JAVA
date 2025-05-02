import ecommerce.Product;  

public class l6q4 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1500.0, 10);

        product.getProductDetails();

        product.showProfit();
    }
}
