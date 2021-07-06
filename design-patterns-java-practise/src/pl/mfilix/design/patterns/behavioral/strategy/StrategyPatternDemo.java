package pl.mfilix.design.patterns.behavioral.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        Room bathroom = new Bathroom();
        HouseResidentContext kid = new HouseResidentContext(new Dirtying(), bathroom);
        kid.executeHousework();

        HouseResidentContext dad = new HouseResidentContext(new Vacuuming(), bathroom);
        dad.executeHousework();

        Room kitchen = new Kitchen();
        HouseResidentContext mom = new HouseResidentContext(new Cleaning(), kitchen);
        mom.executeHousework();
    }
}
