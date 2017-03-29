
import java.util.Scanner;

/**
 * Created by DisNoire on 18.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        Student student = Student.newStudent();
        activities(student);
    }

    public static void activities(Student student) {
        String op = "something";
        Scanner scanner = new Scanner(System.in);
        Homework homework = new Homework();
        while(!op.equals("end")) {
            op = scanner.nextLine();
            if(op.equals("name")) {
                System.out.println(student.getName());
            }
            if(op.equals("course")) {
                System.out.println(student.getCourse());
            }
            if(op.equals("age")) {
                System.out.println(student.getAge());
            }
            if(op.equals("uni")) {
                student.getUniversity();
            }
            if(op.equals("homework")) {
                op = scanner.nextLine();
                if(op.equals("done")) {
                    Student.homeworkDone(homework,student);
                }
            }
            if(op.equals("points")) {
                System.out.println(student.getPoints());
            }
            if(op.equals("move")) {
                student.moveStudentInAnotherUniversity(scanner);
                System.out.println("Student moved");
            }
            if(op.equals("kick")) {
                student.kickStudentfromUniversity();
                System.out.println("Student kicked");
            }
        }
    }
}
