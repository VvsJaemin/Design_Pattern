package bridgePattern;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawClrcle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
