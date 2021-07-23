package visitorPattern;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVistor) {
        computerPartVistor.visit(this);
    }
}
