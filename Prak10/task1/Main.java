import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Student<?>> studentList = new ArrayList<>();
        studentList.add(new Student<>("S001", "Evan", "Computer Science", "Jakarta"));
        studentList.add(new Student<>("S002", "Alice", 101, "Bandung"));
        studentList.add(new Student<>("S003", "David", "Information Systems", "Surabaya"));
        studentList.add(new Student<>("S004", "Bob", 102, "Yogyakarta"));
        studentList.add(new Student<>("S005", "Charlie", "Computer Science", "Medan"));

        studentList.sort(Comparator.comparing(Student::getName));

        System.out.println("Sorted Students in ArrayList (by Name):");
        for (Student<?> student : studentList) {
            System.out.println(student);
        }

        System.out.println();

        Vector<Student<?>> studentVector = new Vector<>();
        studentVector.add(new Student<>("S006", "Frank", "Computer Science", "Bandung"));
        studentVector.add(new Student<>("S007", "Grace", 101, "Jakarta"));
        studentVector.add(new Student<>("S008", "Hannah", "Information Systems", "Yogyakarta"));
        studentVector.add(new Student<>("S009", "Ian", "Computer Science", "Surabaya"));
        studentVector.add(new Student<>("S010", "Jack", 102, "Semarang"));

        System.out.println("Students in Computer Science Department (from Vector):");
        for (Student<?> student : studentVector) {
            if ("Computer Science".equalsIgnoreCase(String.valueOf(student.getDepartment()))) {
                System.out.println(student);
            }
        }
    }
}
