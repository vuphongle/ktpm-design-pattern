package vn.edu.iuh.fit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Thông tin nhân viên
        String name = "Nguyen Van A";
        int age = 30;
        String chucVu = "Đội Trưởng";

        // Tạo đối tượng nhân viên
        NhanVien nhanVien = new NhanVien(name, age, chucVu);

        // In ra thông tin và công việc của nhân viên
        nhanVien.printCongViec();
    }
}
