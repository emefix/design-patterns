package pl.mfilix.design.patterns.behavioral.observer;

public class BearObserver extends Observer {

    public BearObserver(HoneySubject honey) {
        this.honey = honey;
        this.honey.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Bear observer has updated the state of honey to " + honey.getState());
    }
}
