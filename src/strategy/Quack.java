package strategy;

import strategy.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("strategy.Quack");
    }
}
