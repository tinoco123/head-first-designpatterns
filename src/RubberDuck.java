public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Looks like a rubber duck");
    }

    @Override
    public void quack(){
        System.out.println("Overridden to squeak");
    }
}
