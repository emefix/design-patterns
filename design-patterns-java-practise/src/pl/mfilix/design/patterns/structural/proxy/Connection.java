package pl.mfilix.design.patterns.structural.proxy;

import java.util.Date;

public abstract class Connection {

    public void connect() {
        System.out.println(this.getClass().getSimpleName() + " has been established at " + new Date());
    }
}
