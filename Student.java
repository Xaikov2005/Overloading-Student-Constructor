import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

    private String name;
    private int age;

    public Student() {
        name = "no name yet";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Student(String name) {
        this.name = name;
        age = 0;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        Student student = new Student();

        System.out.println("=== 05 Activity 1 BSIT 307 Programmed By : Xai Delos Reyes ===");

        try {
            System.out.print("Enter your name : ");

            String inputName = s.nextLine();

            System.out.print("Enter your age : ");

            Integer inputAge = s.nextInt();

            if (inputName.isEmpty()) {
                System.out.println("You called the constructor with no arguments");
                student = new Student();
                student.display();
            } else if (inputAge == 0) {
                System.out.println("You called the constructor with one argument name");
                student = new Student(inputName);
                student.display();
            } else {
                System.out.println("You called the constructor with arguments name and age");
                student = new Student(inputName, inputAge);
                student.display();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            Student.main(args);
        }
    }

}