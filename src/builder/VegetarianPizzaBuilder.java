package builder;

import product.Pizza;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    private String size;
    private String dough;
    private String sauce;
    private String cheese;
    private String toppings;

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public Pizza build() {

        if (size == null || size.isBlank()) {
            throw new IllegalStateException("Pizza size must be specified");
        }

        if (dough == null || dough.isBlank()) {
            throw new IllegalStateException("Pizza dough must be specified");
        }

        if (sauce == null || sauce.isBlank()) {
            throw new IllegalStateException("Pizza sauce must be specified");
        }

        if (cheese == null || cheese.isBlank()) {
            throw new IllegalStateException("Pizza cheese must be specified");
        }

        if (toppings == null || toppings.isBlank()) {
            throw new IllegalStateException("Pizza toppings must be specified");
        }

        return new Pizza(
                dough,
                sauce,
                cheese,
                toppings,
                size
        );
    }
}