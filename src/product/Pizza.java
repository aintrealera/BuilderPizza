package product;

public class Pizza {

    private final String dough;
    private final String sauce;
    private final String cheese;
    private final String toppings;
    private final String size;

    public String getSize() {
        return size;
    }

    public Pizza(String dough, String sauce, String cheese,
                 String toppings, String size) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "\n  Size: " + size +
                "\n  Dough: " + dough +
                "\n  Sauce: " + sauce +
                "\n  Cheese: " + cheese +
                "\n  Toppings: " + toppings +
                "\n}";
    }
}