import java.util.*;

public class _04_Students {
    public static class Student {
        private String firstName;
        private String lastName;
        private double grade;

        public Student (String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return this.grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade =  Double.parseDouble(studentInfo[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade)
                .reversed());

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
