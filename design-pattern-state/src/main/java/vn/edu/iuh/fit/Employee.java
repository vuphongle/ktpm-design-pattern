package vn.edu.iuh.fit;

public class Employee {
    String name;
    int age;
    String position;
    JobState jobState;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;

        setJobState(position);
    }

    public void setJobState(String position) {
        switch (position) {
            case "Team Leader":
                jobState = new TeamLeaderState();
                break;
            case "Director":
                jobState = new DirectorState();
                break;
            case "Office Employee":
                jobState = new OfficeEmployeeState();
                break;
            case "Factory Worker":
                jobState = new FactoryWorkerState();
                break;
            case "Chief Accountant":
                jobState = new ChiefAccountantState();
                break;
            default:
                System.out.println("Invalid position.");
                break;
        }
    }

    public void printJobDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Job Responsibilities:");
        jobState.printJobDetails();
    }

    public void setPosition(String position) {
        this.position = position;
        setJobState(position);
    }
}
