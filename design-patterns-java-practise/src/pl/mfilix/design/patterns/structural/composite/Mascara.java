package pl.mfilix.design.patterns.structural.composite;

public class Mascara extends Product {

    @Override
    public String name() {
        return "Mascara";
    }

    @Override
    public float price() {
        return 35.50F;
    }
}
