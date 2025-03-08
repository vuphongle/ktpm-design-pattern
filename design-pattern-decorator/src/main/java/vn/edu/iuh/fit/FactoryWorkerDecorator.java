package vn.edu.iuh.fit;

public class FactoryWorkerDecorator extends JobDescriptionDecorator {
    public FactoryWorkerDecorator(JobDescription jobDescription) {
        super(jobDescription);
    }

    @Override
    public void printJobDetails() {
        super.printJobDetails();
        System.out.println("- Thực hiện công việc sản xuất.");
        System.out.println("- Giám sát quy trình sản xuất.");
        System.out.println("- Đảm bảo chất lượng sản phẩm.");
    }
}
