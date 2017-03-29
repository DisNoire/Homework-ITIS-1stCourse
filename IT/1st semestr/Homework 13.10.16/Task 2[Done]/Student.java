
import java.util.Scanner;

/**
 * Created by DisNoire on 18.10.2016.
 */
public class Student {
    University university;
    int course;
    String name;
    int age;
    int points;

    Student(String name, int age, int course) {
        this.setName(name);
        this.setAge(age);
        this.setCourse(course);
        this.setPoints(0);
        University university = new University();
        this.setUniversity(university);
    }

    public static Student newStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name:");
        String name = scanner.nextLine();
        System.out.println("Age:");
        int age = scanner.nextInt();
        System.out.println("Course:");
        int course = scanner.nextInt();
        return new Student(name, age, course);
    }

    public void kickStudentfromUniversity() {
        this.university = new University("Kicked");
    }

    public void moveStudentInAnotherUniversity(Scanner scanner) {
        this.university = new University(scanner.nextLine());
    }

    public void getUniversity() {                           //усовершенствованный геттер
        if(this.university.getName() == "Kicked") {
            System.out.println("Student not learning in University");
        }
        else {
            System.out.println(this.university.getName());
        }
    }

    public static void homeworkDone(Homework homework,Student student){
        homework.setDone(true);
        student.addPoints();
    }

    public void addPoints() {
        this.points += 1;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public int getAge() {
        return this.age;
    }

    public int getCourse() {
        return this.course;
    }

    public String getName() {
        return this.name;
    }
}

