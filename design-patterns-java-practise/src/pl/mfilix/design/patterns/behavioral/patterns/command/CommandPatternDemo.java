package pl.mfilix.design.patterns.behavioral.patterns.command;

public class CommandPatternDemo {

    public static void main(String[] args) {

        User user = new User("Martita");

        SignIn signInOrder = new SignIn(user);
        SignOut signOutOrder = new SignOut(user);

        WebBrowser webBrowser = new WebBrowser();
        webBrowser.takeOrder(signInOrder);
        webBrowser.takeOrder(signOutOrder);

        webBrowser.placeOrders();

        System.out.println(user.isActivity() ? "active" : "inactive");
    }
}
