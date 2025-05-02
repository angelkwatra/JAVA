import studentrecords.Student;  

public class l6q3 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Angel Kwatra", "O");
        Student student2 = new Student(102, "Nakul Yadav", "A+");

        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }
}
