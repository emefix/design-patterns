package pl.mfilix.design.patterns.structural.facade;

public class FacadePatternDemo {

    public static void  main(String[] args) {

        ClothMaker clothMaker = new ClothMaker();

        clothMaker.sewJeans();
        clothMaker.sewTshirt();
    }
}
