package DEMO.basic;

public class Student {
    private String maSv;
    private String fullName;
    private String email;
    private String phone;

    public Student(){
        System.out.println("Constructor mặc định");
    }
    public Student(String maSv, String fullName, String email, String phone) {
        this.maSv = maSv;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }

    public Student(String maSv, String fullName, String email) {
        this.maSv = maSv;
        this.fullName = fullName;
        this.email = email;
    }

    public Student(String maSv) {
        this.maSv = maSv;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display(){
        System.out.println("Mã SV: "+ maSv);
        System.out.println("Tên: "+ fullName);
        System.out.println("Email: "+ email);
        System.out.println("Phone: "+ phone);
    }
}
