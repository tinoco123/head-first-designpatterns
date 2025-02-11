package strategy;

import strategy.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("strategy.Squeak");
    }
}
