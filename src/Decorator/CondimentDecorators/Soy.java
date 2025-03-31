package Decorator.CondimentDecorators;

import Decorator.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost(){
        Size coffeSize = beverage.getSize();
        double extraCost = 0;
        switch (coffeSize){
            case TALL:
                extraCost = .10;
                break;
            case GRANDE:
                extraCost = .15;
                break;
            case VENTI:
                extraCost = .20;
                break;
        }
        return this.beverage.cost() + extraCost;
    }

    public String getDescription(){
        return this.beverage.getDescription() + ", Soy";
    }
}
