package baitapbuoi2;

import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        System.out.println("Bảng cửu chương của " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }
    }
}

