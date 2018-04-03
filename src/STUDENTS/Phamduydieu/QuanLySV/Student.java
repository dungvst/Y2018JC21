package Phamduydieu.QuanLySV;

	public class Student{
		private String maSv;
		private String fullName;
		private String email;
		private String phone;
// Để tạo ra đoạn mã dưới kích chuột phải vào Soure -> ganela getter
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
/*
 Contruster là hà khởi tạo. Nó có 2 loại: Contructer không có tham số và loại có tham số.
 Đặc điểm của Contruster là tên trùng với tên class.
 Ưu điểm của hàm contruster là khi mình đã tạo nên hàm contruster thì khi mình set studen không phải thao tác nhiều lệnh nữa.
 Ví dụ: 		Student student1 = new Student();
		student1.setMaSv("SV01");
		student1.setFullName("Hoàng Văn Thanh");
		student1.setEmail("abc@gmail.com");
		student1.setPhone("123456789");
	Tương đương với:
				Student student2 = new Student("mã sv","Phạm duy diệu","Phamduydieu@gmail.com","0988691196");
 */
			
		}
// Hàm Contruster: Hàm khởi tạo.
		public Student(String maSv, String fullName, String email, String phone) {
			super();
			this.maSv = maSv;
			this.fullName = fullName;
			this.email = email;
			this.phone = phone;
		}
// Funsition
		public void display() {
			System.out.println("Thông tin sinh viên 1");
			System.out.println("Mã SV: "+ maSv);
			System.out.println("Tên sinh viên: "+fullName);
			System.out.println("Email: "+ email);
			System.out.println("Số điện thoại: "+phone);
		}		
	}
