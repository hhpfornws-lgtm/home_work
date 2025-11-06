package baitapjava8streamApi.bai3;

import java.util.Arrays;
import java.util.List;

public class CountStrings {
    public static void main(String[] args) {
        // 1. Dữ liệu đầu vào
        List<String> names = Arrays.asList("An", "Binh", "Chi", "Dung", "Giang", "Hanh", "Hoa");

        // 2. Lọc và đếm
        long count = names.stream()
                .filter(s -> s.length() > 3) // Lọc các chuỗi có độ dài > 3
                .count();                    // Đếm số lượng phần tử còn lại

        // 3. In kết quả
        System.out.println("Danh sách tên: " + names);
        System.out.println("Số lượng tên có độ dài > 3: " + count); // Kết quả: 4 (Binh, Dung, Giang, Hanh)
    }
}
