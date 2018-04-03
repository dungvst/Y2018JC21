package HOANGDV.OOP.LOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student1 = new Student();
//		student1.setMaSV("sv01");
//		student1.setFullName("Hoàng Văn Thanh");
//		student1.setEmail("abc@gmail.com");
//		student1.setPhone("123456789");
//		
//		Student student2 = new Student("sv02", "Phạm Thùy Linh", "abc@gmail.com", "0123456789");
//		Student student3 = new Student("sv03", "Trần Văn Hiếu", "abc@gmail.com", "0123456789");
//		Student student4 = new Student("sv04", "Nguyễn Văn Hùng", "abc@gmail.com", "0123456789");
//		
//		student1.setEmail("thanhhv@gmail.com");
//		student2.setEmail("linhptt");
//		student3.setEmail("hieutv@gmail.com");
//		student4.setEmail("hungnv@gmail.com");
//		
//		student1.setPhone("0988 123456");
//		student2.setPhone("0977 123456");
//		student3.setPhone("0966 123456");
//		student4.setPhone("0944 123456");
//		
//		System.out.println("Thông tin sinh viên");
//		
//		student1.display();
//		student2.display();
//		student3.display();
//		student4.display();

		System.out.println("Nhập thông tin 2 sản phẩm");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhập tên sp 1: ");
		String ten1 = scan.nextLine();
		System.out.println("Nhập giá sp 1: ");
		double gia1 = scan.nextDouble();
		System.out.println("Nhập giảm giá sp 1: ");
		double giamGia1 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Nhập tên sp 2: ");
		String ten2 = scan.nextLine();
		System.out.println("Nhập giá sp 2: ");
		double gia2 = scan.nextDouble();
		System.out.println("Nhập giảm giá sp 2: ");
		double giamGia2 = scan.nextDouble();
		
		System.out.println("\n");
		SanPham sp1 = new SanPham();
		sp1.setTen(ten1);
		sp1.setGia(gia1);
		sp1.setGiamGia(giamGia1);
		System.out.println("Sản phẩm một");
		sp1.in();
		
		System.out.println("\n");
		SanPham sp2 = new SanPham();
		sp2.setTen(ten2);
		sp2.setGia(gia2);
		sp2.setGiamGia(giamGia2);
		System.out.println("Sản phẩm hai");
		sp2.in();

		System.out.println("\n");
		SanPham sp3 = new SanPham(ten1,gia1);
		System.out.println("Sản phẩm ba");
		sp3.in();
		
		System.out.println("\n");
		SanPham sp4 = new SanPham(ten2,gia2,giamGia2);
		System.out.println("Sản phẩm bốn");
		sp4.in();
		
		scan.close();
	}

}
