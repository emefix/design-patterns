package pl.mfilix.design.patterns.behavioral.strategy;

public class Vacuuming implements I_HouseworkStrategy {

    @Override
    public void execute(Room room) {
        System.out.println(room.getName() + " vacuuming...");
    }
}
