package baitapbuoi2;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = scanner.nextDouble();

        // Tính chu vi: C = 2 * π * r
        double circumference = 2 * Math.PI * radius;

        // Tính diện tích: S = π * r^2
        double area = Math.PI * radius * radius;

        // In kết quả
        System.out.println("Chu vi hình tròn là: " + circumference);
        System.out.println("Diện tích hình tròn là: " + area);
    }
}
