package baitapjava8streamApi.bai6;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

// 1. Định nghĩa lớp Person
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

class ProcessPerson {

    public static void main(String[] args) {
        // 2. Dữ liệu đầu vào
        List<Person> people = Arrays.asList(
                new Person("An", 18),
                new Person("Bình", 30),
                new Person("Chi", 25),
                new Person("Dũng", 40),
                new Person("Em", 19),
                new Person("Giang", 20)
        );

        // 3. Xử lý stream
        List<String> names = people.stream()
                // Lọc ra những người có tuổi ≥ 20
                .filter(p -> p.getAge() >= 20)

                // Sắp xếp theo tuổi giảm dần
                // Comparator.comparingInt(Person::getAge) -> sắp xếp tăng dần
                // .reversed() -> đảo ngược lại thành giảm dần
                .sorted(Comparator.comparingInt(Person::getAge).reversed())

                // Lấy danh sách tên của những người đó
                .map(Person::getName) // Chuyển từ Stream<Person> thành Stream<String>

                // Thu thập kết quả
                .collect(Collectors.toList());

        // 4. In kết quả
        System.out.println("Kết quả:");
        System.out.println(names); // [Dũng, Bình, Chi, Giang]
    }
}
