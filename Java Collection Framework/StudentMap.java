import java.util.TreeMap;
import java.util.Map;
class Student {
    String name;
    String major;
    double gpa;

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa;
    }
}
public class StudentMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students = new TreeMap<>();
        students.put(103, new Student("Alice", "CS", 3.8));
        students.put(101, new Student("Bob", "Math", 3.5));
        students.put(105, new Student("Charlie", "Physics", 3.9));
        students.put(102, new Student("David", "CS", 3.2));
        System.out.println("Student Records (Sorted by ID):");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
        }
    }
}