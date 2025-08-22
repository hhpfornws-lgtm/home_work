package baitapbuoi2;

import java.util.Scanner;

public class baitap8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // cộng dồn
        }

        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
    }
}
