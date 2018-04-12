package STUDENTS.MaiAnh.HomeWork.Lession9.Bai1;

public class Material {
    private String name;
    private boolean isAvailable;
    private String borrowedDate;
    private String BORDATE = "Has not been borrowed";
    private String type;

    public Material(){

    }

    public Material(String name, boolean isAvailable, String borrowedDate) {
        this.name = name;
        this.isAvailable = isAvailable;
        setBorrowedDate(borrowedDate);
        this.borrowedDate = getBorrowedDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(String borrowedDate) {
        if(isAvailable){
            this.borrowedDate = BORDATE;
        }else {
            this.borrowedDate = borrowedDate;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
