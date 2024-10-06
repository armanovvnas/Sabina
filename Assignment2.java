// Step 1: Create a base interface for the Pizza
interface Pizza {
    String getDescription();
    double getCost();
}

// Step 2: Create a concrete class for BasicPizza
class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.00; // Base cost of a plain pizza
    }
}

// Step 3: Create the abstract decorator class that implements Pizza
abstract class PizzaDecorator implements Pizza {
    protected Pizza tempPizza;

    // The constructor will accept a Pizza to decorate
    public PizzaDecorator(Pizza pizza) {
        this.tempPizza = pizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}

// Step 4: Create specific decorators (for toppings)
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.25; // Cost for extra cheese
    }
}

class VeggieDecorator extends PizzaDecorator {
    public VeggieDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Veggies";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.75; // Cost for veggies
    }
}

class MeatDecorator extends PizzaDecorator {
    public MeatDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Meat";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 2.00; // Cost for meat
    }
}

// Step 5: Test the Decorator Pattern
public class Assignment2 {
    public static void main(String[] args) {
        // Start with a basic pizza
        Pizza myPizza = new BasicPizza();

        // Add extra cheese
        myPizza = new CheeseDecorator(myPizza);

        // Add veggies
        myPizza = new VeggieDecorator(myPizza);

        // Add meat
        myPizza = new MeatDecorator(myPizza);

        // Display the final order description and cost
        System.out.println("Pizza ordered: " + myPizza.getDescription());
        System.out.println("Total cost: $" + myPizza.getCost());
    }
}
/*
 I have used the Decorator Design Pattern for this implementation because it allows me to add behavior to objects dynamically without modifying their original structure. In the restaurant scenario, this pattern is useful for starting with a basic pizza and adding toppings like cheese, veggies, or meat, all while keeping the core pizza class unchanged. This approach supports the open/closed principle, where the base class remains closed for modification but open for extensions through decorators. Each topping is added by a specific decorator class, following the single responsibility principle, ensuring that each class handles one task—adding a topping. This makes the code modular, flexible, and easy to maintain since I can mix and match toppings without affecting the overall pizza structure. The pattern also promotes composition over inheritance, allowing me to combine different decorators without cluttering the base class. Thus, I chose the Decorator Pattern to achieve a clean, scalable design that accommodates dynamic modifications like adding extra ingredients.
*/
