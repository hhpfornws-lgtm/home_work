package baitapjava8.bai1;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        try {
            // Mở file log.txt, chế độ append = true để ghi tiếp vào cuối file
            FileWriter writer = new FileWriter("log.txt", true);

            // Ghi message + xuống dòng
            writer.write(message + "\n");

            // Đóng file để lưu thay đổi
            writer.close();

        } catch (IOException e) {
            // Nếu có lỗi khi ghi file, in ra màn hình
            System.out.println("Lỗi khi ghi log: " + e.getMessage());
        }
    }
}
