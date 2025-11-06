package baitapjava8streamApi.bai5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceSum {

    public static void main(String[] args) {
        // 1. Dữ liệu đầu vào
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        // 2. Tính tổng bằng reduce
        // 0 là giá trị khởi tạo (identity)
        // (a, b) -> a + b là hàm tích lũy (accumulator)
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        // 3. In kết quả
        System.out.println("Danh sách số: " + numbers);
        System.out.println("Tổng (dùng reduce): " + sum);

        // Cách viết ngắn gọn hơn dùng method reference
        int sumShort = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Tổng (dùng reduce và Integer::sum): " + sumShort);
    }
}