import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //creatin new persons
        Person person1 = new Person("Angel", "Chavez", 26);
        Person person2 = new Person("Angel", "Elizondo", 65);
        Person person3 = new Person("Juan", "Chavez", 60);
        Person person4 = new Person("Lily", "Elizondo", 61);
        Person person5 = new Person("Crista", "Perez", 26);
        //list of persons
        List<Person> list_person = new ArrayList<>();
        list_person.add(person1);
        list_person.add(person2);
        list_person.add(person3);
        list_person.add(person4);
        list_person.add(person5);
        //printing in console their names
        list_person.forEach(person -> System.out.print(person.getName()+",  "));
        System.out.print(" <- List of names \n");
        //creating predicates
        Predicate<Person> predicate_EqualName = person -> person.getName().equals("Angel"); //name equals to Angel
        Predicate<Person> predicate_legalAge = person -> person.getAge() > 18;
        Predicate<Person> predicate_under60 = person -> person.getAge() < 60;
        Predicate<Person> predicate_And = predicate_EqualName.and(predicate_under60);
        Predicate<Person> predicate_Or = predicate_EqualName.or(predicate_under60);
        Predicate<Person> predicate_negate = predicate_EqualName.negate();
        //printing predicates
        list_person.stream().filter(predicate_EqualName).forEach(person ->System.out.print(person.getLastName()+" , "));
        System.out.println(" <- Predicate(Angel)");
        list_person.stream().filter(predicate_legalAge).forEach(person ->System.out.print(person.getName()+" has " +person.getAge() +" , "));
        System.out.println(" <- Predicate(> 18)");
        list_person.stream().filter(predicate_under60).forEach(person ->System.out.print(person.getName()+" has " +person.getAge() +" , "));
        System.out.println(" <- Predicate(<60)");
        list_person.stream().filter(predicate_And).forEach(person ->System.out.print(person.getName()+" has " +person.getAge() +" , "));
        System.out.println(" <- Predicate(Angel and < 60)");
        list_person.stream().filter(predicate_Or).forEach(person ->System.out.print(person.getName()+" has " +person.getAge() +" , "));
        System.out.println(" <- Predicate(Angel or < 60)");
        list_person.stream().filter(predicate_negate).forEach(person ->System.out.print(person.getName()+" has " +person.getAge() +" , "));
        System.out.println(" <- Predicate(name not equla to Angel)");


    }
    
}
