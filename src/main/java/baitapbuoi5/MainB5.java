package baitapbuoi5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB5 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(); // danh sách sinh viên
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị sinh viên");
            System.out.println("3. Xóa sinh viên theo ID");
            System.out.println("4. Cập nhật điểm theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // đọc bỏ dòng thừa sau nextInt()

            switch (choice) {
                case 1: // thêm sinh viên
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // bỏ dòng thừa
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập điểm: ");
                    double score = scanner.nextDouble();

                    students.add(new Student(id, name, score));
                    System.out.println("==> Đã thêm sinh viên thành công!");
                    break;

                case 2: // hiển thị sinh viên
                    if (students.isEmpty()) {
                        System.out.println("Chưa có sinh viên nào.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s); // tự động gọi s.toString()
                        }
                    }
                    break;

                case 3: //Xoa sinh vien theo ID
                    System.out.println("Nhập ID sinh viên cần xóa: ");
                    int deleteID = scanner.nextInt();
                    boolean foundDelete = false;
                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).getId() == deleteID) {
                            students.remove(i);
                            System.out.println("Đã xóa sinh viên có ID " + deleteID);
                            foundDelete = true;
                            if (!foundDelete){
                                System.out.println("Không tìm thấy sinh viên");
                            }
                            break;
                        }

                    }

                case 4: //Cập nhật điểm theo ID
                    System.out.println("Nhập ID sinh viên cần cập nhật: ");
                    int updateID = scanner.nextInt();
                    boolean foundUpdate = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId() == updateID) {
                            System.out.println("Nhập điểm mới: ");
                            double newscore = scanner.nextDouble();
                            students.get(i).setScore(newscore);

                            System.out.println("==> Đã update điểm của sinh viên có ID: " + updateID);


                    }
                }
                    break;

                case 5: //Thoát chương trình
                    System.out.println("Thoát chương trình");

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
            while (choice != 5) ;
            scanner.close();

        }
    }

