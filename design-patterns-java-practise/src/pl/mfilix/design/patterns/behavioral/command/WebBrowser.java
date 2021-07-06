package pl.mfilix.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class WebBrowser {

    private List<I_Order> orders;

    public WebBrowser() {
        orders = new ArrayList<>();
    }

    public void takeOrder(I_Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        orders.forEach(I_Order::execute);
        orders.clear();
    }
}
