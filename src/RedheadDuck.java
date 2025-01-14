import interfaces.Flyable;
import interfaces.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display(){
        System.out.println("Looks like a redhead");
    }
    @Override
    public void fly() {
        System.out.println("Redhead duck flying");
    }

    @Override
    public void quack(){
        System.out.println("Redhead duck quacking");
    }
}
