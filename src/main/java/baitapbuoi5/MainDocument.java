package baitapbuoi5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDocument {

        public static void main(String[] args) {
            ArrayList<Document> document = new ArrayList<>(); // danh sách sinh viên
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("===== MENU QUẢN LÝ DOCUMENT =====");
                System.out.println("1. Thêm sách");
                System.out.println("2. Thêm tạp chí");
                System.out.println("3. Xóa tài liệu theo ID");
                System.out.println("4. Tìm kiếm tài liệu theo tên");
                System.out.println("5. Hiển thị tất cả tài liệu");
                System.out.println("0. Thoát chương trình");
                System.out.print("Chọn chức năng: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // đọc bỏ dòng thừa sau nextInt()

                switch (choice) {
                    case 1: // Thêm sách
                        System.out.print("Nhập ID: ");
                        int bookId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhập tên sách: ");
                        String bookName = scanner.nextLine();
                        System.out.print("Nhập tác giả: ");
                        String author = scanner.nextLine();
                        System.out.print("Nhập năm xuất bản: ");
                        int year = scanner.nextInt();
                        document.add(new Book(bookId, bookName, author, year));
                        System.out.println("==> Đã thêm sách!");
                        break;

                    case 2: //Them tap chi
                        System.out.print("Nhập ID: ");
                        int magId = scanner.nextInt();
                        System.out.print("Nhập tên tạp chí: ");
                        String magName = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Nhập số phát hành: ");
                        int issue = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhập tháng phát hành: ");
                        int month = scanner.nextInt();
                        document.add(new Magazine(magId, magName, issue, month));
                        System.out.println("==> Đã thêm tạp chí!");
                        break;

                    case 3: //Xóa tài liệu theo ID
                        System.out.println("Nhập ID tài liệu cần xóa: ");
                        int deleteID = scanner.nextInt();
                        boolean foundDelete = false;
                        for (int i = 0; i < document.size(); i++) {

                            if (document.get(i).getID() == deleteID) {
                                document.remove(i);
                                System.out.println("Đã xóa tài liệu có ID " + deleteID);
                                foundDelete = true;

                                break;
                            }
                            if (!foundDelete) {
                                System.out.println("Không tìm thấy tài liệu");
                            }
                        }
                        break;

                    case 4: //Tìm kiếm tài liệu theo tên
                        System.out.println("Nhập tên tài liệu cần tìm: ");
                        String searchName = scanner.nextLine();
                        boolean found = false;
                        for (Document doc : document) {
                            if (doc.getName().trim().equals(searchName.trim())) {
                                doc.toString();
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Không tìm thấy tài liệu có tên: " + searchName);
                        }
                        break;

                    case 5: //Hiển thị tất cả tài liệu
                        if (document.isEmpty()) {
                            System.out.println("Chưa có tài liệu nào.");
                        } else {
                            for (Document doc : document) {
                                System.out.println(doc); //
                            }
                        }
                        break;

                    case 0: //Thoát chương trình
                        System.exit(0);

                }
            }
            while (true) ;
        }
    }


