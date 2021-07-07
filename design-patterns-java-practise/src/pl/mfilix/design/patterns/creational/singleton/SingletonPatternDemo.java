package pl.mfilix.design.patterns.creational.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        SinglePresident presidentInstance = SinglePresident.getInstance();
        presidentInstance.setCountry("Poland");
        presidentInstance.setName("Andrzej Duda");
        System.out.println(presidentInstance);

        SinglePresident presidentInstance2 = SinglePresident.getInstance();
        presidentInstance2.setName("Krzysztof Bosak");
        System.out.println(presidentInstance2);
    }
}
