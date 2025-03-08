package vn.edu.iuh.fit;

public class Employee {
    private String name;
    private int age;
    private String position;
    private JobStrategy jobStrategy;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        setJobStrategy(position);
    }

    public void setJobStrategy(String position) {
        switch (position) {
            case "Team Leader":
                this.jobStrategy = new TeamLeaderStrategy();
                break;
            case "Director":
                this.jobStrategy = new DirectorStrategy();
                break;
            case "Office Employee":
                this.jobStrategy = new OfficeEmployeeStrategy();
                break;
            case "Factory Worker":
                this.jobStrategy = new FactoryWorkerStrategy();
                break;
            case "Chief Accountant":
                this.jobStrategy = new ChiefAccountantStrategy();
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
        jobStrategy.printJobDetails();
    }

    public void setPosition(String position) {
        this.position = position;
        setJobStrategy(position);
    }
}
