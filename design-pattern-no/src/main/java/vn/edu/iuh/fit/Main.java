package vn.edu.iuh.fit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin nhân viên
//        System.out.println("Nhập tên nhân viên:");
//        String name = scanner.nextLine();
//
//        System.out.println("Nhập tuổi nhân viên:");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Nhập chức vụ của nhân viên (Đội Trưởng, Giám Đốc, Nhân Viên VP, Nhân Viên Xưởng, Kế Toán Trưởng):");
//        String chucVu = scanner.nextLine();

        String name = "Nguyen Van A";
        int age = 30;
        String chucVu = "Đội Trưởng";

        // Tạo đối tượng nhân viên
        NhanVien nhanVien = new NhanVien(name, age, chucVu);

        // In ra thông tin và công việc của nhân viên
        nhanVien.printCongViec();
    }
}