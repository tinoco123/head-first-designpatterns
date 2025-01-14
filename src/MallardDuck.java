import interfaces.Flyable;
import interfaces.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Looks like a mallard");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck flying");
    }

    @Override
    public void quack(){
        System.out.println("Mallard duck quacking");
    }
}
