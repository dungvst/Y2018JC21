package STUDENTS.Tien.B5;

public class sanpham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Main sp1=new Main();
	System.out.println("nhap du lieu san pham 1 : ");
	System.out.println ("       ");
	sp1.nhapdulieu();
	sp1.xuat();
	Main sp2=new Main();
	System.out.println("nhap du lieu san pham 2 : ");
	System.out.println ("       ");
	sp2.nhapdulieu();
	sp2.xuat();
	
	Main sp3=new Main("sp3",100);
	sp3.xuat();
	
	Main sp4=new Main("sp4",100,20);
	sp4.xuat();
	}
}
