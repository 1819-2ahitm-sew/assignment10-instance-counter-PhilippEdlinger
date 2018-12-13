
import Person.Person;
public class Instanzenzeahler {


    public static void main(String[] args) {


        Person person1 = new Person("Max", "Mustermann");
        Person person2   = new Person("Mux", "Mastermann");
        Person person3  = new Person("Max", "Mustermunn");
        Person person4  = new Person("Mx", "Mustermunn");
        System.out.println(Person.instanzen);


    }

}
