package baitapjava8streamApi.bai8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

    public static void main(String[] args) {
        // 1. Dữ liệu đầu vào
        List<String> names = Arrays.asList("An", "Bình", "Chi", "Dũng");

        // 2. Nối chuỗi bằng Collectors.joining
        // Chúng ta có thể cung cấp 1, 2 hoặc 3 tham số:
        // .joining(delimiter)
        // .joining(delimiter, prefix, suffix)

        String joinedString = names.stream()
                .collect(Collectors.joining(", ")); // Ngăn cách bởi ", "

        // 3. In kết quả
        System.out.println("Danh sách tên: " + names);
        System.out.println("Chuỗi đã nối: " + joinedString); // An, Bình, Chi, Dũng

        // 4. Ví dụ nâng cao: Thêm tiền tố và hậu tố
        String joinedWithPrefixSuffix = names.stream()
                .collect(Collectors.joining(", ", "Danh sách: [", "]"));

        System.out.println("Chuỗi đã nối (đầy đủ): " + joinedWithPrefixSuffix); // Danh sách: [An, Bình, Chi, Dũng]
    }
}
