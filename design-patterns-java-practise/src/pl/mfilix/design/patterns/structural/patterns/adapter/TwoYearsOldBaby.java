package pl.mfilix.design.patterns.structural.patterns.adapter;

public class TwoYearsOldBaby implements I_Toddler {
    @Override
    public void speak2words() {
        System.out.println("Mom, to play.");
    }

    @Override
    public void speak4words() {
        //do nothing
    }
}
