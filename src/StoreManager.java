
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * StoreManager - manages the campus store inventory.
 */
public class StoreManager {

    // TODO: Test 4: Declare a public or package-private ArrayList<Product> named inventory

    /*
     * Default constructor - initializes the inventory list.
     */
    public StoreManager() {
        //TODO: Test 4: Finish this constructor;
    }

    /**
     * Reads products from a file and populates the inventory list. Each line
     * has the format: type,id,name,price,quantity[,extra] BOOK lines have an
     * author as the extra field. SNACK lines have a boolean (glutenFree) as the
     * extra field.
     *
     * @param filename path to the data file
     * @throws IOException if the file cannot be read
     */
    public void loadProducts(String filename) throws IOException {
        try (Scanner input = new Scanner(new File(filename))) {
            while (input.hasNextLine()) {
                String line = input.nextLine().trim();

                if (line.length() == 0) {
                    continue;
                }

                String[] parts = line.split(",");

                String type = parts[0];
                String id = parts[1];
                String name = parts[2];
                double price = Double.parseDouble(parts[3]);
                int quantity = Integer.parseInt(parts[4]);

                // TODO: Test 3: The code above does most of the work to parse a product for you.
                // Add code below to add both BookProducts and SnackProducts to the inventory.

            }
        }
    }

    /**
     * Searches inventory for a product with the given ID.
     *
     * @param id the product ID to search for
     * @return the matching Product, or null if not found
     */
    public Product findProductById(String id) {
        // TODO: Test 4 and 5: Add code below to return product based on ID, return null if item cannot be found.
        // If product cannot be found, return null

        return null;
    }

    /**
     * Processes a purchase: reduces the product's quantity by qty and returns the total cost (price * qty).
     *
     * Returns -1.0 if: - the product ID is not found, OR - qty exceeds the available stock
     *
     * @param id  product ID
     * @param qty number of units to purchase
     * @return total cost, or -1.0 on failure
     */
    public double purchaseProduct(String id, int qty) {
        // TODO: Test 6: Add code below to purchase a product and update the quantity
        // Make sure you look at the expected output to handle invalid purchase
        // attempts.

    }

    /**
     * Computes the total value of all inventory. Total value = sum of (price *
     * quantity) for every product.
     *
     * @return total inventory value
     */
    public double getTotalInventoryValue() {
        // TODO: Test 8 and 9: Make sure this returns the correct total for both
        // products1.txt and products2.txt
        return 0.0;
    }

    //This method is included for you to call in your summary.  It will return the most expensive product
    public Product mostExpensive() {
        Product mostExp = inventory.get(0);
        for (Product product : inventory) {

            if (product.getPrice() > mostExp.getPrice()) {
                mostExp = product;
            }
        }
        return mostExp;
    }

    //This method is included for you to call in your summary.  It will return the total number of products
    public int totalInventory() {
        int totalUnits=0;
        for (Product product : inventory) {
            totalUnits += product.getQuantity();
        }
        return totalUnits;
    }

    /**
     * Generates a summary report string containing: - Total number of distinct
     * products - Total units in stock (sum of all quantities) - Name of the
     * most expensive product (by price)
     *
     * Format
     * "Products: W | Total units: X | Total inventory value: Y | Most expensive: Z"
     *
     * @return formatted summary string
     */
    public String getSummary() {
        // TODO: Test 10: Ensure this returns a non-empty string with the summary in the proper format
        // You may need to use DecimalFormat to return the total inventory value rounded correctly.

            return "Products: 0 | Total units: 0 | Total inventory value: 0 | Most expensive: None";
        }
}
