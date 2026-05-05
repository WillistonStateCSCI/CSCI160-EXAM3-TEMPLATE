import java.io.IOException;
/**
 * Main - entry point for the Campus Store Inventory Manager.
 * CSCI 160 Final Exam - Complete the main method.
 */
public class Main {

    public static void main(String[] args) {
        String filename=args[0];


        // 1. Create a StoreManager object
        StoreManager sm = new StoreManager();

        // 2. Call loadProducts("products.txt")
        // Wrap in a try-catch for IOException and print an error message if it fails
        try {
            sm.loadProducts(filename);
        } catch (IOException e) {
            System.out.println("Error loading products file.");
        }

        // 3.  Attempt to find product by ID (Test 5) (S005 only exists in products2.txt)

        System.out.println("Attempting to find S005");
        System.out.println(sm.findProductById("S005"));
        System.out.println();

        // 4.  Attempt to set quantity to a negative (Test 2)

        sm.findProductById("B002").setQuantity(-5);
        System.out.println("After attempting to set B002 quantity to -5:");
        System.out.println(sm.findProductById("B002"));
        System.out.println();

        // 5.  Attempt to set quantity to an appropriate value (Test 2)

        sm.findProductById("B002").setQuantity(17);
        System.out.println("After attempting to set B002 quantity to 17:");
        System.out.println(sm.findProductById("B002"));
        System.out.println();

        // 6. Print all products using their toString() method
        System.out.println("=== Campus Store Inventory ===");
        // (your loop here)
        for (Product product : sm.inventory) {
            System.out.println(product);
        }

        // 7. Purchase 13 units of product "B001" (Only Works when products1.txt is loaded) (Test 6)
        // Print the total cost, or a message if the purchase failed
        System.out.println("\n=== Purchase ===");
        // (your purchase code here)
        sm.purchaseProduct("B001", 13);

        // 8. Purchase 2 units of product "B005" (Only works when products2.txt is loaded) (Test 6) 
        // Print the total cost, or a message if the purchase failed
        System.out.println("\n=== Purchase ===");
        // (your purchase code here)
        sm.purchaseProduct("B005", 2);

        // 9. Print the summary report
        System.out.println("\n=== Summary ===");
        // (your summary code here)
        System.out.println(sm.getSummary());
    }
}