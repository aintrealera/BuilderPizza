package client;

import builder.RegularPizzaBuilder;
import builder.VegetarianPizzaBuilder;
import director.PizzaDirector;
import product.Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaDirector director = new PizzaDirector();

        Pizza regularPizza = director.makeRegularPizza(
                new RegularPizzaBuilder()
        );

        Pizza vegetarianPizza = director.makeVegetarianPizza(
                new VegetarianPizzaBuilder()
        );
        System.out.println("Available pizza configurations:");

        System.out.println("REGULAR PIZZA");
        System.out.println(regularPizza);

        System.out.println();

        System.out.println("VEGETARIAN PIZZA");
        System.out.println(vegetarianPizza);
    }
}