class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

class Staff extends Person {
    protected String staffId;
    protected String department;

    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Staff ID: " + staffId + ", Department: " + department);
    }
}

class Professor extends Staff {
    private String specialization;

    public Professor(String name, int age, String address, String staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization);
    }
}

class Student extends Person {
    protected String studentId;
    protected String course;

    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Course: " + course);
    }
}

class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, String studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }

    public void submitThesis() {
        System.out.println(name + " has submitted a thesis on " + researchTopic);
    }
}

public class L5q3 {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Professor("Lakshya", 35, "Rishikesh Uttrakhand", "p001", "Computer Science", "Cloud Computing");
        people[1] = new GraduateStudent("Angel", 20, "Upes Bidholi Ddn", "p011", "Btech. Computer Science", "Cloud Computing");

        for (Person person : people) {
            person.displayInfo();
            if (person instanceof Professor) {
                ((Professor) person).conductLecture();
            } else if (person instanceof GraduateStudent) {
                ((GraduateStudent) person).submitThesis();
            }
            System.out.println();
        }
    }
}
