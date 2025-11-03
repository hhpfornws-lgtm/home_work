package baitapjava8.bai4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Danh sách ban đầu
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Dùng Stream + method reference
        List<Integer> squares = numbers.stream()
                .map(MathUtils::square)       // method reference thay cho (n -> MathUtils.square(n))
                .collect(Collectors.toList());

        // In ra kết quả
        System.out.println("Danh sách bình phương: " + squares);
    }
}
