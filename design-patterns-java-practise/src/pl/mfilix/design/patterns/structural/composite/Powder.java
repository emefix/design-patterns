package pl.mfilix.design.patterns.structural.composite;

public class Powder extends Product {

    @Override
    public String name() {
        return "Powder";
    }

    @Override
    public float price() {
        return 26.90F;
    }
}
