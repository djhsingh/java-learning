package djh.learn.java19;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateMethods {
    static List<Employee> employeeList = Data.getEmployeesList();
    public static void main(String[] args) {
      //  System.out.println(employeeList);
        employeeList.stream().limit(5).forEach(System.out::println);
        Stream.of(1,2,3,4,5).map(val->val*5).forEach(System.out::println);
        employeeList.stream().limit(10).map(Employee::gender).forEach(System.out::println);
        System.out.println(employeeList.stream().limit(10).map(Employee::country).distinct().toList());
        System.out.println(employeeList.stream().map(Employee::country).distinct().count());
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::country)));
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::country)).size());

        employeeList.stream().filter((employee) -> employee.gender().equals("Male")).mapToDouble(Employee::salary).forEach(System.out::println);


        employeeList.stream().limit(10).sorted(Comparator.comparingDouble(Employee::salary)).forEach(System.out::println);

    }
}
