public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("decoy duck");
    }

    @Override
    public void quack() {
        System.out.println("override to do nothing");
    }

    @Override
    public void fly() {
        System.out.println("override to do nothing");
    }
}
