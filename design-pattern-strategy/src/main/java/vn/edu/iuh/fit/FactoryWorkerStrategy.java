package vn.edu.iuh.fit;

public class FactoryWorkerStrategy implements JobStrategy {
    @Override
    public void printJobDetails() {
        System.out.println("- Thực hiện công việc sản xuất.");
        System.out.println("- Giám sát quy trình sản xuất.");
        System.out.println("- Đảm bảo chất lượng sản phẩm.");
    }
}
