package pl.mfilix.design.patterns.structural.patterns.decorator;

public class Jeans implements I_Cloth {

    @Override
    public void sew() {
        System.out.println("Cloth: jeans");
    }
}