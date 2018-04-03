package DEMO.oop.inheritances.inheritance;

public class BizStudent extends Student {
    public double diemKeToan;
    public double diemMarketing;
    public double diemBanHang;


    double tinhDiemTb() {
        return (diemBanHang + diemKeToan + diemMarketing)/3;
    }

    public BizStudent(double diemKeToan, double diemMarketing, double diemBanHang) {
        this.diemKeToan = diemKeToan;
        this.diemMarketing = diemMarketing;
        this.diemBanHang = diemBanHang;
    }
}
