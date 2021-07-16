package pl.mfilix.design.patterns.structural.proxy;

public class SlowConnection extends Connection {

    public SlowConnection() {

        try {
            System.out.println("Wait 5 sec..");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
