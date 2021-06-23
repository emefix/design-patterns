package pl.mfilix.design.patterns.behavioral.patterns.command;

public class SignOut implements I_Order {

    private User user;

    public SignOut(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        user.signOut();
        user.setActivity(false);
    }
}
