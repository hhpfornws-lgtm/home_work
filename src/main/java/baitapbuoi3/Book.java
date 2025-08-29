package baitapbuoi3;

public class Book {
    String title;
    String author;
    Double price;

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Book Information:" + title + "," + author + "," + price);
    }
}
