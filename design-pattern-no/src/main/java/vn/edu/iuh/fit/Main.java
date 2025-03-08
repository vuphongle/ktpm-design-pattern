package vn.edu.iuh.fit;

public class Main {
    public static void main(String[] args) {

        String name = "Nguyen Van A";
        int age = 30;
        String position = "Đội Trưởng";

        Employee nhanVien = new Employee(name, age, position);

        nhanVien.printCongViec();
    }
}