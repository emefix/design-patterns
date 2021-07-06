package pl.mfilix.design.patterns.creational.builder;

public abstract class Drink implements I_Item {

    protected Additives additives;

    public Drink() {
        additives = new Additives();
    }

    @Override
    public Additives additives() {
        return additives;
    }
}
