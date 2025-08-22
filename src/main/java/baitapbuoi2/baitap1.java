package baitapbuoi2;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        // B1: Tạo Scanner để đọc từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // B2: Nhập 2 số nguyên
        System.out.print("Nhập số a:");
        int a = scanner.nextInt();
        System.out.print("Nhập số b:");
        int b = scanner.nextInt();
        // B3: Tính tổng
        int tong = a + b;
        // B4: In kết quả
        System.out.println("Tổng = " + tong);
        // B5: Đóng scanner
        scanner.close();
    }
}
