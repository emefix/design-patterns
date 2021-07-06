package pl.mfilix.design.patterns.creational.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Cook cook = new Cook();
        MealBuilder breakfastBuilder = new BreakfastBuilder();
        MealBuilder dinnerBuilder = new DinnerBuilder();

        cook.setMealBuilder(breakfastBuilder);
        cook.prepareMeal();

        Meal meal = cook.getMeal();

        System.out.println(meal);
    }
}
