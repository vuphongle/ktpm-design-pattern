package vn.edu.iuh.fit;

public class Employee {
    String name;
    int age;
    String position;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void printCongViec() {
        System.out.println("Nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chức vụ: " + position);
        System.out.println("Công việc:");

        switch (position) {
            case "Đội Trưởng":
                System.out.println("- Quản lý công việc của đội.");
                System.out.println("- Phân công nhiệm vụ cho các thành viên trong đội.");
                System.out.println("- Đảm bảo tiến độ công việc.");
                break;
            case "Giám Đốc":
                System.out.println("- Quản lý toàn bộ công ty.");
                System.out.println("- Lên kế hoạch phát triển công ty.");
                System.out.println("- Kiểm tra và giám sát các bộ phận trong công ty.");
                break;
            case "Nhân Viên VP":
                System.out.println("- Xử lý các công việc văn phòng.");
                System.out.println("- Hỗ trợ các bộ phận trong công ty.");
                System.out.println("- Chuẩn bị các tài liệu họp hành.");
                break;
            case "Nhân Viên Xưởng":
                System.out.println("- Thực hiện công việc sản xuất.");
                System.out.println("- Giám sát quy trình sản xuất.");
                System.out.println("- Đảm bảo chất lượng sản phẩm.");
                break;
            case "Kế Toán Trưởng":
                System.out.println("- Quản lý tài chính công ty.");
                System.out.println("- Lập báo cáo tài chính.");
                System.out.println("- Kiểm tra và quản lý các khoản thu chi.");
                break;
            default:
                System.out.println("Chức vụ không hợp lệ.");
                break;
        }
    }
}
