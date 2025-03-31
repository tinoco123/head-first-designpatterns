package Decorator.CondimentDecorators;

import Decorator.Beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
