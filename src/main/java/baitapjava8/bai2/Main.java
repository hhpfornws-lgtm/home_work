package baitapjava8.bai2;

public class Main {
    public static void main(String[] args) {
        // Lambda cho từng phép toán
        MathOperation cong = (a, b) -> a + b;
        MathOperation tru = (a, b) -> a - b;
        MathOperation nhan = (a, b) -> a * b;
        MathOperation chia = (a, b) -> {
            if (b == 0) {
                System.out.println("Không thể chia cho 0!");
                return 0;
            }
            return a / b;
        };

        // In kết quả
        System.out.println("5 + 3 = " + cong.operate(5, 3));
        System.out.println("5 - 3 = " + tru.operate(5, 3));
        System.out.println("5 * 3 = " + nhan.operate(5, 3));
        System.out.println("6 / 3 = " + chia.operate(6, 3));

    }
}
