package flyweightPattern;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        String colors[] = {"Red", "Green", "Blue", "White", "Black"};
        for(int i =0; i<10; ++i){
            Circle circle = (Circle) ShapeFactory.getCircle(colors[(int)(Math.random()*4)]);
            circle.setX((int)(Math.random()*100));
            circle.setY((int)(Math.random()*10));
            circle.setRadius(100);
            circle.draw();
        }

    }

}
