package pl.mfilix.design.patterns.creational.patterns.builder;

/* Concrete Builder class */
public class BreakfastBuilder extends MealBuilder {

    @Override
    public void buildDrink() {

        Drink coffee = new Coffee();
        coffee.additives().addAdditive("milk");
        coffee.additives().addAdditive("sugar");
        meal.setDrink(coffee);
    }

    @Override
    public void buildFood() {

        Food scrambledEggs = new ScrambledEggs();
        scrambledEggs.additives().addAdditive("spinach");
        scrambledEggs.additives().addAdditive("bacon");
        meal.setFood(scrambledEggs);
    }
}
