package vn.edu.iuh.fit;

public class DirectorDecorator extends JobDescriptionDecorator {
    public DirectorDecorator(JobDescription jobDescription) {
        super(jobDescription);
    }

    @Override
    public void printJobDetails() {
        super.printJobDetails();
        System.out.println("- Quản lý toàn bộ công ty.");
        System.out.println("- Lên kế hoạch phát triển công ty.");
        System.out.println("- Kiểm tra và giám sát các bộ phận trong công ty.");
    }
}
