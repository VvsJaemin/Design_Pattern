package templatePattern;

public class BaseBall extends Game{
    @Override
    void initialize() {
        System.out.println("야구게임을 초기화합니다 게임을 시작하세요");
    }

    @Override
    void startPlay() {
        System.out.println("야구게임이 시작됐습니다 즐거운 게임 하세요");
    }

    @Override
    void endPlay() {
        System.out.println("야구게임이 끝났습니다.");
    }
}
