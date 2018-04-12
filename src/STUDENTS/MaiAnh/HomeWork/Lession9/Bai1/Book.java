package STUDENTS.MaiAnh.HomeWork.Lession9.Bai1;

public class Book extends Material {
    private String author;

    public Book(){
        super();
    }

    public Book(String name, boolean isAvailable, String borrowedDate, String author) {
        super(name, isAvailable, borrowedDate);
        super.setType("Book");
        this.author = author;
    }

    public String toString(){
        return getType() + ":\t" + getName() + "\t by: " + getAuthor() + "\t Available: " + isAvailable()+ "\t Borrowed Date: " + getBorrowedDate();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
