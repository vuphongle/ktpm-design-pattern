package vn.edu.iuh.fit;

public class GiamDocStrategy implements CongViecStrategy {
    @Override
    public void printCongViec(NhanVien nhanVien) {
        System.out.println("- Quản lý toàn bộ công ty.");
        System.out.println("- Lên kế hoạch phát triển công ty.");
        System.out.println("- Kiểm tra và giám sát các bộ phận trong công ty.");
    }
}