package baitapbuoi2;

import java.util.Scanner;

public class baitap9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        long factorial = 1; // dùng long để tránh tràn số với n lớn
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
    }
}
