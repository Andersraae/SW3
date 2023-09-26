package session3.Exercises.Ex4;

public class Manager extends Employee {
    double bonus;

    public Manager(String name, int age, String jobTitle, double salary, double bonus) {
        super(name, age, jobTitle, salary);
        this.bonus = bonus;
    }
}
