package pl.mfilix.design.patterns.creational.patterns.builder;

/* Concrete Builder class */
public class DinnerBuilder extends MealBuilder {
    @Override
    public void buildDrink() {

        Drink water = new Water();
        water.additives().addAdditive("ice");
        meal.setDrink(water);
    }

    @Override
    public void buildFood() {

        Food soup = new Soup();
        soup.additives().addAdditive("cucumber");
        meal.setFood(soup);
    }
}
