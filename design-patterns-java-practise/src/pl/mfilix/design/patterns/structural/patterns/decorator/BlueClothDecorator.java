package pl.mfilix.design.patterns.structural.patterns.decorator;

public class BlueClothDecorator extends ClothDecorator {

    public BlueClothDecorator(I_Cloth decoratedCloth) {
        super(decoratedCloth);
    }

    public void sew() {
        decoratedCloth.sew();
        setBlueColor(decoratedCloth);
    }

    private void setBlueColor(I_Cloth decoratedCloth) {
        System.out.println("Color: blue");
    }
}
