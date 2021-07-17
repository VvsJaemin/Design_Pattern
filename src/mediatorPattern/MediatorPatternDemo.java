package mediatorPattern;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        User jaemin = new User("Jaemin");

        User john = new User("John");

        jaemin.sendMessage("안녕 존 뭐해?");
        john.sendMessage("안녕 재민 나 그냥 있어");
    }
}
