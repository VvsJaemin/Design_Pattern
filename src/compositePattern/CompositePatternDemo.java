package compositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("존", "CEO", 30000000);

        Employee headSales = new Employee("로버트", "부사장", 10000000);

        Employee headMarketing = new Employee("마이크", "마케팅 총괄", 5000000);

        Employee clerk1 = new Employee("로라", "마케팅부", 10000);
        Employee clerk2 = new Employee("밥", "마케팅부", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }
}
