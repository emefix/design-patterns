package pl.mfilix.design.patterns.structural.adapter;

public class BabyAdapter implements I_Baby {

    private I_Toddler toddler;

    public BabyAdapter(int age) {

        if(age == 2) {
            toddler = new TwoYearsOldBaby();
        } else if(age == 3) {
            toddler = new ThreeYearsOldBaby();
        }
    }
    @Override
    public void speak(int age) {

        if(age == 2) {
            toddler.speak2words();
        } else if(age == 3) {
            toddler.speak4words();
        }
    }
}
