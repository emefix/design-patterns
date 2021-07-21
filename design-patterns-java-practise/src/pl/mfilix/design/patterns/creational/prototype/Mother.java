package pl.mfilix.design.patterns.creational.prototype;

public class Mother extends FamilyMember {

    public Mother() {
        member = "mother";
    }

    @Override
    void addMember() {
        System.out.println("Mother added. " + getName());
    }
}
