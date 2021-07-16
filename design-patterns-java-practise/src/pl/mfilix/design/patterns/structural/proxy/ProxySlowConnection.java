package pl.mfilix.design.patterns.structural.proxy;

import java.util.Date;

public class ProxySlowConnection extends Connection {

    private SlowConnection slowConn;

    public ProxySlowConnection() {
        System.out.println("Creating proxy at " + new Date());
    }

    @Override
    public void connect() {

        if(slowConn == null) {
            slowConn = new SlowConnection();
        }
        slowConn.connect();
    }
}
