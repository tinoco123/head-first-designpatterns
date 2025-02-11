package observer.simpleImplementationByMe;

public class ConcreteObserver implements Observer{
    @Override
    public void update(int state) {
        System.out.println("I have a new state: " + state);
    }
}
