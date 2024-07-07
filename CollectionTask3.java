//Write a Student class(rollNum,name,age).  Take the input for each attribute from user(Use Scanner class). Create an arraylist to store 5 students(data for all 5 student should be given by user)

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNum;
    private String name;
    private int age;

    public Student(int rollNum, String name, int age) {
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class CollectionTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Taking input for each student
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNum = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();

            // Creating a Student object and adding it to the ArrayList
            Student student = new Student(rollNum, name, age);
            students.add(student);
        }

        // Displaying the details of all students
        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollNum());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println();
        }

        scanner.close();
    }
}
