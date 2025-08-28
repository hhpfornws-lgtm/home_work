package baitapbuoi3;

import java.util.Scanner;

public class BaiTapVeNhaMain {
    public static void main (String[] args) {
        BaiTapVeNha hs1 = new BaiTapVeNha("S010", "Nguyen Van A", 22, 9, 9, 8);
        hs1.nhapThongTinHS();

        double tb = hs1.tinhDiemTrungBinh();
        System.out.println("diem trung binh: " + tb);

        String xeploai = hs1.Xeploai();
        System.out.println("xep loai: " + xeploai);
    }
}
