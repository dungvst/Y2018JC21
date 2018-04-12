package STUDENTS.MaiAnh.HomeWork.Lession9.Bai1;

public class Newspaper extends Material {
    private String publisher;

    public Newspaper(){
        super();
    }

    public Newspaper(String name, boolean isAvailable, String borrowedDate, String publisher) {
        super(name, isAvailable, borrowedDate);
        super.setType("Newspaper");
        this.publisher = publisher;
    }

    public String toString(){
        return getType() + ":\t" + getName() + "\t By:" + getPublisher() + "\t Available: " + isAvailable() + "\t BorrowDate: " + getBorrowedDate();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
