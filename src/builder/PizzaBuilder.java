package builder;

import product.Pizza;

public interface PizzaBuilder {

    PizzaBuilder setSize(String size);

    PizzaBuilder setDough(String dough);

    PizzaBuilder setSauce(String sauce);

    PizzaBuilder setCheese(String cheese);

    PizzaBuilder setToppings(String toppings);

    Pizza build();
}