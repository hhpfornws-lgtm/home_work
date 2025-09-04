package baitapbuoi4;

public class StudentBuoi4 {
    private int id;
    private String name;
    private double score;

    public StudentBuoi4(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void displayInfo () {
    System.out.println("ID: "+id);
    System.out.println("Name: "+name);
    System.out.println("Score: "+score);
    }

    public void reset() {
        this.id = 0;
        this.name = "";
        this.score = 0.0;
    }
}
