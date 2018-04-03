package DEMO.oop.inheritances.inheritance;

public class Main {
    public static void main(String[] args) {
        ITStudent itStudent = new ITStudent(7, 8);
        BizStudent bizStudent = new BizStudent(7,8,9);
        System.out.println("Điểm TB sinh viên IT: "+ itStudent.tinhDiemTb());
        System.out.println("Điểm TB sinh viên Biz: "+ bizStudent.tinhDiemTb());
    }
}
