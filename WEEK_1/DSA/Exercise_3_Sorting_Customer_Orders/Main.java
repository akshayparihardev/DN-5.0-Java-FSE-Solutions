package WEEK_1.DSA.Exercise_3_Sorting_Customer_Orders;

public class Main {

    public static void main(String[] args) {

        OrderManagement om = new OrderManagement();

        Order[] orders = new Order[5];

        orders[0] = new Order(101, "Akshay", 4500);
        orders[1] = new Order(102, "Devashish", 2500);
        orders[2] = new Order(103, "Uday", 7000);
        orders[3] = new Order(104, "Kartikeya", 3200);
        orders[4] = new Order(105, "Rutu", 5500);

        System.out.println("Orders Before Sorting:");

        om.displayOrders(orders);

        System.out.println("\nBubble Sort:");

        om.bubbleSort(orders);

        om.displayOrders(orders);

        System.out.println("\nQuick Sort:");

        om.quickSort(orders, 0, orders.length - 1);

        om.displayOrders(orders);
    }
}