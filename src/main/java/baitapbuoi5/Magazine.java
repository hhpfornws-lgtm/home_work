package baitapbuoi5;

public class Magazine extends Document {
    private int soPhatHanh;
    private int thangPhatHanh;

    //Constructor

    public Magazine(double ID, String name, int soPhatHanh, int thangPhatHanh) {
        super(ID, name);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    //Getter & Setter

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    //

    @Override
    public String toString() {
        return "Magazine{" +
                "ID=" + super.getID() +
                "Name=" + super.getName() +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
