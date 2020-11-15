package copy;

/**
 * java deep copy vs shallow copy
 *
 * Reference: https://www.bilibili.com/read/cv7349900
 *
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Major major = new Major("Computer Science", 010256);
        Student s1 = new Student("John", 32, major);

        Student s2 = (Student) s1.clone();

        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1.equals(s2):" + s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\n");

        s1.setName("Alex");
        s1.setAge(55);
        major.setMajorName("Database");

        System.out.println(s1);
        System.out.println(s2);

    }
}
