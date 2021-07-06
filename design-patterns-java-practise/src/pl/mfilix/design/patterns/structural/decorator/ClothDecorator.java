package pl.mfilix.design.patterns.structural.decorator;

public abstract class ClothDecorator implements I_Cloth {

    protected I_Cloth decoratedCloth;

    public ClothDecorator(I_Cloth decoratedCloth) {
        this.decoratedCloth = decoratedCloth;
    }

    @Override
    public void sew() {
        decoratedCloth.sew();
    }
}
