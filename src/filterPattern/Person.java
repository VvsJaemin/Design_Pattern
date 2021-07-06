package filterPattern;

public class Person {

    private String name;
    private String gender;
    private String maritalStaus;

    public Person(String name, String gender, String maritalStaus){
        this.name =name;
        this.gender=gender;
        this.maritalStaus =maritalStaus;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getMaritalStaus(){
        return maritalStaus;
    }
}
