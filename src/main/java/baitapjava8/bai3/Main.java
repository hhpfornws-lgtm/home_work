package baitapjava8.bai3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 1. Lấy danh sách số chẵn
        List<Integer> evenNumbers = numbers.stream()       // tạo Stream từ List
                .filter(n -> n % 2 == 0)                   // lọc ra số chẵn
                .collect(Collectors.toList());             // thu kết quả về List

        // 2. Tạo danh sách bình phương các số > 3
        List<Integer> squares = numbers.stream()           // tạo Stream mới
                .filter(n -> n > 3)                        // lọc điều kiện
                .map(n -> n * n)                           // chuyển mỗi phần tử thành bình phương
                .collect(Collectors.toList());             // thu về List

        System.out.println("Số chẵn: " + evenNumbers);
        System.out.println("Bình phương (>3): " + squares);
    }
}
