package baitapjava8.bai5;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Ví dụ 1: Optional có giá trị
        Optional<String> name = Optional.of("Phương");
        name.ifPresentOrElse(
                n -> System.out.println("Tên là: " + n),
                () -> System.out.println("Không có tên")
        );

        // Ví dụ 2: Optional có thể null
        String maybeName = null;
        Optional<String> optionalName = Optional.ofNullable(maybeName);

        // In ra giá trị nếu có, ngược lại in "Không có tên"
        optionalName.ifPresentOrElse(
                n -> System.out.println("Tên là: " + n),
                () -> System.out.println("Không có tên")
        );

        // Dùng orElse() để trả về giá trị mặc định
        String result = optionalName.orElse("N/A");
        System.out.println("Kết quả với orElse(): " + result);
    }
}
