
/**
 * Abstract base class representing a product in the campus store.
 * CSCI 160 Final Exam - Complete all sections.
 */
public abstract class Product {

    // TODO: Test 1: Declare the following fields, deciding if they should be public or private;
    //   String id
    //   String name
    //   double price
    //   int quantity

    /**
     * Constructor - initializes all four fields.
     * @param id       unique product ID
     * @param name     product name
     * @param price    unit price (must be >= 0)
     * @param quantity number in stock (must be >= 0)
     */
    public Product(String id, String name, double price, int quantity) {
        //TODO: Test 1: Complete this product constructor (Test 1):
    }

    // -------------------------
    // Getters
    // -------------------------

    /** @return the product ID */
    public String getId() {
        
        return this.id;
    }

    /** @return the product name */
    public String getName() {
        //TODO: Test 1: Add getter
        return "";
    }

    /** @return the unit price */
    public double getPrice() {
        //TODO: Test 1: Add getter
        return 0.0;
    }

    /** @return the quantity in stock */
    public int getQuantity() {
        //TODO: Test 1: Add getter
        return 0;
    }

    // -------------------------
    // Setters
    // -------------------------

    /**
     * Sets the quantity. If the value is negative, keep the current quantity.
     * @param quantity new quantity
     */
    public void setQuantity(int quantity) {
        //TODO: Test 1: Add setter

    }

    /**
     * Sets the price. If the value is negative, keep the current price.
     * @param price new price
     */
    public void setPrice(double price) {
        //TODO: Test 1: Add setter

    }

    // -------------------------
    // Abstract methods
    // -------------------------

    /**
     * Returns the category label for this product type.
     * e.g., "Book" or "Snack"
     */
    public abstract String getCategory();

    /**
     * Returns the price including any applicable tax.
     */
    public abstract double getPriceWithTax();

    // -------------------------
    // toString
    // -------------------------

    /**
     * Returns a formatted string in the form:
     *   [id] name - $price (qty: quantity)
     * Example: [B001] Intro to Java - $89.99 (qty: 30)
     */
    @Override
    public String toString() {
        //TODO: Test 2: Update to output properly formatted string
        return "";
    }
}