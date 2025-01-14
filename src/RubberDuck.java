import interfaces.Quackable;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("Looks like a rubber duck");
    }

    @Override
    public void quack(){
        System.out.println("Rubber duck squeaking");
    }
}
