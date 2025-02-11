package observer.simpleImplementationByMe;

public class TestObserver {
    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();

        ConcreteSubject subject = new ConcreteSubject(10);

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        subject.setState(11);
        subject.removeObserver(observer3);
        subject.setState(12);



    }
}
