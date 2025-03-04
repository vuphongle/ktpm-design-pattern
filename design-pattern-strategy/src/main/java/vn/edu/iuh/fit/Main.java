package vn.edu.iuh.fit;

public class Main {
    public static void main(String[] args) {
        String name = "Nguyen Van A";
        int age = 30;
        String chucVu = "Đội Trưởng";

        NhanVien nhanVien = new NhanVien(name, age, chucVu);

        nhanVien.printCongViec();

        nhanVien.setCongViecStrategy("Giám Đốc");
        nhanVien.printCongViec();
    }
}
