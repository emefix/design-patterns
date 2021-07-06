package pl.mfilix.design.patterns.creational.abstractfactory;

import pl.mfilix.design.patterns.creational.factory.ClothFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if(choice.equalsIgnoreCase("CLOTH")) {
            return new ClothFactory();
        } else if(choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
