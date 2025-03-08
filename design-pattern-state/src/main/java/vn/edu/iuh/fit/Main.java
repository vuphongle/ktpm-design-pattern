package vn.edu.iuh.fit;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nguyen Thi Mai", 28, "Director");

        employee1.printJobDetails();

        System.out.println("\nChanging position to 'Team Leader':");
        employee1.setPosition("Team Leader");
        employee1.printJobDetails();

        System.out.println("\nChanging position to 'Office Employee':");
        employee1.setPosition("Office Employee");
        employee1.printJobDetails();
    }
}
