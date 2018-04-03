package HOANGDV.OOP.LOP;

public class Student {
	private String maSV;
	private String fullName;
	private String email;
	private String phone;

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getFullName() {
		return fullName;
	}


	public Student() {
		System.out.println("Constructor mặc định");
	}

	public Student(String maSV, String fullName, String email, String phone) {
		this.maSV = maSV;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
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
	
	public void display() {
		System.out.println("Mã SV: "+getMaSV());
		System.out.println("Tên SV: "+getFullName());
		System.out.println("Email SV: "+getEmail());
		System.out.println("Phone SV: "+getPhone());
	}

}
