/**
 * 
 */
package Phamduydieu.QuanLySV;

import java.util.Scanner;

/**
 * @author Duy Diệu
 *
 */
public class Main {

	private static final String Student2 = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Student student1 = new Student();
		student1.setMaSv("SV01");
		student1.setFullName("Hoàng Văn Thanh");
		student1.setEmail("abc@gmail.com");
		student1.setPhone("123456789");*/
		Student student2 = new Student("mã sv","Phạm duy diệu","Phamduydieu@gmail.com","0988691196");
		Student student3 = new Student("SV03","Phạm thị thùy linh","abd@gmail.com","123456");
		Student student4 = new Student("SV04","Lưu Quang Đoàn","abd@gmail.com","123456");
		Student student5 = new Student("SV05","Hoàng Đại Hiệp","abd@gmail.com","123456");
		System.out.println("Thông tin sinh viên 1");
		System.out.println("Mã SV"+ student2.getMaSv());
		System.out.println("Tên sinh viên"+student2.getFullName());
		System.out.println("Email: "+ student2.getEmail());
		System.out.println("Số điện thoại: "+student2.getPhone());
// Khi sử dụng funsition ở class Student khi muốn in ra ta chỉ việc gõ như sau.
		student3.setEmail("Phamduydieu1989@gmail.com");
		student3.setPhone("0988.691.196");
		student3.display();
		
	}

}
