/**
 * BookProduct - a product that is a book.
 * CSCI 160 Final Exam - Complete all sections
 */
public class BookProduct extends Product {

    // TODO: Test 1: Declare a private field: String author
    


    /**
     * Constructor.
     * @param id       unique product ID
     * @param name     book title
     * @param price    unit price
     * @param quantity number in stock
     * @param author   author's name
     */
    public BookProduct(String id, String name, double price, int quantity, String author) {
        // TODO: Test 1: Call super constructor, then assign author

    }

    /**
     * @return the author's name
     */
    public String getAuthor() {
        //TODO: Test 1: Add getter
        return "";
    }

    /**
     * @return "Book"
     */
    @Override
    public String getCategory() {
        //
        //TODO: Test 7: Add getter
        return "";
    }

    /**
     * Books are tax-exempt.
     * @return price * 1.0
     */
    @Override
    public double getPriceWithTax() {
        // 
        //TODO: Test 7: Add appropriate getter with tax
        return 0.0;
    }
}