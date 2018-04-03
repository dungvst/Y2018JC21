package Phamduydieu.SanPham;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sanPham1 = new SanPham("Bếp than tổ ong",50000,5000);
		SanPham sanPham2 = new SanPham("Dép tổ ong",28000,3600);
		SanPham sanPham3 = new SanPham("Nồi cơm điện",75000,2800);
		sanPham1.HienThi();
		sanPham2.HienThi();
		sanPham3.HienThi();
	}

}
