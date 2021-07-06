package pl.mfilix.design.patterns.structural.adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        Baby baby = new Baby();

        baby.speak(1);
        baby.speak(2);
        baby.speak(3);
        baby.speak(4);
    }
}
