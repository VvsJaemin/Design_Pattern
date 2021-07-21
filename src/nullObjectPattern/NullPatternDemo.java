package nullObjectPattern;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("재민");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("길동");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("철수");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("영희");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
