import java.util.Arrays;
import java.util.List;

import Excercise1.Person;

public class StreamEg{
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles","Dickends",23),
            new Person("akshay","A",23),
            new Person("Lewis","Carrol",44),
            new Person("Thomas","Carlyle",74),
            new Person("Mathew","Arnold",53)
        );

        people.stream()
        .limit(3)
        .forEach(System.out::println);

        

    }
}