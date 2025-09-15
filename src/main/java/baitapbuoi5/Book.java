package baitapbuoi5;

public class Book extends Document {
    private String tacGia;
    private int namSuatBan;

    //Constructor

    public Book(int ID, String name, String tacGia, int namSuatBan) {
        super(ID, name);
        this.tacGia = tacGia;
        this.namSuatBan = namSuatBan;
    }

    //Getter & Setter

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getNamSuatBan() {
        return namSuatBan;
    }

    public void setNamSuatBan(int namSuatBan) {
        this.namSuatBan = namSuatBan;
    }

    //

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + super.getID() +
                "Name=" + super.getName() +
                "tacGia='" + tacGia + '\'' +
                ", namSuatBan=" + namSuatBan +
                '}';
    }
}
