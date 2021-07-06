package pl.mfilix.design.patterns.structural.decorator;

public class Jeans implements I_Cloth {

    @Override
    public void sew() {
        System.out.println("sew jeans");
    }
}
