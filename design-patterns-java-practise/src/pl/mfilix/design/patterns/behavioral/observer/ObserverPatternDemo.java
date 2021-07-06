package pl.mfilix.design.patterns.behavioral.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        HoneySubject honey = new HoneySubject();

        new BearObserver(honey);
        new BeeObserver(honey);

        System.out.println("First state change of honey: 5");
        honey.setState(5);

        System.out.println("Second state change of honey: 27");
        honey.setState(27);
    }
}
