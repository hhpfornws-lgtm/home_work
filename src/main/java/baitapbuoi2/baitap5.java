package baitapbuoi2;

import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 số nguyên
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();

        // Giả sử ban đầu số lớn nhất là a
        int max = a;

        // So sánh với b
        if (b > max) {
            max = b;
        }

        // So sánh với c
        if (c > max) {
            max = c;
        }

        System.out.println("Số lớn nhất là: " + max);
    }
}
