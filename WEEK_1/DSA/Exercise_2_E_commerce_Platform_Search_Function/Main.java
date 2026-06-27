package WEEK_1.DSA.Exercise_2_E_commerce_Platform_Search_Function;

import java.util.Arrays;

public class Main {

    public static void linearSearch(Product[] products, int productId) {

        for (Product product : products) {

            if (product.getProductId() == productId) {

                System.out.println("Product Found!");
                System.out.println(product);
                return;
            }
        }

        System.out.println("Product Not Found!");
    }

    public static void binarySearch(Product[] products, int productId) {

        Arrays.sort(products);

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (products[mid].getProductId() == productId) {

                System.out.println("Product Found!");
                System.out.println(products[mid]);
                return;
            }

            else if (productId > products[mid].getProductId()) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        System.out.println("Product Not Found!");
    }

    public static void main(String[] args) {

        Product[] products = new Product[5];

        products[0] = new Product(101, "Redmi Note 10 Pro", "Mobile");
        products[1] = new Product(102, "Samsung S20 FE", "Mobile");
        products[2] = new Product(103, "POCO F2", "Mobile");
        products[3] = new Product(104, "Asus ROG F16", "Laptop");
        products[4] = new Product(105, "Sony Bravia TV 48 inch", "TV");

        System.out.println("===== Linear Search =====");
        linearSearch(products, 104);

        System.out.println();

        System.out.println("===== Binary Search =====");
        binarySearch(products, 102);
    }
}