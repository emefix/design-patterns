package pl.mfilix.design.patterns.structural.composite;

public class Glasses extends Product {

    @Override
    public String name() {
        return "Glasses";
    }

    @Override
    public float price() {
        return 99.00F;
    }
}
