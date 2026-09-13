package director;

import builder.PizzaBuilder;
import product.Pizza;

public class PizzaDirector {

    private static final String LARGE_SIZE = "Large";
    private static final String MEDIUM_SIZE = "Medium";

    private static final String THIN_DOUGH = "Thin";
    private static final String CLASSIC_DOUGH = "Classic";

    private static final String TOMATO_SAUCE = "Tomato";
    private static final String MOZZARELLA_CHEESE = "Mozzarella";

    public Pizza makeRegularPizza(PizzaBuilder builder) {
        return builder
                .setSize(LARGE_SIZE)
                .setDough(THIN_DOUGH)
                .setSauce(TOMATO_SAUCE)
                .setCheese(MOZZARELLA_CHEESE)
                .setToppings("Pepperoni")
                .build();
    }

    public Pizza makeVegetarianPizza(PizzaBuilder builder) {
        return builder
                .setSize(MEDIUM_SIZE)
                .setDough(CLASSIC_DOUGH)
                .setSauce(TOMATO_SAUCE)
                .setCheese(MOZZARELLA_CHEESE)
                .setToppings("Mushrooms, Tomatoes, Olives")
                .build();
    }
}