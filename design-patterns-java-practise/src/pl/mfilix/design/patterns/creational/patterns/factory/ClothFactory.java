package pl.mfilix.design.patterns.creational.patterns.factory;

import pl.mfilix.design.patterns.structural.patterns.decorator.I_Cloth;
import pl.mfilix.design.patterns.structural.patterns.decorator.Jeans;
import pl.mfilix.design.patterns.structural.patterns.decorator.Tshirt;

public class ClothFactory {

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
}
