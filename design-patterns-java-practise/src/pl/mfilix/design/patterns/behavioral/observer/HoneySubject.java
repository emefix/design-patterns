package pl.mfilix.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class HoneySubject {

    private List<Observer> observers;
    private int state;

    public HoneySubject() {
        this.observers = new ArrayList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }
}
