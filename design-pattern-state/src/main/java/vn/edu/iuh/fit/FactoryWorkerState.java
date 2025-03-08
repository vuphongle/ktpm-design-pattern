package vn.edu.iuh.fit;

public class FactoryWorkerState implements JobState {
    @Override
    public void printJobDetails() {
        System.out.println("- Thực hiện công việc sản xuất.");
        System.out.println("- Giám sát quy trình sản xuất.");
        System.out.println("- Đảm bảo chất lượng sản phẩm.");
    }
}
