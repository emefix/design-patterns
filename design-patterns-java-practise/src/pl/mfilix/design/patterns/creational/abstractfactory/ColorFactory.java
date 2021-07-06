package pl.mfilix.design.patterns.creational.abstractfactory;

import pl.mfilix.design.patterns.structural.decorator.I_Cloth;

public class ColorFactory extends AbstractFactory {

    @Override
    public I_Cloth getCloth(String cloth) {
        return null;
    }

    @Override
    public I_Color getColor(String color) {

        if(color == null) {
            return null;
        } else if(color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if(color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
