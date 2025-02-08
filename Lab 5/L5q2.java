class Employee {
    private String name;
    private int empid;
    private double salary;

    public Employee() {
        this.name = "xyz";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class L5q2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Angel Kwatra", 1, 5000000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println("Updated Salary: " + emp.getSalary());

        Manager mgr = new Manager("Nakul Yadav", 21, 7000000, "IT");
        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Salary: " + mgr.getSalary());
        System.out.println("Manager Department: " + mgr.getDepartment());
    }
}
