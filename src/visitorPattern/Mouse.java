package visitorPattern;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVistor) {
        computerPartVistor.visit(this);
    }
}
