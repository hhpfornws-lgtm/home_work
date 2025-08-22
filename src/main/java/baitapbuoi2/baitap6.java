package baitapbuoi2;

import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diem = scanner.nextDouble();

        // Xếp loại
        if (diem >= 8) {
            System.out.println("Xếp loại: Giỏi");
        } else if (diem >= 6.5) {
            System.out.println("Xếp loại: Khá");
        } else if (diem >= 5) {
            System.out.println("Xếp loại: Trung bình");
        } else {
            System.out.println("Xếp loại: Yếu");
        }
    }
}
