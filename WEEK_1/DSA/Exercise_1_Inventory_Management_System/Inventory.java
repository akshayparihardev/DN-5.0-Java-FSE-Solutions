package WEEK_1.DSA.Exercise_1_Inventory_Management_System;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<Product> productList = new ArrayList<>();
    
    public void addProduct(Product product){
        productList.add(product);
        System.out.println("Product Added Successfully");
    }
    
    public void updateProduct(int productId , String productName , int quantity , float price){

        for(Product product : productList){

            if(product.getProductId() == productId){
                product.setProductName(productName);
                product.setQuantity(quantity);
                product.setPrice(price);
            
                System.out.println("Product Updated Successfully..🥰");
                return;
            }
        }

        System.out.println("Product not Found ❌");

    }

    public void deleteProduct(int productId){

        for(int i = 0 ; i < productList.size() ; i++){
            if(productList.get(i).getProductId() == productId){
                productList.remove(i);
                System.out.println("Product Deleted Successfully..🥰");
                return;
            }
        }
        
        System.out.println("Product not Found ❌");
    }

    public void displayProducts(){

        if(productList.isEmpty()){
            System.out.println("No Products to Display..😥");
            return;
        }
        
        for (Product product : productList) {
            System.out.println(product);
            System.out.println("------------------------");
        }
    }
}
