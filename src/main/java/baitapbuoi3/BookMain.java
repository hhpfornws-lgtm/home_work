package baitapbuoi3;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Cay cam ngot cua toi", "Jose Mauro de Vansconcelos", 100000.0);
        book1.showInfo();
        Book book2 = new Book("Call me by your name", "Andre Aciman", 300000.0);
        book2.showInfo();
        Book book3 = new Book("the sun and her flowers", "kaur", 200000.0);
        book3.showInfo();
    }
}
