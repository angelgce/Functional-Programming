
public class Person {

    private String name;
    private String last_name;
    private int age;

    public Person(String name, String last_name, int age){
        this.name = name;
        this.last_name = last_name;
        this.age = age;

    }
    
    public String getName() {
        return name;
    }
    public String getLastName() {
        return last_name;
    }
    public int getAge() {
        return age;
    }

    
    
}