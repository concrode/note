package copy;

/**
 * java deep copy vs shallow copy
 *
 * Reference: https://www.bilibili.com/read/cv7349900
 *
 */
public class Student implements Cloneable{

    private String name;
    private int age;
    private Major major;

    /**
     * This is shallow copy
     *
     * @return
     * @throws CloneNotSupportedException
     */
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    /**
     * This is deep copy
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.major = (Major) major.clone();

        return student;
    }


    public Student(String name, int age, Major major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "name:" + name + "/age:" + age + "/major.name:" +
                major.getMajorName() + "/major.id:" + major.getMajorId() ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
