package DEMO.generic.generic_method;

public class Student {
    private String name;
    private int point;

    public Student(String name, int age) {
        this.name = name;
        this.point = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
}
