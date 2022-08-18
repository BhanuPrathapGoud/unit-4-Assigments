package com.question1;
import java.util.Objects;
import java.util.Scanner;
public class Course {
    private int courseID;
    private String courseName;
    private int courseFee;
    private void displayCourseDetails(){
        System.out.println(courseID);
        System.out.println(courseName);
        System.out.println(courseFee);
    }
    private static void authenticate(int courseID,String courseName,int courseFee,Course student ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your User Name");
        String user = scanner.nextLine();
        System.out.println("Enter your Password Name");
        String pass = scanner.nextLine();
        if(Objects.equals(user, "Admin") && Objects.equals(pass, "1234")){
            student.courseID = courseID;
            student.courseName = courseName;
            student.courseFee = courseFee;
            student.displayCourseDetails();
        } else {
            System.out.println("Invalid Username or password");
        }
    }
    public static void main(String[] args) {
        Course student1 = new Course();
        authenticate(12,"DSA",120000,student1);

        Course student2 = new Course();
        authenticate(12,"JAVA",80000,student2);

        Course student3 = new Course();
        authenticate(12,"PYTHON",80000,student3);

    }
}
