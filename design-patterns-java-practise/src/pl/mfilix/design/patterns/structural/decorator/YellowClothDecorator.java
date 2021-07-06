package pl.mfilix.design.patterns.structural.decorator;

public class YellowClothDecorator extends ClothDecorator {

    public YellowClothDecorator(I_Cloth decoratedCloth) {
        super(decoratedCloth);
    }

    public void sew() {
        decoratedCloth.sew();
        setYellowColor(decoratedCloth);
    }

    private void setYellowColor(I_Cloth decoratedCloth){
        System.out.println("Color: yellow");
    }
}
