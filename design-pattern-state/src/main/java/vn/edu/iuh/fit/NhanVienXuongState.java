package vn.edu.iuh.fit;

public class NhanVienXuongState implements CongViecState {
    @Override
    public void printCongViec(NhanVien nhanVien) {
        System.out.println("- Thực hiện công việc sản xuất.");
        System.out.println("- Giám sát quy trình sản xuất.");
        System.out.println("- Đảm bảo chất lượng sản phẩm.");
    }
}