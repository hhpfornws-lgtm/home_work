package baitapjava8streamApi.bai7;

public class Person {
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
