import java.util.Arrays;
import java.util.List;

import Excercise1.Person;

class Foreach{
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles","Dickends",23),
            new Person("akshay","A",23),
            new Person("Lewis","Carrol",44),
            new Person("Thomas","Carlyle",74),
            new Person("Mathew","Arnold",53)
        );

        System.out.println("Printing the elements using foreach external iterator");
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("Printing the elements using foreach internal iterator");
        people.forEach(System.out::println);
    }
}