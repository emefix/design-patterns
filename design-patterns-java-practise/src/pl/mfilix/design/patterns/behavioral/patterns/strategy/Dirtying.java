package pl.mfilix.design.patterns.behavioral.patterns.strategy;

public class Dirtying implements I_HouseworkStrategy {

    @Override
    public void execute(Room room) {
        System.out.println(room.getName() + " dirtying...");
    }
}
