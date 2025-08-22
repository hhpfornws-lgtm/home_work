package baitapbuoi2;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        // Kiểm tra chẵn/lẻ
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }
}
