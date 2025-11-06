package baitapjava8streamApi.bai1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        // 1. Dữ liệu đầu vào
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        // 2. Sử dụng Stream API để lọc
        List<Integer> evenNumbers = numbers.stream() // Chuyển danh sách thành một luồng (stream)
                .filter(n -> n % 2 == 0) // Áp dụng bộ lọc: giữ lại nếu n % 2 == 0
                .collect(Collectors.toList()); // Thu thập kết quả vào một List mới

        // 3. In kết quả
        System.out.println("Danh sách ban đầu: " + numbers);
        System.out.println("Danh sách số chẵn đã lọc: " + evenNumbers);
    }
}
