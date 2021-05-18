package Excercise1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class java8Example{
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles","Dickends",23),
            new Person("akshay","A",23),
            new Person("Lewis","Carrol",44),
            new Person("Thomas","Carlyle",74),
            new Person("Mathew","Arnold",53)
        );

        //Step 1 : sort list by last name
        Collections.sort(people,(o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
        
        //Step 2 : Create a method that prints all elements in the list

        System.out.println("Printing all the person names in the List");
        printall(people);
        //Step 3 : Create a method that prints all the people that have last name beginning with C
        System.out.println();
        System.out.println("Printing the people who have lastname beginning with C");

        printSome(people,p->p.getLastName().startsWith("C"));
    }

    private static void printSome(List<Person> people,Condition condition){
        for(Person p :people){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

    private static void printall(List<Person> people) {
        for(Person p:people){
            System.out.println(p);
        }
    }
}
