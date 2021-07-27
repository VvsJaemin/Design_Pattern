package businessDelegatePattern;

public class EJBService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task bu invoking EJB Service");
    }
}
