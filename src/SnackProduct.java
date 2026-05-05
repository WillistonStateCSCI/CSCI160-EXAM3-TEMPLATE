/**
 * SnackProduct - a product that is a snack.
 * CSCI 160 Final Exam - Complete all sections.
 */
public class SnackProduct extends Product {

    // TODO: Test 1: Declare a private field: boolean glutenFree

    /**
     * Constructor.
     * @param id         unique product ID
     * @param name       snack name
     * @param price      unit price
     * @param quantity   number in stock
     * @param glutenFree true if the snack is gluten-free
     */
    public SnackProduct(String id, String name, double price, int quantity, boolean glutenFree) {
        // TODO: Test 1: Call super constructor, then assign glutenFree
    }

    /**
     * @return true if this snack is gluten-free
     */
    public boolean isGlutenFree() {
        //TODO: Test 1: Add getter
    }

    /**
     * @return "Snack"
     */
    @Override
    public String getCategory() {
        //TODO: Test 7: Add getter
    }

    /**
     * Snacks are taxed at 8%.
     * @return price * 1.08
     */
    @Override
    public double getPriceWithTax() {
        //TODO: Test 7: Add appropriate getter with tax
    }
}