package pl.mfilix.design.patterns.behavioral.patterns.strategy;

public class HouseResidentContext {

    private I_HouseworkStrategy houseworkStrategy;
    private Room room;

    public HouseResidentContext(I_HouseworkStrategy houseworkStrategy, Room room) {
        this.houseworkStrategy = houseworkStrategy;
        this.room = room;
    }

    public void executeHousework() {
        houseworkStrategy.execute(room);
    }
}
