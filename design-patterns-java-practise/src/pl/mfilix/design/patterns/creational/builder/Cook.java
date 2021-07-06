package pl.mfilix.design.patterns.creational.builder;

/* Director */
public class Cook {

    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

    public void prepareMeal() {
        mealBuilder.createNewMeal();
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
    }
}
