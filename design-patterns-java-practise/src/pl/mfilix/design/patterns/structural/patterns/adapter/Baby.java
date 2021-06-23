package pl.mfilix.design.patterns.structural.patterns.adapter;

public class Baby implements I_Baby {

    private BabyAdapter babyAdapter;

    @Override
    public void speak(int age) {

        if(age <= 1) {
            System.out.println("Mom.");
        } else if(age == 2 || age == 3) {
            babyAdapter = new BabyAdapter(age);
            babyAdapter.speak(age);
        } else {
            System.out.println("Invalid age. " + age + " years old not supported!");
        }
    }
}
