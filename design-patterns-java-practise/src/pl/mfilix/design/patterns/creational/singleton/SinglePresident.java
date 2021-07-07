package pl.mfilix.design.patterns.creational.singleton;

public class SinglePresident {

    private static SinglePresident president;
    private String country;
    private String name;

    private SinglePresident() {
    }

    public static SinglePresident getInstance() {
        if (president == null) {
            president = new SinglePresident();
        }
        return president;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "President of " + country + " - " + name;
    }
}
