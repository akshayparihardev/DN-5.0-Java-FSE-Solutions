package WEEK_1.DSA.Exercise_1_Inventory_Management_System;

public class Main {
    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();

        Product p1 = new Product(101,"Redmi Note 10 Pro Max",1,13000.00f);
        Product p2 = new Product(102,"Samsung S20 FE",1,38000.00f);
        Product p3 = new Product(103,"POCO F2",1,15000.00f);
        Product p4 = new Product(104,"Oppo F3",1,18000.00f);
        Product p5 = new Product(105,"Asus ROG F16",1,70000.00f);

        
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);
        inventory.addProduct(p5);

        System.out.println("Inventory Items");
        System.out.println("===========================");
        inventory.displayProducts();

        inventory.updateProduct(101,"Redmi Note 10 Pro",1,14000.00f);

        System.out.println("\n----- After Update -----");
        inventory.displayProducts();

        inventory.deleteProduct(105);
        System.out.println("\n----- After Delete -----");
        inventory.displayProducts();

    }
}
