package pl.mfilix.design.patterns.creational.prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {

        FamilyMemberCache.loadCache();

        FamilyMember clonedMember = (Father) FamilyMemberCache.getMember("1");
        clonedMember.addMember();

        FamilyMember clonedMember2 = (Mother) FamilyMemberCache.getMember("2");
        clonedMember2.addMember();

        FamilyMember clonedMember3 = (Son) FamilyMemberCache.getMember("3");
        clonedMember3.addMember();

        FamilyMember clonedMember4 = (Daughter) FamilyMemberCache.getMember("4");
        clonedMember4.addMember();

        FamilyMember clonedMember5 = (Daughter) FamilyMemberCache.getMember("5");
        clonedMember5.addMember();
    }
}
