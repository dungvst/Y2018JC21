package DEMO.oop.inheritances.inheritance;

abstract public class Student {
    private String hoTen;
    abstract double tinhDiemTb();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
