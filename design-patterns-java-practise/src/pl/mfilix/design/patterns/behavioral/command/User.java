package pl.mfilix.design.patterns.behavioral.command;

public class User {

    private String name;
    private Boolean activity;

    public User(String name) {

        this.name = name;
    }

    public void signIn() {
        System.out.println("User [" + name + "] logged in.");
    }

    public void signOut() {
        System.out.println("User [" + name + "] logged out.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isActivity() {
        return activity;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }
}
