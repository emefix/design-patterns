package pl.mfilix.design.patterns.creational.abstractfactory;

public class Red implements I_Color {

    @Override
    public void dye() {
        System.out.println("dye with red color");
    }
}
