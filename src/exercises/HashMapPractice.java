package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or Enter to finish):");

        do {
            System.out.println("student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID: ");
                int studentId = input.nextInt();
                students.put(studentId, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));
        System.out.println(students.size());

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " - " + student.getKey());
        }
    }
}
