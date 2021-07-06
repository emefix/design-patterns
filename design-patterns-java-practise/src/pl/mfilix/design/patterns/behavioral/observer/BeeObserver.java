package pl.mfilix.design.patterns.behavioral.observer;

public class BeeObserver extends Observer {

    public BeeObserver(HoneySubject honey) {
        this.honey = honey;
        this.honey.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Bee observer has updated the state of honey to " + honey.getState());
    }
}
