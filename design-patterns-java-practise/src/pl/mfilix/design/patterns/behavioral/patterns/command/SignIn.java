package pl.mfilix.design.patterns.behavioral.patterns.command;

public class SignIn implements I_Order {

    private User user;

    public SignIn(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        user.signIn();
        user.setActivity(true);
    }
}
