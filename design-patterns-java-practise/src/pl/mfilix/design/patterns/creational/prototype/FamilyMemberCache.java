package pl.mfilix.design.patterns.creational.prototype;

import java.util.Hashtable;

public class FamilyMemberCache {

    private static Hashtable<String, FamilyMember> family = new Hashtable<String, FamilyMember>();

    public static FamilyMember getMember(String memberId) {

        FamilyMember cachedMember = family.get(memberId);
        return (FamilyMember) cachedMember.clone();
    }

    public static void loadCache() {

        FamilyMember father = new Father();
        father.setId("1");
        father.setName("Henryk");
        family.put(father.getId(), father);

        FamilyMember mother = new Mother();
        mother.setId("2");
        mother.setName("Helena");
        family.put(mother.getId(), mother);

        FamilyMember son = new Son();
        son.setId("3");
        son.setName("Marcin");
        family.put(son.getId(), son);

        FamilyMember daughter = new Daughter();
        daughter.setId("4");
        daughter.setName("Eliza");
        family.put(daughter.getId(), daughter);

        FamilyMember daughter2 = new Daughter();
        daughter2.setId("5");
        daughter2.setName("Maja");
        family.put(daughter2.getId(), daughter2);
    }
}
