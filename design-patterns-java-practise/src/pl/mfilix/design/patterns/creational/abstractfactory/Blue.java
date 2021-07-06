package pl.mfilix.design.patterns.creational.abstractfactory;

public class Blue implements I_Color {

    @Override
    public void dye() {
        System.out.println("dye with blue color");
    }
}
