package Q01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int instance = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name and questions solved: ");
            String studentName = scanner.next();
            int questionsSolved = scanner.nextInt();
            students.add(new Student(studentName, questionsSolved));
        }

        Collections.sort(students);
        instance++;

        System.out.println();
        System.out.println("Instance " + instance);
        System.out.println(students.get(students.size() - 1).studentName);
        System.out.println();
    }
}


