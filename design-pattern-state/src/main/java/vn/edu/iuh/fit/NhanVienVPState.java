package vn.edu.iuh.fit;

public class NhanVienVPState implements CongViecState {
    @Override
    public void printCongViec(NhanVien nhanVien) {
        System.out.println("- Xử lý các công việc văn phòng.");
        System.out.println("- Hỗ trợ các bộ phận trong công ty.");
        System.out.println("- Chuẩn bị các tài liệu họp hành.");
    }
}