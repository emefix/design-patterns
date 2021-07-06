package pl.mfilix.design.patterns.structural.decorator;

public class Tshirt implements I_Cloth {

    @Override
    public void sew() {
        System.out.println("sew T-shirt");
    }
}
