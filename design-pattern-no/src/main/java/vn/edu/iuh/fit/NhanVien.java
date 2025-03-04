package vn.edu.iuh.fit;

public class NhanVien {
    // Các thuộc tính của nhân viên
    String name;
    int age;
    String chucVu;

    // Constructor để khởi tạo các giá trị cho nhân viên
    public NhanVien(String name, int age, String chucVu) {
        this.name = name;
        this.age = age;
        this.chucVu = chucVu;
    }

    // Phương thức in ra công việc dựa trên chức vụ
    public void printCongViec() {
        System.out.println("Nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Công việc:");

        switch (chucVu) {
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
