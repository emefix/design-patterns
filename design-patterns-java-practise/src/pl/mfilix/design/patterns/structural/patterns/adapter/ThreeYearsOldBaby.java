package pl.mfilix.design.patterns.structural.patterns.adapter;

public class ThreeYearsOldBaby implements I_Toddler {
    @Override
    public void speak2words() {
        //do nothing
    }

    @Override
    public void speak4words() {
        System.out.println("Mom, I want to play.");
    }
}
