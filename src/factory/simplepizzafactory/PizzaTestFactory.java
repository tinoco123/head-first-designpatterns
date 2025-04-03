package factory.simplepizzafactory;

public class PizzaTestFactory {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();        
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println(cheesePizza.toString());
    }
}
