package pl.mfilix.design.patterns.creational.abstractfactory;

import pl.mfilix.design.patterns.structural.decorator.I_Cloth;

public abstract class AbstractFactory {

    public abstract I_Cloth getCloth(String cloth);
    public abstract I_Color getColor(String color);
}
