package baitapjava8.bai1;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();

        logger.logInfo("Ứng dụng khởi động.");
        logger.logError("Không thể kết nối cơ sở dữ liệu!");
        logger.logWarning("Dung lượng bộ nhớ thấp");

        System.out.println("Ghi log xong!");
    }
}
