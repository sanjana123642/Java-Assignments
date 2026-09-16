import java.util.Scanner;

class Order {
    private String customer;
    private String item;
    private int quantity;
    private double price;

    Order(String customer, String item, int quantity, double price) {
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    double calculateSubtotal() {
        return quantity * price;
    }

    double calculateDiscount() {
        double subtotal = calculateSubtotal();

        if (subtotal > 1000) {
            return subtotal * 0.05;
        }

        return 0;
    }

    double calculateFinalAmount() {
        double subtotal = calculateSubtotal();
        double discount = calculateDiscount();
        double deliveryFee = 50;

        return subtotal - discount + deliveryFee;
    }

    void displayOrder() {
        double subtotal = calculateSubtotal();
        double discount = calculateDiscount();
        double deliveryFee = 50;
        double finalAmount = calculateFinalAmount();

        System.out.println("\nOrder Details");
        System.out.println("Customer: " + customer);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);

        System.out.printf("Subtotal: ₹%.2f%n", subtotal);
        System.out.printf("Discount: ₹%.2f%n", discount);
        System.out.printf("Delivery Fee: ₹%.2f%n", deliveryFee);
        System.out.printf("Final Amount: ₹%.2f%n", finalAmount);
    }
}

public class OnlineFoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customer = sc.nextLine();

        System.out.print("Enter food item: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price per item: ₹");
        double price = sc.nextDouble();

        if (quantity <= 0 || price <= 0) {
            System.out.println("Invalid quantity or price.");
            sc.close();
            return;
        }

        Order order = new Order(customer, item, quantity, price);

        order.displayOrder();

        sc.close();
    }
}