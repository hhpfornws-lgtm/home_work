package baitapbuoi2;

import java.util.Scanner;

public class baitap10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải năm nhuận");
        }
    }
}
