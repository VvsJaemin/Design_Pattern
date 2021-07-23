package templatePattern;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new BaseBall();
        game.play();
        System.out.println();
        game = new FootBall();
        game.play();
    }
}
