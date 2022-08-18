package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1,"one",900),
                new Student(2,"two",650),
                new Student(3,"three",350)

        );
        studentList.stream()
                .filter(student -> student.marks > 800)
                .forEach(student -> System.out.println(student.name));
        List<Student> studentList1 = studentList.stream()
                .filter(student -> student.marks > 800)
                .collect(Collectors.toList());
        System.out.println(studentList1);
    }
}
class Student{
    Integer roll;
    Integer marks;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Integer roll, String name, Integer marks) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
}
