package builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal bigMackMeal = mealBuilder.prepareBigmackMeal();
        System.out.println("Big Mack 먹자");
        bigMackMeal.showItems();

        System.out.println("결제 하실 금액은 : " + bigMackMeal.getCost());

        Meal nonBigMackMeal = mealBuilder.prepareNonBigmackMeal();

        System.out.println("\n\n 치킨 버거 먹자");

        nonBigMackMeal.showItems();

        System.out.println("결제 하실 금액은 : " + nonBigMackMeal.getCost());
    }
}
