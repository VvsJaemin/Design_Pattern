package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> singlePersons = new ArrayList<Person>();

        for(Person person : persons){
            if(person.getMaritalStaus().equalsIgnoreCase("어 싱글이야!"))
                singlePersons.add(person);
        }

        return singlePersons;
    }
}
