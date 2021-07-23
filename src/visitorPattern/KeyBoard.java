package visitorPattern;

public class KeyBoard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVistor) {
        computerPartVistor.visit(this);
    }
}
