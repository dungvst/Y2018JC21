package DEMO.oop.inheritances.inheritance;

public class ITStudent extends Student{
    public double diemJava;
    public double diemCss;

    @Override
    double tinhDiemTb() {
        return (2 * diemJava + diemCss)/3;
    }

    public ITStudent(double diemJava, double diemCss) {
        this.diemJava = diemJava;
        this.diemCss = diemCss;
    }
}
