package djh.learn.java19.arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(2,"deepak",2000000);
        Employee e2 = new Employee(5,"ajay",44442);
        Employee e3 = new Employee(3,"sunil",2322422);
        Employee e4 = new Employee(1,"amit",7444);
        Employee e5 = new Employee(6,"rahul",84564);

        List<Employee> employeeList = new ArrayList<>(List.of(e1, e2, e3, e4, e5));
        for (Employee e:employeeList) {
            System.out.println(e);
        }
      //  employeeList.sort(Employee::compareTo);
        System.out.println(employeeList);

        Comparator<Employee> comparator = Comparator.comparingDouble(Employee::salary);
        Comparator<Employee> comparator2 = (a,b)-> Double.compare(a.salary(),b.salary());
        employeeList.sort(comparator);
        System.out.println(employeeList);

    }
}
