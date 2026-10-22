public class ShippingCalculator {
    public static void main(String[] args) {
        // Hardcoded variables as instructed
        double orderTotal = 1250.50;
        int stockQuantity = 0;

        // Use a ternary operator to assign a double shippingFee:
        // If orderTotal >= 1000.0, shipping is 0.0; otherwise, it is 150.0.
        double shippingFee = (orderTotal >= 1000.0) ? 0.0 : 150.0;

        // Use a second ternary operator to assign a String itemStatus:
        // If stockQuantity > 0, assign "In Stock"; otherwise, assign "Out of Stock".
        String itemStatus = (stockQuantity > 0) ? "In Stock" : "Out of Stock";

        // Print both calculated results clearly on separate lines.
        System.out.print("Shipping Fee: PHP " + shippingFee);
        System.out.print(" Item Availability: " + itemStatus);
    }
}
