package pl.mfilix.design.patterns.structural.patterns.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        I_Cloth jeans = new Jeans();
        I_Cloth blueJeans = new BlueClothDecorator(new Jeans());

        I_Cloth tshirt = new Tshirt();
        I_Cloth yellowTshirt = new YellowClothDecorator(new Tshirt());

        System.out.println("Jeans with normal color: ");
        jeans.sew();

        System.out.println("\nBlue jeans:");
        blueJeans.sew();

        System.out.println("\nYellow T-shirt:");
        yellowTshirt.sew();
    }
}
