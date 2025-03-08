package vn.edu.iuh.fit;

public class ChiefAccountantStrategy implements JobStrategy {
    @Override
    public void printJobDetails() {
        System.out.println("- Quản lý tài chính công ty.");
        System.out.println("- Lập báo cáo tài chính.");
        System.out.println("- Kiểm tra và quản lý các khoản thu chi.");
    }
}
