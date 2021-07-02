package builder;

public class BigmackBurger extends Burger {
    @Override
    public String name() {
        return "Big Mac";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
