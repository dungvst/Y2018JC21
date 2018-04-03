package STUDENTS.DoKhacTu;

public class Student {
	private String maSv;
	private String fullName;
	private String email;
	private String phone;

	public Student() {
		System.out.println("contruc mac dinh");
	}

	public Student(String maSv, String fullName, String email, String phone) {
		super();
		this.maSv = maSv;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
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

	public void display()
	{
		System.out.println("Thong tin sinh viên 1");
		System.out.println("Ma sv :" + maSv);
		System.out.println("Ten :" + fullName);
		System.out.println("Email :" + email);
		System.out.println("Phone :" + phone);
		System.out.println("Thong tin sinh viên 2");
		System.out.println("Ma sv :" + maSv);
		System.out.println("Ten :" + fullName);
		System.out.println("Email :" + email);
		System.out.println("Phone :" + phone);
		System.out.println("Thong tin sinh viên 3");
		System.out.println("Ma sv :" + maSv);
		System.out.println("Ten :" + fullName);
		System.out.println("Email :" + email);
		System.out.println("Phone :" + phone);
		System.out.println("Thong tin sinh viên 4");
		System.out.println("Ma sv :" + maSv);
		System.out.println("Ten :" + fullName);
		System.out.println("Email :" + email);
		System.out.println("Phone :" + phone);


	}
}
