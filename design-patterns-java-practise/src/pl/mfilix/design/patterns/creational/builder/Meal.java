package pl.mfilix.design.patterns.creational.builder;

/* Product */
public class Meal {

    private Drink drink;
    private Food food;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String toString() {

        return "Meal: \n\tdrink: " + drink.name()
                + " with " + drink.additives()
                + ", \n\tfood: " + food.name()
                + " with " + food.additives();
    }
}
