package djh.learn.java19.practiceStream;


import djh.learn.java19.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StramApiPractice {
    static List<Person> personsList  = Data.getPersonsList();
    public static void main(String[] args) {

        List<Double> salaries = personsList .stream().map(Person::salary).collect(Collectors.toList());
        System.out.println(salaries.stream().mapToDouble(value -> value).sum());
        System.out.println(salaries.stream().mapToDouble(value -> value).max());
        System.out.println(salaries.stream().mapToDouble(value -> value).min());
        System.out.println(salaries.stream().mapToDouble(value -> value).average());

        System.out.println(personsList.stream().map(Person::jobTitle).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println(personsList.stream().filter(person -> person.id() < 20).map(person -> person.id()+"----"+person.name()).collect(Collectors.toList()));
    }
}
