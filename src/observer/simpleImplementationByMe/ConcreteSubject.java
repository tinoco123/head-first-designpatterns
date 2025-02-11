package observer.simpleImplementationByMe;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    public int state;
    public ArrayList<Observer> observers = new ArrayList<Observer>();

    public ConcreteSubject(int state){
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(getState());
        }
    }
}
