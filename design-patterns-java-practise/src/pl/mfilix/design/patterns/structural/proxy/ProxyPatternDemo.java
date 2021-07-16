package pl.mfilix.design.patterns.structural.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {

//        SlowConnection slowConn = new SlowConnection();
//        ProxySlowConnection proxySlowConn = new ProxySlowConnection();
//
//        FastConnection fastConn = new FastConnection();
//        fastConn.connect();
//
//        proxySlowConn.connect();
//
//        SlowConnection slowConn = new SlowConnection();
//        slowConn.connect();
//
//        SlowConnection slowConn2 = new SlowConnection();
//        slowConn2.connect();
//
//        ProxySlowConnection proxySlowConn2 = new ProxySlowConnection();
//        proxySlowConn2.connect();

        Connection proxySLowConn = new ProxySlowConnection();

        Connection fastConn = new FastConnection();
        fastConn.connect();

        proxySLowConn.connect();
    }
}
