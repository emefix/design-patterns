package pl.mfilix.design.patterns.creational.abstractfactory;

import pl.mfilix.design.patterns.structural.decorator.I_Cloth;

public class AbstarctFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory clothFactory = FactoryProducer.getFactory("CLOTH");

        I_Cloth cloth1 = clothFactory.getCloth("JEANS");
        cloth1.sew();

        I_Cloth cloth2 = clothFactory.getCloth("TSHIRT");
        cloth2.sew();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        I_Color color1 = colorFactory.getColor("BLUE");
        color1.dye();

        I_Color color2 = colorFactory.getColor("RED");
        color2.dye();
    }
}
