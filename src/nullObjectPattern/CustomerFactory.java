package nullObjectPattern;

public class CustomerFactory {
    public static final String[] names= {"재민", "길동", "철수"};

    public static AbstractCustomer getCustomer(String name){
        for(int i=0;i<names.length; i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
