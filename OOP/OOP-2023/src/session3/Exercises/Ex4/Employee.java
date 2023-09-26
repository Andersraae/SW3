package session3.Exercises.Ex4;

public class Employee extends Person {
    String jobTitle;
    double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}
