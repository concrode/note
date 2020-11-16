package java8;

import java8.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterPredicate {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, 23, "m", "James", "Bond");
        Employee e2 = new Employee(1, 32, "m", "Jrme", "Rond");
        Employee e3 = new Employee(1, 43, "m", "Pames", "Lond");
        Employee e4 = new Employee(1, 44, "m", "Rames", "Sond");
        Employee e5 = new Employee(1, 31, "f", "Qames", "Sond");
        Employee e6 = new Employee(1, 20, "f", "Sames", "Eond");
        Employee e7 = new Employee(1, 65, "m", "Cames", "Jond");
        Employee e8 = new Employee(1, 49, "f", "Games", "Rond");
        Employee e9 = new Employee(1, 37, "m", "Eames", "Qond");
        Employee e10 = new Employee(1, 33, "f", "Tames", "Aond");
        Employee e11 = new Employee(1, 59, "m", "Tames", "Eond");
        Employee e12 = new Employee(1, 46, "m", "Pames", "Pond");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
//
//        List<Employee> sorted = employees.stream().filter(e -> e.getAge() > 35).collect(Collectors.toList());
//        System.out.println(sorted);

        List<Employee> sorted = employees.stream().filter(Employee.ageGreaterThan40.
                and(Employee.genderM)).collect(Collectors.toList());
        System.out.println(sorted);

    }
}
