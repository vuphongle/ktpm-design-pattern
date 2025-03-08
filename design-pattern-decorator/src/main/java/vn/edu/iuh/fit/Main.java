package vn.edu.iuh.fit;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nguyen Thi Mai", 28, "Director");

        JobDescription employeeWithDirectorResponsibilities = new DirectorDecorator(employee1);
        employeeWithDirectorResponsibilities.printJobDetails();

        System.out.println("\nChanging position to 'Team Leader':");

        JobDescription employeeWithTeamLeaderResponsibilities = new TeamLeaderDecorator(employee1);
        employeeWithTeamLeaderResponsibilities.printJobDetails();

        System.out.println("\nChanging position to 'Chief Accountant':");

        JobDescription employeeWithChiefAccountantResponsibilities = new ChiefAccountantDecorator(employee1);
        employeeWithChiefAccountantResponsibilities.printJobDetails();
    }
}
