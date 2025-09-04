package baitapbuoi4;

public class MainBuoi4 {
    public static void main(String[] args) {
        StudentBuoi4 student = new StudentBuoi4(1117676,"Nguyen Van A",10);

        System.out.println("thong tin goc: ");
        student.displayInfo();

        student.setScore(9.5);
        System.out.println("diem sau khi sua: ");
        student.displayInfo();

        student.reset();
        System.out.println("sau khi reset: ");
        student.displayInfo();
    }
}
