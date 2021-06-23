package pl.mfilix.design.patterns.creational.patterns.builder;

/* Abstract Builder */
public abstract class MealBuilder {

    protected Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public void createNewMeal() {
        meal = new Meal();
    }

    public abstract void buildDrink();
    public abstract void buildFood();
}
