package Decorator.Components;

import Decorator.Beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    public double cost(){
        return .99;
    }

}
