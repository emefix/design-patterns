package pl.mfilix.design.patterns.creational.prototype;

public class Father extends FamilyMember {

    public Father() {
        member = "father";
    }

    @Override
    void addMember() {
        System.out.println("Father added. " + getName());
    }
}
