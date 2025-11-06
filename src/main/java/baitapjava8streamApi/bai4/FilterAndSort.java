package baitapjava8streamApi.bai4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSort {
    public static void main(String[] args) {
        // 1. Dữ liệu đầu vào (có cả null và rỗng)
        List<String> names = Arrays.asList("Linh", "", "Tuấn", null, "Anh", "Minh", null, "Bảo");

        // 2. Lọc và sắp xếp
        List<String> cleanedAndSortedNames = names.stream()
                .filter(s -> s != null && !s.isEmpty()) // Lọc bỏ null VÀ chuỗi rỗng
                .sorted()                               // Sắp xếp theo thứ tự tự nhiên (bảng chữ cái)
                .collect(Collectors.toList());          // Thu thập kết quả

        // 3. In kết quả
        System.out.println("Danh sách ban đầu: " + names);
        System.out.println("Danh sách đã lọc và sắp xếp: " + cleanedAndSortedNames);
    }
}
