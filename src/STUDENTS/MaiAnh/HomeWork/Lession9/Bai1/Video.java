package STUDENTS.MaiAnh.HomeWork.Lession9.Bai1;

public class Video extends Material{
    private int minutes;

    public Video(){
        super();
    }

    public Video(String name, boolean isAvailable, String borrowedDate, int minutes) {
        super(name, isAvailable, borrowedDate);
        super.setType("Video");
        this.minutes = minutes;
    }

    public String toString(){
        return getType() + ":\t" + getName()+ "\t" + getMinutes() + "min \t Available:" + isAvailable() + "\t Borrowed Date: " + getBorrowedDate();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
