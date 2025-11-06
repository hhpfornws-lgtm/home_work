package baitapjava8streamApi.bai7;

import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

/**
 * Đây là lớp chính để chạy Bài 7.
 * Vì nó là "public", tên file phải là "MatchCheck.java".
 */
public class MatchCheck {

    public static void main(String[] args) {

        // 1. Dữ liệu đầu vào
        List<Person> people = Arrays.asList(
                new Person("An", 16), // 16 tuổi (> 15, < 18)
                new Person("Bình", 22), // 22 tuổi (> 15)
                new Person("Chi", 30)  // 30 tuổi (> 15)
        );

        System.out.println("Danh sách: " + people);

        // 2. Kiểm tra: "Có ai nhỏ hơn 18 tuổi không?" (anyMatch)
        boolean isAnyoneYoungerThan18 = people.stream()
                .anyMatch(p -> p.getAge() < 18);
        System.out.println("Có ai nhỏ hơn 18 tuổi không? " + isAnyoneYoungerThan18); // Kết quả: true

        // 3. Kiểm tra: "Tất cả mọi người có trên 15 tuổi không?" (allMatch)
        boolean isEveryoneOlderThan15 = people.stream()
                .allMatch(p -> p.getAge() > 15);
        System.out.println("Tất cả mọi người có trên 15 tuổi không? " + isEveryoneOlderThan15); // Kết quả: true
    }
}

/**
 * Lớp Person được định nghĩa ở đây.
 * Lỗi "Cannot resolve symbol" xảy ra vì bạn thiếu định nghĩa này trong file.
 * Chúng ta bỏ "public" để nó có thể nằm chung file với "public class MatchCheck".
 */
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Giúp in danh sách ra cho đẹp
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}