package builder;

public class MealBuilder {

    public Meal prepareBigmackMeal() {
        Meal meal = new Meal();
        meal.addItem(new BigmackBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonBigmackMeal() {
        Meal meal = new Meal();

        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }

}
