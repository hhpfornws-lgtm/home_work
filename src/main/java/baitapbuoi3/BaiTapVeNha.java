package baitapbuoi3;

public class BaiTapVeNha {
    String maHS;
    String tenHS;
    int tuoi;
    double diemToan;
    double diemLy;
    double diemHoa;

    public BaiTapVeNha(String maHS, String tenHS, int tuoi, double diemToan, double diemLy, double diemHoa) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhapThongTinHS(){
        System.out.println("ma hs: " + maHS);
        System.out.println("ten hs: " + tenHS);
        System.out.println("tuoi: " + tuoi);
        System.out.println("diem toan: " + diemToan);
        System.out.println("diem ly: " + diemLy);
        System.out.println("diem hoa: " + diemHoa);
    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemHoa + diemLy) / 3.0;
    }

    public String Xeploai() {
        double tb = tinhDiemTrungBinh();
        if (tb >= 8) {
            return "Gioi";
        }
        else if (tb >= 6.5) {
            return "Kha";
        }
        else if (tb >= 5) {
            return "Trung binh";
        }
        else {
            return "Yeu";
        }
    }
}
