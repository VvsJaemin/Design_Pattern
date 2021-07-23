package visitorPattern;

public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{
                new Mouse(), new KeyBoard(), new Monitor()};
        }


    @Override
    public void accept(ComputerPartVisitor computerPartVistor) {
        for(int i =0; i<parts.length; i++){
            parts[i].accept(computerPartVistor);
        }
        computerPartVistor.visit(this);
    }
}
