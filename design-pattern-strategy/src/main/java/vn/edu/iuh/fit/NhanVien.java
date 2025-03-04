package vn.edu.iuh.fit;

public class NhanVien {
    String name;
    int age;
    String chucVu;
    CongViecStrategy congViecStrategy;

    public NhanVien(String name, int age, String chucVu) {
        this.name = name;
        this.age = age;
        this.chucVu = chucVu;

        setCongViecStrategy(chucVu);
    }

    public void setCongViecStrategy(String chucVu) {
        switch (chucVu) {
            case "Đội Trưởng":
                congViecStrategy = new DoiTruongStrategy();
                break;
            case "Giám Đốc":
                congViecStrategy = new GiamDocStrategy();
                break;
            case "Nhân Viên VP":
                congViecStrategy = new NhanVienVPStrategy();
                break;
            case "Nhân Viên Xưởng":
                congViecStrategy = new NhanVienXuongStrategy();
                break;
            case "Kế Toán Trưởng":
                congViecStrategy = new KeToanTruongStrategy();
                break;
            default:
                System.out.println("Chức vụ không hợp lệ.");
                break;
        }
    }

    public void printCongViec() {
        System.out.println("Nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Công việc:");
        congViecStrategy.printCongViec(this);
    }
}