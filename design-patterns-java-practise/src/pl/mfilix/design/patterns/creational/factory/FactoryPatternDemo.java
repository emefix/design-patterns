package pl.mfilix.design.patterns.creational.factory;

import pl.mfilix.design.patterns.structural.decorator.I_Cloth;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ClothFactory clothFactory = new ClothFactory();

        //get an object of Jeans and call its method.
        I_Cloth cloth1 = clothFactory.getCloth("Jeans");
        cloth1.sew();

        //get an object of Tshirt and call its method.
        I_Cloth cloth2 = clothFactory.getCloth("Tshirt");
        cloth2.sew();
    }
}
