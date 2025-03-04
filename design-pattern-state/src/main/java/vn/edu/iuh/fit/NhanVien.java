package vn.edu.iuh.fit;

public class NhanVien {
    // Các thuộc tính của nhân viên
    String name;
    int age;
    String chucVu;
    CongViecState congViecState;

    // Constructor để khởi tạo các giá trị cho nhân viên
    public NhanVien(String name, int age, String chucVu) {
        this.name = name;
        this.age = age;
        this.chucVu = chucVu;

        // Gán trạng thái công việc ban đầu
        setCongViecState(chucVu);
    }

    // Phương thức thay đổi trạng thái công việc của nhân viên
    public void setCongViecState(String chucVu) {
        switch (chucVu) {
            case "Đội Trưởng":
                congViecState = new DoiTruongState();
                break;
            case "Giám Đốc":
                congViecState = new GiamDocState();
                break;
            case "Nhân Viên VP":
                congViecState = new NhanVienVPState();
                break;
            case "Nhân Viên Xưởng":
                congViecState = new NhanVienXuongState();
                break;
            case "Kế Toán Trưởng":
                congViecState = new KeToanTruongState();
                break;
            default:
                System.out.println("Chức vụ không hợp lệ.");
                break;
        }
    }

    // Phương thức in ra công việc dựa trên chức vụ hiện tại
    public void printCongViec() {
        System.out.println("Nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Công việc:");
        congViecState.printCongViec(this);
    }
}
