package pl.mfilix.design.patterns.creational.prototype;

public class Daughter extends FamilyMember {

    public Daughter() {
        member = "daughter";
    }

    @Override
    void addMember() {
        System.out.println("Daughter added. " + getName());
    }
}
