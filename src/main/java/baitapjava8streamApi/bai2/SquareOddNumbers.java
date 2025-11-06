package baitapjava8streamApi.bai2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOddNumbers {
    public static void main(String[] args) {
        // 1. Dữ liệu đầu vào
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 2. Sử dụng Stream API để lọc và biến đổi
        List<Integer> squaredOddNumbers = numbers.stream() // Bắt đầu stream
                .filter(n -> n % 2 != 0) // Lọc: Chỉ giữ lại số lẻ (n % 2 != 0)
                .map(n -> n * n)         // Biến đổi: Tính bình phương (n * n)
                .collect(Collectors.toList()); // Thu thập kết quả

        // 3. In kết quả
        System.out.println("Danh sách ban đầu: " + numbers);
        System.out.println("Danh sách bình phương các số lẻ: " + squaredOddNumbers);
    }
}
