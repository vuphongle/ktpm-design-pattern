package vn.edu.iuh.fit;

public class Employee implements JobDescription {
    private String name;
    private int age;
    private String position;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public void printJobDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}
