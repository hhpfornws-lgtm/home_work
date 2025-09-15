package baitapbuoi5;

public class Document {
    private double ID;
    private String Name;

    //Constructor

    public Document(double ID, String name) {
        this.ID = ID;
        Name = name;
    }

    //Getter & Setter

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    //

    @Override
    public String toString() {
        return "Document{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }
}
