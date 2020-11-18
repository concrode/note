package java8;

import java8.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Milan", "london", "Shanghai", "Sydney", "Tokyo", "Perth");

        System.out.println(cities);

        cities.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(cities);

        cities.sort(Comparator.naturalOrder());
        System.out.println(cities);

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
        /**
         * 1. All Ascend, no reversed() needed
         * 2. All Desc, add reversed() at last [This case]
         * 3. First Desc, then adding reversed() firstly, then Ascend
         * 4. First Ascend, then adding reversed() firstly, Second Desc, then adding reversed() again
         */
        employees.sort(Comparator.comparing(Employee::getGender)
                .thenComparingInt(Employee::getAge)
                .reversed()
        );

        employees.forEach(System.out::println);


    }

}
