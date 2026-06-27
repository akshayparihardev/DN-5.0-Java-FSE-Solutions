package WEEK_1.DSA.Exercise_2_E_commerce_Platform_Search_Function;

public class Product implements Comparable<Product> {

    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Product other) {
        return this.productId - other.productId;
    }

    @Override
    public String toString() {
        return "Product ID : " + productId
                + "\nProduct Name : " + productName
                + "\nCategory : " + category;
    }
}