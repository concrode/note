package java8.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Predicate;


/**
 * Reference: https://www.bilibili.com/video/BV1sE411P7C1?p=3
 */
@Data
@AllArgsConstructor
public class Employee {

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    public static Predicate<Employee> ageGreaterThan40 = x -> x.getAge() > 40;
    public static Predicate<Employee> genderM = x -> x.getGender().equalsIgnoreCase("M");
}
