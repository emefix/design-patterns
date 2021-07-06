package pl.mfilix.design.patterns.creational.builder;

public abstract class Food implements I_Item {

    protected Additives additives;

    public Food() {
        additives = new Additives();
    }

    @Override
    public Additives additives() {
        return additives;
    }
}
