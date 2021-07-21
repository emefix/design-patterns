package pl.mfilix.design.patterns.creational.prototype;

public abstract class FamilyMember implements Cloneable {

    protected String member;
    private String id;
    private String name;

    abstract void addMember();

    public String getMember() {
        return member;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {

        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
