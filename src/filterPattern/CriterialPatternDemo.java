package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriterialPatternDemo {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("홍길동", "남성", "어 싱글이야"));
        persons.add(new Person( "태연", "남성", "결혼했어요"));
        persons.add(new Person("타임", "여성", "결혼했어요"));
        persons.add(new Person("로라", "여성", "어 싱글이야"));
        persons.add(new Person("마이크", "남성", "어 싱글이야"));
        persons.add(new Person("바비", "남성", "어 싱글이야"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males : ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales : ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females : ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() +
                    ", Gender : " + person.getGender() +
                    " , Marital Status : " + person.getMaritalStaus() + " ] ");
        }
    }
}
