package vn.edu.iuh.fit;

public class TeamLeaderDecorator extends JobDescriptionDecorator {
    public TeamLeaderDecorator(JobDescription jobDescription) {
        super(jobDescription);
    }

    @Override
    public void printJobDetails() {
        super.printJobDetails();
        System.out.println("- Quản lý công việc của đội.");
        System.out.println("- Phân công nhiệm vụ cho các thành viên trong đội.");
        System.out.println("- Đảm bảo tiến độ công việc.");
    }
}
