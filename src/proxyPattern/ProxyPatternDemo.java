package proxyPattern;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("a.jpg");

        image.display();
        System.out.println("");

        image.display();
    }


}
