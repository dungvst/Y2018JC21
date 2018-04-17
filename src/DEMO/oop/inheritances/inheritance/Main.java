package DEMO.oop.inheritances.inheritance;

public class Main {
    public static void main(String[] args) {
        Student itStudent = new ITStudent(7, 8);
        System.out.println("Sinh viên: "+ itStudent.getHoTen());
        System.out.println("Điểm TB sinh viên IT: "+ itStudent.tinhDiemTb());

        Student bizStudent = new BizStudent(7,8,9);
        System.out.println("Sinh viên: "+ bizStudent.getHoTen());
        System.out.println("Điểm TB sinh viên Biz: "+ bizStudent.tinhDiemTb());
    }
}
