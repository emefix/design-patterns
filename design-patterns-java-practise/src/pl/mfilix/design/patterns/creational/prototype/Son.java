package pl.mfilix.design.patterns.creational.prototype;

public class Son extends FamilyMember {

    public Son() {
        member = "son";
    }

    @Override
    void addMember() {
        System.out.println("Son added. " + getName());
    }
}
