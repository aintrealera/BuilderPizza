# Builder Pattern - Pizza

## Description

This project demonstrates the Builder design pattern in Java.

The project uses Pizza as the main product. A pizza consists of
several configurable parts, such as size, dough, sauce, cheese,
and toppings.

The Builder pattern allows the pizza to be constructed step by step
and makes it possible to create different pizza configurations.

## Project Structure

### Product

`Pizza` - represents the final pizza object.

### Builder

`PizzaBuilder` - defines the steps required to construct a pizza.

### Concrete Builders

`RegularPizzaBuilder` - creates a regular pizza configuration.

`VegetarianPizzaBuilder` - creates a vegetarian pizza configuration.

### Director

`PizzaDirector` - controls the construction sequence for predefined
pizza configurations.

### Client

`Main` - demonstrates how the builders are used and prints the
resulting pizzas.

## Pizza Configurations

### Regular Pizza

- Size: Large
- Dough: Thin
- Sauce: Tomato
- Cheese: Mozzarella
- Toppings: Pepperoni

### Vegetarian Pizza

- Size: Medium
- Dough: Classic
- Sauce: Tomato
- Cheese: Mozzarella
- Toppings: Mushrooms, Tomatoes, Olives

## Technologies

- Java 17
- IntelliJ IDEA

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 17.
4. Open `Main.java`.
5. Run the `main()` method.
6. The console will display both pizza configurations.

## Builder Pattern Benefits

The Builder pattern makes the construction process clear and
readable. It also allows different builders to create different
representations of the same product.

## Validation

The builders validate required pizza properties before creating
the final `Pizza` object. If a required property is missing,
`build()` throws an `IllegalStateException`.

## Author

Individual assignment for Software Design Patterns.