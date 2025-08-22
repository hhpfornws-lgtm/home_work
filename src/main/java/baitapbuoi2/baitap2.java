package baitapbuoi2;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
    // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    Scanner scanner = new Scanner(System.in);
    // Nhập chiều dài

    System.out.print("Nhập chiều dài: ");
    double length = scanner.nextDouble();
    // Nhập chiều rộng

    System.out.print("Nhập chiều rộng: ");
    double width = scanner.nextDouble();

    // Tính diện tích
    double area = length * width;

    // In kết quả
    System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
