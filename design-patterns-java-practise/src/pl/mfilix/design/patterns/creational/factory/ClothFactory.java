package pl.mfilix.design.patterns.creational.factory;

import pl.mfilix.design.patterns.creational.abstractfactory.AbstractFactory;
import pl.mfilix.design.patterns.creational.abstractfactory.I_Color;
import pl.mfilix.design.patterns.structural.decorator.I_Cloth;
import pl.mfilix.design.patterns.structural.decorator.Jeans;
import pl.mfilix.design.patterns.structural.decorator.Tshirt;

public class ClothFactory extends AbstractFactory {

    @Override
    public I_Cloth getCloth(String clothType) {

        if(clothType == null) {
            return null;
        } else if(clothType.equalsIgnoreCase("JEANS")) {
            return new Jeans();
        } else if(clothType.equalsIgnoreCase("TSHIRT")) {
            return new Tshirt();
        }
        return null;
    }

    @Override
    public I_Color getColor(String color) {
        return null;
    }
}
